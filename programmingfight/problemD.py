def eh_vogal(letra):
    return letra in 'aeiou'

n_casos = int(input())


for _ in range(n_casos):
    nome = input()
    nome_valido = True

    if len(nome) >= 2:
        for i in range(1, len(nome)):
            if eh_vogal(nome[i]) == eh_vogal(nome[i - 1]):
                nome_valido = False
                break  
    else:
        nome_valido = False

    if nome_valido:
        print("YES")
    else:
        print("NO")