num = ('zero', 'um', 'dois', 'três', 'quatro', 'cinco', 'seis', 'sete', 'oito', 'nove', 'dez')
pos = -1
while pos < 0 or pos > 10:
    pos = int(input('Digite um número entre 0 e 10: '))
print(f'Você digitou o número {num[pos]}')