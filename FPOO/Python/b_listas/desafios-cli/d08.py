def bubbleSort(arr):
    for n in range(len(arr)-1,0,-1):
        for i in range(n):
            if arr[i] > arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
    return arr

arr = [] # DATA INPUT
par = []
impar = []
while True:
    arr.append(int(input("Digite um numero: ")))
    o = input("Deseja continuar? [S/N]: ")
    if o.upper() == 'N':
        break

for item in arr:
    if item % 2 == 0:
        par.append(item)
    else:
        impar.append(item)

print('Lista: ', bubbleSort(arr))
print('Pares ordenados: ', bubbleSort(par))
print('Impares ordenados: ', bubbleSort(impar))