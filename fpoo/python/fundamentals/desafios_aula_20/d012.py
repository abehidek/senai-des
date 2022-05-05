numero = int(input("Digite um numero: "))
numerosoma = 1
numerocontador = numero

for i in range(1,numero):
   numero = numero * (numerocontador-i)

print(numero)