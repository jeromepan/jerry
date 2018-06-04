import numpy as np
import csv


class Prepare_work(object):

    def __init__(self, alpha=1.0, fit_prior=True, class_prior=None):
        self.alpha = alpha
        self.fit_prior = fit_prior
        self.Pclass = class_prior
        self.Tclass = None
        self.conditional_prob = None

    #def _find_musigam(self, musigmalist):
      #  values = np.unique(musigmalist)
     #   total_num = float(len(musigmalist))
     #   value_prob = {}
   #     for v in values:
  #          value_prob[v] = ((np.sum(np.equal(musigmalist, v)) + self.alpha) /
  #                           (total_num + len(values) * self.alpha))
   #     return value_prob

    def fit(self, X, y):

        #这个function is for 计算 固定概率 比如男女 为 1/2 或者硬币 class_num  是样本的总数， 所以在硬币中 便是2， 在计算成绩的时候是 n 比如5.
        #def unique(ar, return_index=False, return_inverse=False,return_counts=False, axis=None):
        #Find the unique elements of an array.

        self.Tclass = np.unique(y)
        # calculate class prior probabilities: P(y=ck)
        if self.Pclass == None:
            class_num = len(self.Tclass)
            if not self.fit_prior:
                self.Pclass = [1.0 / class_num for _ in range(class_num)]  # uniform prior 计算
            else:
                self.Pclass = []
                sample_num = float(len(y))
                for c in self.Tclass:
                    c_num = np.sum(np.equal(y, c))
                    self.Pclass.append(
                        (c_num + self.alpha) / (sample_num + class_num * self.alpha))

        # calculate Conditional Probability: P( xj | y=ck )
        self.conditional_prob = {}  # like { c0:{ x0:{ value0:0.2, value1:0.8 }, x1:{} }, c1:{...} }
        for c in self.Tclass:
            self.conditional_prob[c] = {}
            for i in range(len(X[0])):  # for each musigmalist
                musigmalist = X[np.equal(y, c)][:, i]
                self.conditional_prob[c][i] = self._find_musigam(musigmalist)
        return self


    def _predict_sample(self, x):
        label = -1
        max_posterior_prob = 0
        print("I want to know the number: ",len(self.Tclass))
        # for each category, calculate its posterior probability: class_prior * conditional_prob
        for c_index in range(len(self.Tclass)):
            current_class_prior = self.Pclass[c_index]
            #print(current_class_prior)
            #print()
            current_conditional_prob = 1.0
            feature_prob = self.conditional_prob[self.Tclass[c_index]]
            j = 0
            for feature_i in feature_prob.keys():
                current_conditional_prob *= self._get_result(feature_prob[feature_i], x[j])
                j += 1
            #print(current_conditional_prob)
            # compare posterior probability and update max_posterior_prob, label

            print(current_class_prior * current_conditional_prob)
            print()
            if current_class_prior * current_conditional_prob > max_posterior_prob:
                #print("&&&",max_posterior_prob, "$$$")
                max_posterior_prob = current_class_prior * current_conditional_prob
                #print(max_posterior_prob,"$$$")
                #print()
                label = self.Tclass[c_index]
        return label

    # predict samples (also single sample)
    def predict(self, X):

        if X.ndim == 1:
            return self._predict_sample(X)
        else:
            # classify each sample
            labels = []
            for i in range(X.shape[0]):
                label = self._predict_sample(X[i])
                labels.append(label)
            return labels

class GaussianBayes(Prepare_work):

    #numpy API
    #def std(a, axis=None, dtype=None, out=None, ddof=0, keepdims=np._NoValue):
    #def mean(a, axis=None, dtype=None, out=None, keepdims=np._NoValue):

    def _find_musigam(self, musigmalist):
        mu = np.mean(musigmalist)
        sigma = np.std(musigmalist)
        return (mu, sigma)

    # the probability density for the Gaussian distribution
    def _gaussian_filter(self, mu, sigma, x):
        return (1.0 / (sigma * np.sqrt(2 * np.pi)) *
                np.exp(- (x - mu) ** 2 / (2 * sigma ** 2)))

    # given mu and sigma , return Gaussian distribution probability for target_value
    def _get_result(self, mu_sigma, target_value):
        return self._gaussian_filter(mu_sigma[0], mu_sigma[1], target_value)



