# VERIFY IF INDEX EXISTS IN LIST
def index_in_list(list, index):
    return (index < len(list))
def bubbleSort(arr):
    for n in range(len(arr)-1,0,-1):
        for i in range(n):
            if arr[i] > arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
    return arr
def bubbleSort2(arr):
    n=0
    while (n < len(arr)):
        for i, value in enumerate(arr):
            if (index_in_list(arr, i+1) and arr[i] > arr[i+1]):
                aux = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = aux;
        n += 1
    return arr
arr = [] # DATA INPUT
for i in range(0,5):
    arr.append(int(input("Digite um numero: ")))

print('Lista-Sorteada: ',bubbleSort2(arr))
print('Lista-Sorteada-2:', bubbleSort(arr))

print(f'Menor número: {arr[0]}')
print(f'Maior número: {arr[len(arr)-1]}')