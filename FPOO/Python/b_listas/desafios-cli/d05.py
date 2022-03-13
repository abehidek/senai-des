arr, par, impar = [],[],[]
while True:
    arr.append(int(input("Digite um numero: ")))
    o = input("Deseja continuar? [S/N]: ")
    if o.upper() == 'N':
        break
for item in arr:
    if item % 2 == 0:
        par.append(item)
    else:
        impar.append(item)
print('Lista:', arr)
print('Pares:',par)
print('Impares:',impar)
