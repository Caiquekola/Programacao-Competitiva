n = int(input())

guerreiros = list(map(int, input().split()))
guerreiros.sort(reverse=True)
alianca = -1

maior = guerreiros[0]
if(guerreiros[0]==guerreiros[1]):
    for i in range(n):
        if(guerreiros[n-1-i]+guerreiros[n-i-2]>maior):
                alianca = guerreiros[n-1-i]+guerreiros[n-i-2]
                break
else:
    alianca = maior

print(alianca)