if __name__ == "__main__":

    def loadCsv(filename):
        lines = csv.reader(open(filename, "r"))
        dataset = list(lines)
        for i in range(len(dataset)):
            dataset[i] = [float(x) for x in dataset[i]]
        return dataset


    filename = 'wikiBook.csv'
    dataset = loadCsv(filename)
   # X= dataset


    #X = np.array([


    """
            [2.617598096, 2.799378802, 1.351278346, 1.427081149, 2.059887414, 3.573072525, 3.370856886, 2.134465132,
            2.105295449, 3.044779468, 2.621083683, 1.857829323, 2.189789923, 2.773772522, 2.689657407, 1.654334865,
            3.313150716, 2.552403435, 3.022555017, 3.075328945, 2.325253679, 3.275563121, 2.074973176, 1.402526525,
            2.818083779, 3.128893429],
            [2.211281215, 1.539067159, 1.614021988, 3.040723333, 3.138396225, 2.236296401, 2.402764616, 3.200047534,
            3.606339221, 3.75862065, 2.415427739, 2.987703399, 3.320710671, 3.041979213, 2.928479787, 2.902036848,
            3.801758329, 3.865286361, 1.128073286, 3.745208344, 2.753387893, 2.700582569, 1.373226528, 2.672134799,
            2.936116409, 1.504774554],
            [3.610002904, 2.579223445, 2.760179769, 2.139581031, 3.167675558, 1.97107408, 1.801297964, 3.276092025,
            1.721721754, 3.485694345, 3.377087462, 1.553804377, 1.531950146, 3.111099194, 3.800019803, 1.509216406,
            3.368149106, 3.823302292, 3.780060909, 2.798778388, 1.695777552, 1.189813895, 2.267845719, 1.425735623,
            1.961028171, 3.7048494],
            [2.473137865, 1.031866884, 3.364564889, 3.201581355, 2.19614788, 3.877577536, 3.229876389, 3.229976906,
            1.491941596, 3.593528625, 3.379707444, 3.486163683, 3.400967083, 2.212670078, 1.87969633, 3.979327201,
            3.148129466, 2.411353263, 3.590533296, 1.503089904, 2.418600403, 3.064559358, 2.639388788, 3.556240857,
            3.74036622, 1.83177365],
            [1.654196584, 2.596927097, 1.230633753, 3.627557882, 3.191245583, 3.500404135, 1.080149404, 3.098776333,
            2.103638022, 3.924611386, 2.212306334, 3.126918006, 1.799064726, 2.154295574, 3.878316475, 2.737312679,
            3.244251706, 3.79553642, 2.875278795, 1.200177459, 3.045913704, 2.993812399, 3.262500425, 2.476215752,
            2.836082633, 1.112846962],
            [1.766424033, 3.551140229, 1.683865698, 3.387451408, 2.113106793, 3.491948576, 2.485753124, 1.329366252,
            3.908792882, 3.326692398, 1.247736312, 1.306165735, 2.308732406, 2.55211816, 1.413120949, 2.119261833,
            2.878826265, 1.832954113, 1.59835263, 1.117727236, 3.698991743, 2.974019524, 2.533176265, 2.461440568,
            3.112494389, 2.508143857],
            [3.667368348, 1.194115798, 1.181668729, 1.097640408, 2.851298185, 1.432884947, 3.329997093, 2.472518711,
            3.923640143, 3.019753653, 2.27404341, 1.99863296, 2.627198767, 3.519934639, 2.130905434, 1.062514142,
            2.806121858, 3.508124491, 2.955012925, 3.630265869, 2.359560345, 2.441086557, 3.997988258, 2.060072746,
            3.347767798, 3.479625624],
            [2.557217096, 2.169847205, 2.730480627, 1.268448045, 3.844592098, 3.727387278, 1.816596666, 1.722548154,
            1.654456372, 1.039619821, 1.461896089, 1.37526192, 3.194769038, 2.891620038, 1.80770253, 2.721500654,
            3.727999006, 3.408131148, 2.920480971, 1.942926712, 3.104134078, 1.505048645, 1.073021688, 1.183775391,
            3.217887945, 2.864425004],
            [2.87000754, 2.621828838, 2.138847596, 3.698939849, 1.742577039, 3.744216439, 1.592657946, 3.725882302,
            1.069072833, 3.934602573, 1.343411417, 2.211058295, 1.152865346, 2.868102057, 2.388469384, 3.75844152,
            3.161297389, 3.577437133, 1.516687667, 3.370918915, 1.826957368, 2.689462926, 2.118952641, 3.926213724,
            2.597088705, 1.612794113],
            [2.827903343, 1.715677586, 2.448806599, 3.361908121, 1.790326094, 2.927013988, 3.914478759, 3.599076872,
            1.625482587, 3.213978805, 3.491123313, 3.795191085, 2.573511361, 1.886120781, 2.559365901, 3.030742177,
            1.431596337, 2.454467379, 1.739883591, 2.951765496, 3.291052901, 3.771567829, 3.748709386, 1.368114096,
            3.095547179, 2.005317986]
            """

    #2.625513702, 2.179907304, 2.050434799, 2.625091258, 2.609525287, 3.048187591, 2.502442885, 2.778875022, 2.321038086, 3.234188172, 2.38238232, 2.369872878, 2.409955947, 2.701171226, 2.5475734, 2.547468832, 3.088128018, 3.122899603, 2.512691909, 2.533618727, 2.651962967, 2.660551682, 2.508978287, 2.253247008, 2.966246323, 2.375344458


    X = np.array([
                        [6, 5.92, 5.58,5.92,5,5.5,5.42,5.75],
                        [180,190,170,165,100,150,130,150],
                        [12,11,12,10,6,8,7,9]
                              ])

    X = X.T
    y = np.array([1,1,1,1,2,2,2,2])
    #y = np.array([2,3,3,2,2,1,2,2,2,1,3,2,2,2,2,2,2,1,1,2,2,2,2,1,2,1])


    nb1 = GaussianBayes(alpha=0.0)
    nb1.fit(X,y)
    print(nb1.alpha)
    print(nb1.Pclass)
    print(nb1.Tclass)
    print(nb1.conditional_prob)
    print(nb1.predict(np.array([6,130,8])))
    #print(nb1.predict(np.array([3.2,2.1,2.0,1.7,3.5,2.5,2.2,2.8,2.5,2.1])))
    #print (nb1.fit(X,y).predict(X))
