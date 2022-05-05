s = 0

for i in range(6):
    n = int(input(f'Digite o {i + 1}° numero:'))

    if n % 2 == 0:
        s += n

print(f'a soma dos numeros pares é: {s}')
