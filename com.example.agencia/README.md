# Sistema de Locação de Ativos Criativos

Este projeto é um sistema de locação para uma agência que trabalha com diferentes tipos de ativos criativos, como veículos de cena, peças de streetwear e equipamentos fotográficos. O sistema permite o cadastro de clientes, gerenciamento de itens disponíveis para locação, controle de contratos e cálculo de valores de aluguel e seguro.

## Funcionalidades
- Cadastro e gerenciamento de clientes
- Cadastro de ativos criativos (veículos, peças de streetwear, equipamentos fotográficos)
- Controle de status dos ativos (disponível, alugado, em manutenção)
- Fechamento de contratos de locação
- Cálculo automático de diárias e seguros
- Impressão de recibo de locação

## Estrutura do Projeto
```
src/
  dominio/
    Alugavel.java
    AtivoCriativo.java
    Cliente.java
    EquipamentoFotografico.java
    Manutencao.java
    PecaStreetwear.java
    StatusAtivo.java
    VeiculoCena.java
  servico/
    ContratoLocacaoServico.java
  test/
    Main.java
```

### Principais Classes
- **Cliente**: Representa o cliente que realiza a locação.
- **AtivoCriativo**: Classe abstrata base para todos os itens alugáveis.
- **VeiculoCena, PecaStreetwear, EquipamentoFotografico**: Especializações de AtivoCriativo.
- **StatusAtivo**: Enum para status dos ativos.
- **Manutencao**: Interface para itens que podem passar por manutenção.
- **ContratoLocacaoServico**: Serviço responsável pelo fechamento do contrato de locação.
- **Main**: Classe de teste para simular o fluxo de locação.

## Como Executar
1. Compile todos os arquivos Java localizados em `src/`.
2. Execute a classe `Main` em `src/test/Main.java` para simular um contrato de locação.

## Exemplo de Uso
Ao executar a classe `Main`, o sistema irá:
- Criar um cliente e três ativos criativos
- Fechar um contrato de locação para esses itens
- Exibir um recibo detalhado com valores de aluguel e seguro

## Padrão de Commits
Este projeto segue o padrão [Conventional Commits](https://www.conventionalcommits.org/pt-br/v1.0.0/), utilizando prefixos como `feat:`, `fix:`, `docs:`, entre outros.

## Licença
Este projeto é de uso acadêmico/didático e não possui licença comercial.
