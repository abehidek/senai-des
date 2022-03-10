# Requirements
# - How many numbers
# - Descending list
# - If number 5 is in list

def inverseBubbleSort(arr):
    for n in range(len(arr)-1,0,-1):
        for i in range(n):
            if arr[i] < arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
    return arr

arr = [] # DATA INPUT
while True:
    arr.append(int(input("Digite um numero: ")))
    o = input("Deseja continuar? [S/N]: ")
    if o.upper() == 'N':
        break

print(inverseBubbleSort(arr))
try:
    print('O valor 5 exista na lista no índice ',arr.index(5))
except:
    print("Valor 5 não existe na lista")



