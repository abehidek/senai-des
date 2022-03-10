saque = int(input("Digite o valor a ser sacado: "))
print("Notas de 50: ", saque // 50)
saque = saque % 50
print("Notas de 20: ", saque // 20)
saque = saque % 20
print("Notas de 10: ", saque // 10)
saque = saque % 10
print("Notas de 1: ", saque // 1)