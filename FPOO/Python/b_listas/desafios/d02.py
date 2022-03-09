import d01b
arr = [] # DATA INPUT
while (True):
    num = int(input("Digite um numero: "))
    if num in arr:
        print("Numero ja existe na lista")
    else:
        arr.append(num)
        c = input("Deseja continuar [S/N]: ")
        if c.upper() == "N":
            break

print(d01b.bubbleSort(arr))