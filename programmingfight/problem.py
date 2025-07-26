n = int(input())
cordilheiras = list(map(int, input().split()))
troca = True
while troca:
    troca = False
    for i in range(n):
        esquerda = cordilheiras[(i-1)%n]
        direita = cordilheiras[(i+1)%n]
        maxPermitido = min(esquerda, direita) + 1
        if cordilheiras[i] > maxPermitido:
            cordilheiras[i] = maxPermitido
            troca = True


print(max(cordilheiras))