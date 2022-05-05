import random

count = 1

guess = int(input("Digite um numero de 1 a 10: "))

number = random.randint(1,10)

while guess != number:
    count = count + 1
    print("Você errou!! Tente novamente")
    print(" ")
    guess = int(input("Digite um numero de 1 a 10: "))

else:
    print("---------------------------------------------------------")
    print(f"Parabéns!! Você acertou depois de {count} tentatitva(s)!")
    print(" ")
    print(f"A resposta era o numero {number}")