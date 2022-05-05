n = int(input("Digite o número de termos da sequência: "))
i, x, y = 0,0,1
while(i < n):
    print(x)
    z = x + y
    x = y
    y = z
    i+=1
