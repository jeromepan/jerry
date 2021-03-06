def gcd(m,n):
    while m % n != 0:
        old_m = m
        old_n = n

        m = old_n
        n = old_m % old_n
    return n


class Fraction:
    def __init__(self,top,bottom):

        self.num = top
        self.den = bottom

    def show(self):
        print(self.num, "/", self.den)

    def __str__(self):
        return str(self.num) + "/" + str(self.den)

    def __add__(self, other):
        new_num = self.num * other.den + self.den*other.num
        new_den = self.den * other.den

        common = gcd(new_num,new_den)
        return Fraction(new_num // common, new_num // common)

    def __eq__(self, other):
        first_num = self.num * other.den
        second_num = other.num * self.den

        return first_num == second_num


f1= Fraction(1,4)
f2 = Fraction(1,2)
print(f1 + f2)
print(f1 == f2)
