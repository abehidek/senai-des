# def function():
#    print("Hello World")
# def contador(* num):
#    print(num)
#    for valor in num:
#        print(f'{valor}', end='|')
#    print("")
#
# def contador(* num):
#    tam = len(num)
#    print(f'Recebi {num} totalizando {tam} números')
# def dobra(lista):
#    pos = 0
#    while pos < len(lista):
#        lista[pos] *= 2
#        pos +=1
#
# function()
# contador(1,2,3,4,5,6)
# lista = [0,1,2,3,4,5,6]
# dobra(lista)
# print(lista)

# from time import sleep
#
# def contador(i, f, p):...
# def contador(i, f, p):
#    while(i < f):
#        sleep(1)
#        print(i, end='|')
#        i += p
#    if i<f:
#        print(i, end='|')
#        i += p
#        contador(i, f, p)
#
#
# inicio = int(input('Inicio: '))
# fim = int(input('Fim: '))
# passo = int(input('Passo:'))
#
# contador(inicio, fim, passo)


def somar(a=0, b=0, c=0):
    print(a + b + c)


somar(2)
