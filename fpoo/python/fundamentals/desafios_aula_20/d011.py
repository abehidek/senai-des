import sys

operation = 0

num1 = int(input("Digite o primeiro numero: "))
num2 = int(input("Digite o segundo numero: "))

while operation !=5:

    print("----------MENU----------")

    print("[1] - Somar")
    print("[2] - Multiplicar")
    print("[3] - Maior")
    print("[4] - Novos numeros")
    print("[5] - Sair do prgrama")

    print(" ")

    operation = int(input("Digite o numero da operação desejada: "))

    if operation == 1:
        print(num1 + num2)

    elif operation == 2:
        print(num1 * num2)

    elif operation == 3:
        if num1 > num2:
            print(num1)

        else:
            print(num2)

    elif operation == 5:
        sys.exit()

    elif operation == 4:
        while operation == 4:
            num1 = int(input("Digite novamente o primeiro numero: "))
            num2 = int(input("Digite novamente o segundo numero: "))

            print("----------MENU----------")

            print("[1] - Somar")
            print("[2] - Multiplicar")
            print("[3] - Maior")
            print("[4] - Novos numeros")
            print("[5] - Sair do prgrama")

            print(" ")

            operation = int(input("Digite o numero da operação desejada: "))

            if operation == 1:
                print(num1 + num2)

            elif operation == 2:
                print(num1 * num2)

            elif operation == 3:
                if num1 > num2:
                    print(num1)

                else:
                    print(num2)

            elif operation == 5:
                sys.exit()

else:
    sys.exit()