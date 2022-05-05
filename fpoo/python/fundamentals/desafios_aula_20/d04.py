class divisivel:
    div = '\033[34m'
    Ndiv = '\033[91m'


numero = int(input("Digite um numero: "))

if numero % 2 == 0 or numero % 3 == 0 or numero % 5 == 0 or numero % 7 == 0:
    print("Este numero não é primo")

else:
    print("Este numero é primo")

for i in range(1, numero + 1):

    if numero % i == 0:
        print(divisivel.div + str(i), end=" ")

    else:
        print(divisivel.Ndiv + str(i), end=" ")
