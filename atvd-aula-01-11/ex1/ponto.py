import pandas as pd
import matplotlib.pyplot as plt

class Ponto:
    nome = ''
    x = 0
    y = 0
    def __init__(self, nome, x, y):
        """
        Testando 123
        """
        self.nome = nome
        self.x = x
        self.y = y
        
    def __str__(self):
        return f'Olá {self.nome} seus pontos são x:{self.x} e y:{self.y}'
    
    def mostrarPontos(self):
        plt.scatter(self.x, self.y, label=self.nome, marker='.')
        plt.axhline(0, color='black',linewidth=0.5)  
        plt.axvline(0, color='black',linewidth=0.5)
        plt.grid(color = 'gray', linestyle = '--', linewidth = 0.5)
        plt.title(f'Pontos de {self.nome}')
        plt.xlabel("Eixo X")
        plt.ylabel("Eixo Y")
        plt.show()
        
    def pontosArquivo(self):        
        try:
            arquivo = open('pontos.txt', 'r')
            
            nomes = []
            pontos = []
            
            pontosFinais = []
            
            for linha in arquivo:
                items = linha.strip().split()
                if(len(items) == 1):
                    # print("Nome")
                    nomes.append(items[0])

                else:
                    # print("Pontos")
                    pontos.append(items)
                
                print(items)
            
            x = 0
            while x < len(nomes):
                p = Ponto(nomes[x], pontos[x][0], pontos[x][1])
                pontosFinais.append(p)
                x += 1
                
            for p in pontosFinais:
                plt.scatter(p.x, p.y, label=p.nome, marker='.')
                
            plt.axhline(0, color='black',linewidth=0.5)  
            plt.axvline(0, color='black',linewidth=0.5)
            plt.grid(color = 'gray', linestyle = '--', linewidth = 0.5)
            
            plt.title('Pontos do Documento')
            plt.xlabel("Eixo X")
            plt.ylabel("Eixo Y")
            
            plt.legend()
            plt.show()
                    
        except FileNotFoundError:
            print("Arquivo pontos.txt não encontrado")
            
        except IndexError:
            print("Erro no pontos.txt")
                

            
    
ponto = Ponto("Marcelo", 20, 30)
ponto.mostrarPontos()
ponto.pontosArquivo()
