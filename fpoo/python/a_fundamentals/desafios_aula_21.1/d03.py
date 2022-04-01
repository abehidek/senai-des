import random

tup = tuple()
def appendToTuple(tup, num):
    arr = list(tup)
    arr.append(num)
    return tuple(arr)

for i in range (0,5):
    tup = appendToTuple(tup, random.randint(1,10))

print('-' * 16)
print(tup)
print('Maior número: ',max(tup))
print('Menor dúvida: ',min(tup))