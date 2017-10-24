import null as null

n = (int)(input())
k = (int)(input())

array=[[0]*(2) for i in range(30)]
#f=[ ([0]*60) for i in range(2) ]
#print (f)
#print (array)
array[1][0] = k-1
array[1][1]= 0

for i in range(2,n+1):
    array[i][0] = (array[i-1][0] + array[i-1][1]) * (k-1)
    #print(array[i][0])
    array[i][1] = array[i-1][0]
   # print(array[i][1])

print(array[n][0] + array[n][1])

