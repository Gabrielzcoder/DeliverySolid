# Delivery SOLID

Projeto desenvolvido em Java para aplicar os cinco princípios SOLID em um sistema simplificado de delivery.

O objetivo é demonstrar como boas práticas de programação orientada a objetos ajudam a criar um código mais organizado, flexível, reutilizável e fácil de manter.

## Tecnologias utilizadas

- **Java 25**
- Programação Orientada a Objetos
- Git e GitHub
- IntelliJ IDEA

## Princípios SOLID aplicados

### 1. SRP — Single Responsibility Principle

**Princípio da Responsabilidade Única**

Cada classe deve possuir apenas uma responsabilidade.

No projeto, as responsabilidades relacionadas aos pedidos foram separadas:

- `PedidoService`: criação e gerenciamento dos pedidos.
- `PedidoRepository`: definição do contrato para armazenamento.
- `PedidoRepositoryMemoria`: armazenamento dos pedidos em memória.
- `PedidoExibicaoService`: exibição das informações dos pedidos.

### 2. OCP — Open/Closed Principle

**Princípio Aberto/Fechado**

As classes devem estar abertas para extensão, mas fechadas para modificação.

O sistema de pagamentos utiliza a interface `Pagamento`, permitindo adicionar novas formas de pagamento sem modificar o serviço responsável por executá-las.

Implementações disponíveis:
- `PagamentoCartao`
- `PagamentoPix`
- `PagamentoDinheiro`

A classe `PagamentoService` depende da abstração `Pagamento`, e não de implementações específicas.

### 3. LSP — Liskov Substitution Principle

**Princípio da Substituição de Liskov**

Objetos de uma classe derivada devem poder substituir objetos da classe base sem comprometer o funcionamento do sistema.

Foi criada uma classe base `Produto`, estendida por:

- `Pizza`
- `Hamburguer`
- `Bebida`

Cada subclasse possui características específicas, mas mantém a compatibilidade com a classe `Produto`.

### 4. ISP — Interface Segregation Principle

**Princípio da Segregação de Interfaces**

Uma classe não deve ser obrigada a implementar métodos que não utiliza.

Para evitar interfaces com responsabilidades excessivas, o sistema possui contratos separados:

- `GerenciadorPedidos`
- `GerenciadorEntregas`
- `Notificador`
- `GeradorRelatorios`

Cada interface define apenas os métodos relacionados à sua responsabilidade.

### 5. DIP — Dependency Inversion Principle

**Princípio da Inversão de Dependência**

Módulos de alto nível não devem depender diretamente de módulos de baixo nível. Ambos devem depender de abstrações.

O sistema de notificações utiliza a interface `Notificador`, permitindo diferentes implementações:

- `EmailNotificador`
- `SMSNotificador`
- `WhatsAppNotificador`

A classe `NotificacaoService` recebe uma implementação pelo construtor, sem depender diretamente de uma classe concreta.

## Como executar

1. Clone o repositório:

```bash
git clone https://github.com/Gabrielzcoder/DeliverySolid.git
```

2. Abra o projeto no IntelliJ IDEA.

3. Certifique-se de que o Java 25 está configurado como SDK do projeto.

4. Execute a classe `Main.java`.

## Autor

**Gabriel Moreno**

Estudante de Ciência da Computação.

[GitHub — Gabrielzcoder](https://github.com/Gabrielzcoder)

---

Projeto acadêmico desenvolvido com o objetivo de estudar e aplicar os cinco princípios SOLID utilizando Java.
