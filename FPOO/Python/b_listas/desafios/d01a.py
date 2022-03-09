from operator import index
arr = list()
for i in range(0,5):
    arr.append(int(input("Digite um numero: ")))
print(f'Maior numero: {max(arr)}, indice: {arr.index(max(arr))}')
print(f'Maior numero: {min(arr)}, indice: {arr.index(min(arr))}')