<img height="200px" src="https://raw.githubusercontent.com/thaiscardosodemello/serratec.residenciatic/refs/heads/main/assets/cinema.png" alt="Sistema Cinema"/>


# CineJava

O projeto **CineJava** é um sistema desenvolvido para a disciplina de Programação Orientada a Objetos (POO), para gerenciar as operações de um cinema, permitindo que clientes comprem ingressos e acessem informações sobre suas compras, enquanto gerentes podem emitir relatórios de vendas. O sistema foi projetado com foco na experiência do usuário, garantindo uma interface amigável e um tratamento de erros.

## Objetivos do Projeto

O sistema deve atender aos seguintes critérios:

1. **Consistência**:
   - Implementar um tratamento de exceções robusto para garantir que o sistema lide com erros de forma eficiente.

2. **Estética**:
   - Focar na experiência do usuário, proporcionando uma interface intuitiva e agradável.

3. **Estruturas de Programação**:
   - Utilizar todas as estruturas discutidas em aula, incluindo:
     - Composição
     - Modificadores de acesso para encapsulamento
     - Herança
     - Interfaces
     - Polimorfismo
     - Enumeradores
     - Atributos e métodos estáticos
     - Bibliotecas necessárias.

## Funcionalidades

### Usuários

1. **Cliente**:
   - Comprar entradas de filmes, escolhendo assentos a partir de um mapa interativo.
   - Selecionar ingressos de meia ou inteira.
   - Consultar seu histórico de compras e verificar as entradas ativas.
   - Comprar produtos na bomboniere, como pipoca e refrigerantes.

2. **Gerente**:
   - Emitir relatórios de vendas, incluindo:
     - Faturamento total do mês.
     - Filme mais vendido.

## Estrutura do Projeto

### Classes

1. **Usuario**
   - Atributos: `nome`, `cpf`, `login`, `email`, `senha`, `telefone`
   - Métodos: Construtores, getters, setters, `exibirInformacoes`

2. **Cliente** (extends `Usuario`)
   - Métodos: Construtores, getters, setters, `comprarIngresso`, `consultarHistorico`, `comprarBomboniere`

3. **Gerente** (extends `Usuario`)
   - Métodos: Construtores, getters, setters,  `emitirRelatorio`

4. **Filme**
   - Atributos: `titulo`, `duracao`, `classificacao`, `assentos`, `vendas`
   - Métodos: Construtores, getters, setters, `venderIngresso`, `consultarAssentos`

5. **Sessao**
   - Atributos: `tipo`, `preco`, `filme`, `assento`
   - Métodos: Construtores, getters, setters, `toString`

6. **Bomboniere**
   - Atributos: `produtos`, `vendas`
   - Métodos: Construtores, getters, setters, `venderProduto`

### Interface do Usuário

- **Tela Principal**:
  - Apresenta um layout intuitivo.
<img src="https://raw.githubusercontent.com/thaiscardosodemello/serratec.residenciatic/refs/heads/main/assets/login-min.gif" alt="tela login">

- **Área do Cliente**:
  - Visualização clara das opções de compra de ingressos e produtos da bomboniere.
  - Seção dedicada ao histórico de compras.
  - Breadcrumbs para facilitar a navegação entre diferentes seções do sistema.
<img src="https://github.com/thaiscardosodemello/serratec.residenciatic/blob/main/assets/bomboniere-min.gif" alt="tela bomboniere">

- **Área do Gerente**:
  - Acesso a relatórios de vendas em formato de tabela.
  - Visualização de faturamento mensal e filmes mais vendidos.
  - Breadcrumbs para facilitar a navegação entre diferentes seções do sistema.
<img src="https://raw.githubusercontent.com/thaiscardosodemello/serratec.residenciatic/refs/heads/main/assets/relatorio.jpg" alt="tela relatorio">


<br/>
<table align="center">
    <tr>
    <td align="center">
      <a href="https://github.com/eduardofmonteiro">
        <img src="https://avatars.githubusercontent.com/u/44728582?v=4" width="100px;" alt="Avatar Eduardo Felipe"/><br>
        <sub>
          <b>Eduardo Felipe</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/lari-blip">
        <img src="https://avatars.githubusercontent.com/u/177570877?v=4" width="100px;" alt="Avatar Larissa Anunciação"/><br>
        <sub>
          <b>Larissa Anunciação</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/elipekkkj">
        <img src="https://avatars.githubusercontent.com/u/177887930?v=4" width="100px;" alt="Avatar Luis Felipe"/><br>
        <sub>
          <b>Luis Felipe</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/Felipe-Goncalves-Lima">
        <img src="https://avatars.githubusercontent.com/u/163328613?v=4" width="100px;" alt="Avatar Felipe Gonçalves"/><br>
        <sub>
          <b>Felipe Gonçalves</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/thaiscardosodemello">
        <img src="https://avatars.githubusercontent.com/u/14929797?v=4" width="100px;" alt="Avatar Thais Cardoso"/><br>
        <sub>
          <b>Thais Cardoso</b>
        </sub>
      </a>
    </td>
</table>

</br>

</br>

## ✨ Tecnologia Utilizada

Para o desenvolvimento dos projetos, foram utilizadas as seguintes ferramentas:

🟣 **[VSCode](https://code.visualstudio.com)** [Documentação](https://code.visualstudio.com/docs)</br>
🟣 **[Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack)**</br>
🟣 **[Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)**</br>
