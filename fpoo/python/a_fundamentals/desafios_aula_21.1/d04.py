numero = []
while True:
    count9 = 0
    countpair = []
    numero.append(int(input('Digite o primeiro numero:')))
    numero.append(int(input('Digite o segundo numero:')))
    numero.append(int(input('Digite o terceiro numero:')))
    numero.append(int(input('Digite o quarto numero:')))
    numero.append(int(input('Digite o quinto numero:')))
    numero.append(int(input('Digite o sexto numero:')))

    for i in numero:
        if i == 9:
            count9 +=1
        if i % 2 == 0:
            countpair.append(i)
    break
try:
    print(f'o primeiro numero 3 foi digitado na posicao {numero.index(3)}')
except:
    print('nao existe numero 3')
print(f'o valor 9 apareceu {count9} vezes')
print(f'os numeros pares sao {countpair}')