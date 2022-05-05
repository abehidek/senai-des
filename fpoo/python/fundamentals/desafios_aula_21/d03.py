pessoas = list()
while True:
    pessoa = list()
    pessoa.append(input('Digite o nome: '))
    pessoa.append(int(input('Digite a idade: ')))
    pessoa.append(input('Digite o sexo [H/M]: ').upper())
    pessoas.append(pessoa)
    o = input("Deseja continuar? [S/N]: ").upper()
    if o == 'N':
        break

maiores = 0
homens = 0
mulheres20anos = 0

for pessoa in pessoas:
    if pessoa[1] >= 18:
        maiores +=1
    if pessoa[2] == 'H':
        homens += 1
    else:
        if pessoa[1] < 20:
            mulheres20anos =+1
print(f'o numero de maiores: {maiores}')
print(f'o numero de homens: {homens}')
print(f'o numero de mulheres menor que 20 anos: {mulheres20anos}')