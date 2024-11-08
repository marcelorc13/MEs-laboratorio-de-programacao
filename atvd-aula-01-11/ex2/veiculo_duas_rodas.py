from veiculo import Veiculo

class VeiculoDuasRodas(Veiculo):
  def __init__(self, nome):
      super().__init__(nome)

  def descricao(self):
      return f"{self.nome} é um veículo de duas rodas."