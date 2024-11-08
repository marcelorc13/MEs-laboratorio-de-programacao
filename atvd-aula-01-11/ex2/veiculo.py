class Veiculo:
  def __init__(self, nome):
      self.nome = nome

  def mover(self):
      return f"{self.nome} está se movendo."

  def parar(self):
      return f"{self.nome} está parado."