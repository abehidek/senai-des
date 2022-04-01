def bubbleSort(arr):
    for n in range(len(arr)-1,0,-1):
        for i in range(n):
            if arr[i] > arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
    return arr
arr = list() # DATA INPUT
while (True):
    num = int(input("Digite um numero: "))
    if num in arr:
        print("Numero ja existe na lista")
    else:
        arr.append(num)
        c = input("Deseja continuar [S/N]: ")
        if c.upper() == "N":
            break

print(bubbleSort(arr))
