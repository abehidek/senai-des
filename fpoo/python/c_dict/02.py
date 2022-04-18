# filme = {
#     'Titulo' : 'Interstelar',
#     "Autor" : "Christopher Nolan",
#     "lançamento" : '2014'
# }

# print(filme.values())
# print(filme.keys())
# print(filme.items())

# valores = [5,9,8,1,2,7,4]
# for i, v in enumerate(valores):
#     print(f'i:{i}', end=' | ')
#     print(f'v:{v}', end=' | \n')

# for i, j in filme.items():
#     print(f'i:{i}', end=' | ')
#     print(f'v:{j}', end=' | \n')

# Output
# i:Titulo | v:Interstelar |
# i:Autor | v:Christopher Nolan |
# i:lançamento | v:2014 |

# * * *

# pessoas = {
#     'nome' : 'Lindomar',
#     'sexo' : 'M',
#     'idade' : 17
# }
# print(pessoas[0])
# Output
# Traceback (most recent call last):
#   File "02.py", line 30, in <module>
#     print(pessoas[0])
# KeyError: 0

# print(f'{pessoas["nome"]} possui {pessoas["idade"]} anos')
# Output
# Lindomar possui 17 anos

# * * *

estado = dict()
brasil = list()
for i in range(2):
    estado["uf"] = input("Unidade Federativa: ")
    estado["sigla"] = input("Sigla: ")
    brasil.append(estado.copy())

# for i in range(2):
#     estado = {}
#     estado['uf'] = input('Unidade Federativa: ')
#     estado['sigla'] = input('Sigla: ')
#     brasil.append(estado)

for j in brasil:
    for k in j.values():
        print(f"{k}", end=" ")
