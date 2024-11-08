from veiculo import Veiculo

class VeiculoMotorizado(Veiculo):
  def __init__(self, nome, combustivel):
      super().__init__(nome)
      self.combustivel = combustivel

  def abastecer(self):
      return f"{self.nome} está abastecendo com {self.combustivel}."