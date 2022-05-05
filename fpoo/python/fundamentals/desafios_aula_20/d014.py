cont = 1
comparator = 10

razao = int(input("Digite a razão da PA: "))
Ptermo = int(input("Digite o primeiro termo da PA: "))

while cont <= comparator:
    termo = Ptermo + (cont-1)*razao
    cont += 1

    print(termo,end=' ')

comparator = int(input("Quantos termos a mais você precisa? "))


while cont <= comparator:
    termo = Ptermo + (cont-1)*razao
    cont += 1

    print(termo,end=' ')
