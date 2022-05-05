frase = input("Digite uma frase: ")\

frase = frase.replace(" ","")

if str(frase) == "".join(reversed(frase)) :
    print("\033[34mEsta frase é palíndroma")
else:
    print("\033[91mEsta frase não é palíndroma")