cont = 1
comp = 10
termo = 0
somacomp = 1

razao = int(input("Digite a razão da PA: "))
Ptermo = int(input("Digite o primeiro termo da PA: "))



while cont <= comp:
    termo = Ptermo + (cont-1)*razao
    cont += 1

    print(termo,end=' ')

