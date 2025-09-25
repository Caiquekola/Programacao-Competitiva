class Node:
    def __init__(self):
        self.filhos = []
    
    def check(self, tamanho_lista, altura):
        if(tamanho_lista != len(self.filhos)):
            for n in self.filhos:
                if(n == None): return None
                a = n.check(tamanho_lista, altura+1)
                
                    
