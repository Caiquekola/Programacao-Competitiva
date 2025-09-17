n = int(input())
guerreiros = []
alianca= -1
g = input()
for i in range(n):
    guerreiros.append(int(g.split()[i]))
    guerreiros = sorted(guerreiros, reverse=True)
    if(guerreiros[0] == guerreiros[1]):
        for i in range(n-1):
            if((guerreiros[i] + guerreiros[i+1]) > guerreiros[0]):
                alianca = guerreiros[i] + guerreiros[i+1]
    else:
        alianca = guerreiros[0]
print(alianca)