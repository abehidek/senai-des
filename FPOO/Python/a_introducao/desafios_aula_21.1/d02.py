times = ('PSG', 'Hawwaian', 'Framengo', 'Atlético', 'Ponte Preta Macaca Atomica',
         'Inter', 'Botafogo', 'Chapecoence', 'Corinthians', 'Santos',
         'Bahia', 'São Paulo', 'Ceará SC', 'Fortaleza', 'Vasco da Gama',
         'Cruzeiro', 'Fluminense', 'Goias', 'Quinze de Jau', 'Gremio')

print('-----------------------------------------')
print(f'5 primeiros da tabela: {times[0:5]} \n')
print('-----------------------------------------')
print(f'4 ultimos da tabela: {times[-4:]} \n')
print('-----------------------------------------')
print(f'Times em ordem alfabetica: {sorted(times)}')
print('-----------------------------------------')
print(f'Chapecoense esta na {times.index("Chapecoence")+1} posicao')