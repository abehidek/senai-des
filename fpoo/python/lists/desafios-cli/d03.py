def bubbleSort(arr):
    for n in range(len(arr)-1,0,-1):
        for i in range(n):
            if arr[i] > arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
    return arr
arr = [] # DATA INPUT
for i in range(0,5):
    arr.append(int(input("Digite um numero: ")))
print(bubbleSort(arr))
