palavras = ("Batata", "Desafio", "Livro", "Mesa")

for palavra in palavras:
    chars = list(palavra)
    print(f'A palavra {palavra} tem as vogais :', end=' ')
    for char in chars:
        if char == 'a':
            print('a', end=' ')
        if char == 'e':
            print('e', end=' ')
        if char == 'i':
            print('i', end=' ')
        if char == 'o':
            print('o', end=' ')
        if char == 'u':
            print('u', end=' ')
    print("\n")