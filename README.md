<h1> Teoria da Computação e Compiladores
</h1>
Este repositório é dedicado à entrega de projetos e atividades relacionadas à disciplina de Teoria da Computação e Compiladores.
<h3>Grupo:</h3>
- Rafael Rossetto Guitarrari (RA: 823158602) <br>
- Andrey de Freitas Souza (RA: 823217536) <br>
- Gabriel Farah De Lima (RA: 822231424) <br>
- Fabrício de Barros Narbon (RA: 822227166)<br>
- Bianca Alves Ribeiro (RA: 8222240261)<br>
- Luiz Gustavo França de Abreu (RA: 823210075)<br>
- Gabrielle Garcia Paz (RA: 823126085)<br>
- Webster Diógenes Rodrigues (RA: 8222242764)<br>

<h2> CASE 1 - Modelagem de uma Máquina de Vendas utilizando um Autômato Finito Determinístico
</h2>

**Resumo:** <br>
Este documento contém a modelagem utilizada em um sistema de elevador utilizando um AFD (Autômato Finito Determinístico). Na modelagem da máquina, considerou-se um conjunto finito de estados que ela pode assumir de acordo com as diferentes ações que podem ser realizadas pelo usuário. A máquina modelada permite a venda de produtos com três diferentes de preços e ainda permite a devolução de troco ao usuário.


**Introdução:** <br>
A máquina modelada neste trabalho possui uma limitação de saldo de R$ 10,00. Ela aceita notas de R$ 2,00 e R$ 5,00 e moedas de R$ 1,00, além de permitir a venda de produtos com preços de R$ 6,00 , R$ 7,00 ou R$ 8,00. A inserção de moedas e escolha do produto, estão associadas as funções de transição do autômato desenvolvido, cada ação leva a uma transição para um estado diferente, onde estado define quais ações o usuário poderá fazer a seguir.


**Modelagem do Sistema:** <br>
A máquina modelada neste trabalho possui uma limitação de saldo de R$ 10,00. Ela aceita notas de R$ 2,00 e R$ 5,00 e moedas de R$ 1,00, além de permitir a venda de produtos com preços de R$ 6,00 , R$ 7,00 ou R$ 8,00. A inserção de moedas e escolha do produto, estão associadas as funções de transição do autômato desenvolvido, cada ação leva a uma transição para um estado diferente, onde estado define quais ações o usuário poderá fazer a seguir.

1 - Alfabeto de entrada - ∑: é um conjunto de símbolos, onde cada um destes símbolos está associado a uma ação realizada pelo usuário.

<p align="center"> ∑ = {1,00, 2,00, 5,00, -6,00, -7,00, -8,00} </p>

<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/MaquinaDeDoce/src/main/resources/Imagens/Transicoes.png?raw=true"><br>
</p>

2 -	Conjunto de estados possíveis do sistema - Q: os elementos deste conjunto correspondem aos diferentes estados que a máquina pode assumir a medida em que o usuário realiza ações.
<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/MaquinaDeDoce/src/main/resources/Imagens/Estados.png?raw=true"><br>
</p>

3 -	Função programa - δ: esta função leva um par formado por um estado e uma ação (uma entrada) do usuário para um novo estado. As transições realizadas por esta função podem ser visualizadas na imagem 1.

4 -	Estado inicial - q0: o estado inicial deste sistema é o estado q0, que representa a
situação em que o usuário da máquina ainda não realizou a inserção qualquer moeda na mesma.

5 -	Conjunto de estados finais - F: O conjunto de estados finais deve sempre ser um
subconjunto de Q. No sistema aqui descrito, os elementos deste conjunto são d1, d2 e d3, e representam a situação onde o usuário já inseriu moedas suficientes para a compra de produtos com os preços R$ 6,00 , R$ 7,00 ou R$ 8,00 e já optou pela produto desejado.

<p align = "center">
  F = {d1, d2, d3}
</p>
<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/MaquinaDeDoce/src/main/resources/Imagens/AutomatoRead.png?raw=true"><br>
</p>
<h3 align = "center">
Imagem 1 - Diagrama de Transições do sistema modelado.
 </h3> <br>

 <h2> CASE 2 - Modelagem de um Sistema de elevador utilizando um Autômato Finito Determinístico
</h2>




## Contato

Para qualquer dúvida ou sugestão relacionada a este projeto, entre em contato com algum dos membros do grupo listados acima.
