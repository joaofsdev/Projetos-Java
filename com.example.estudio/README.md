# Estúdio Audiovisual


Este projeto acadêmico é um sistema de gerenciamento de serviços para um estúdio audiovisual, incluindo ensaios fotográficos, sessões de podcast e outros serviços relacionados.

## Estrutura do Projeto

- **src/dominio/**: Contém as classes de domínio, como `EnsaioFotografico`, `Precificavel`, `Preparacao`, `ServicoAudiovisual`, `SessaoPodcast` e `TipoCenario`.
- **src/servico/**: Contém serviços auxiliares, como `RelatorioServico`.
- **src/test/**: Contém classes de teste e exemplos de uso, como `Main`.

## Como Executar

1. Certifique-se de ter o Java instalado (Java 17 ou superior recomendado).
2. Compile os arquivos Java:
   ```sh
   javac src/dominio/*.java src/servico/*.java src/test/Main.java
   ```
3. Execute a classe principal para testes:
   ```sh
   java -cp src/test Main
   ```

## Funcionalidades
- Gerenciamento de ensaios fotográficos
- Gerenciamento de sessões de podcast
- Geração de relatórios de serviços
- Estrutura modular para fácil expansão