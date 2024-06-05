<h1> Teoria da Computação e Compiladores
</h1>
Este repositório é dedicado à entrega de projetos e atividades relacionadas à disciplina de Teoria da Computação e Compiladores.


<h2> CASE 1 - Modelagem de uma Máquina de Doces utilizando um Autômato Finito Determinístico
</h2>
<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/ProjetoA3/src/main/resources/Imagens/TelaMaquina.png?raw=true">
</p>

**Resumo:** <br>
Este documento contém a modelagem utilizada em um sistema de uma máquina de doces utilizando um AFD (Autômato Finito Determinístico). Na modelagem da máquina, considerou-se um conjunto finito de estados que ela pode assumir de acordo com as diferentes ações que podem ser realizadas pelo usuário. A máquina modelada permite a venda de doces com três diferentes de preços e ainda permite a devolução de troco ao usuário.


**Introdução:** <br>
A máquina modelada neste trabalho possui uma limitação de saldo de R$ 10,00. Ela aceita notas de R$ 2,00 e R$ 5,00 e moedas de R$ 1,00, além de permitir a venda de doces com preços de R$ 6,00 , R$ 7,00 ou R$ 8,00. A inserção de moedas e escolha do doce, estão associadas as funções de transição do autômato desenvolvido, cada ação leva a uma transição para um estado diferente, onde estado define quais ações o usuário poderá fazer a seguir.


**Modelagem do Sistema:** <br>

1 - Alfabeto de entrada - ∑: é um conjunto de símbolos, onde cada um destes símbolos está associado a uma ação realizada pelo usuário.

<p align="center"> ∑ = {1,00, 2,00, 5,00, -6,00, -7,00, -8,00} </p>

<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/ProjetoA3/src/main/resources/Imagens/Transicoes.png?raw=true"><br>
</p>

2 -	Conjunto de estados possíveis do sistema - Q: os elementos deste conjunto correspondem aos diferentes estados que a máquina pode assumir a medida em que o usuário realiza ações.
<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/ProjetoA3/src/main/resources/Imagens/Estados.png?raw=true"><br>
</p>

3 -	Função programa - δ: esta função leva um par formado por um estado e uma ação (uma entrada) do usuário para um novo estado. As transições realizadas por esta função podem ser visualizadas na imagem 1.

4 -	Estado inicial - q0: o estado inicial deste sistema é o estado q0, que representa a
situação em que o usuário da máquina ainda não realizou a inserção qualquer moeda na mesma.

5 -	Conjunto de estados finais - F: O conjunto de estados finais deve sempre ser um
subconjunto de Q. No sistema aqui descrito, os elementos deste conjunto são d1, d2 e d3, e representam a situação onde o usuário já inseriu moedas suficientes para a compra de doces com os preços R$ 6,00 , R$ 7,00 ou R$ 8,00 e já optou pelo doce desejado.

<p align = "center">
  F = {d1, d2, d3}
</p>
<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/ProjetoA3/src/main/resources/Imagens/AutomatoRead.png?raw=true"><br>
</p>
<h3 align = "center">
Imagem 1 - Diagrama de Transições do sistema modelado.
 </h3> <br>

 <h2> CASE 2 - Modelagem de um Sistema de elevador utilizando um Autômato Finito Determinístico
</h2>
<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/ProjetoA3/src/main/resources/Imagens2/TelaElevador.png?raw=true">
</p>

**Resumo:** <br>
Este documento contém a modelagem utilizada em um sistema de elevador utilizando um AFD (Autômato Finito Determinístico). Na modelagem da máquina, considerou-se um conjunto finito de estados que ela pode assumir de acordo com as necessidades de operações que o elevador tem para atender as solicitações realizadas pelo usuário. A máquina modelada permite o usuário chamar o elevador em qualquer um dos andares, além de permitir a escolha de qualquer um dos andares como destino.


**Introdução:** <br>
A máquina modelada neste trabalho possui uma limitação que só permite o elevador se mover com as portas fechadas. Ela aceita um alfabeto que representa as ações do elevador afim de atender a solicitação de ir à algum andar solicitado pelo usuário, além de permitir que o usuário chame o elevador para chegar em algum outro destino. As ações realizadas pelo elevador estão associadas as funções de transição do autômato desenvolvido, cada ação leva a uma transição para um estado diferente, onde estado define quais ações o elevador poderá fazer a seguir.


**Modelagem do Sistema:** <br>

1 - Alfabeto de entrada - ∑: é um conjunto de símbolos, onde cada um destes símbolos está associado a uma ação realizada pelo elevador.

<p align="center"> ∑ = {a, c, e, o, n, u, p, d ,w} </p>

<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/ProjetoA3/src/main/resources/Imagens2/Transicoes.png?raw=true"><br>
</p>

2 -	Conjunto de estados possíveis do sistema - Q: os elementos deste conjunto correspondem aos diferentes estados que a máquina pode assumir a medida em que o elevador realiza ações.
<p align="center"> Q = {T, T1, T2, T3, UP, DW, 1A ,1A1 ,1A2 ,1A3, UP2, DW2, 
  2A, 2A1, 2A2, 2A3, UP3, DW3, 3A, 3A1 ,3A2, 3A3} </p>
  
<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/ProjetoA3/src/main/resources/Imagens2/Estados.png?raw=true"><br>
</p>

3 -	Função programa - δ: esta função leva um par formado por um estado e uma ação do elevador para um novo estado. As transições realizadas por esta função podem ser visualizadas na imagem 1.

4 -	Estado inicial - q0: o estado inicial deste sistema é o estado T2, que representa a
situação em que o elevador se encontra no térreo de portas abertas.


<p align = "center">
  F = {d1, d2, d3}
</p>
<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/ProjetoA3/src/main/resources/Imagens2/Automato.png?raw=true"><br>
</p>
<h3 align = "center">
Imagem 1 - Diagrama de Transições do sistema modelado.
 </h3> <br>
 
<h2> CASE 3 - Criação de um Analisador Léxico
</h2>
<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/ProjetoA3/src/main/resources/imagens3/imgAnalisadorGit.png?raw=true">
</p>

<h3>Introdução:</h3>
  Na modelagem do analisador, considerou-se um conjunto de palavras 
e caracteres especiais reservados da linguagem Java, para geração de tokens pelo 
analisador. Além das palavras reservadas o analisador também pode identificar 
variáveis, valores, comentários feitos pelo usuário ou textos que estão entre em aspas 
que são considerados como String pelo analisador.

<h3>1. Palavras chaves (Keywords): </h3>
Foram escolhidas algumas palavras reservadas da linguagem Java para criação do 
analisador, a tabela a seguir contém todas as palavras reservadas e os seus respectivos 
tokens, gerados após a análise. <br><br>

<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/ProjetoA3/src/main/resources/imagens3/TabelaKw.png?raw=true">
</p>

<h3>2. Caracteres especiais: </h3>
Também foram escolhidos alguns caracteres especiais utilizados na linguagem Java, 
a tabela a seguir contém esses caracteres e os seus respectivos tokens. <br><br>

<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/ProjetoA3/src/main/resources/imagens3/TabelaCaractere.png?raw=true">
</p>

<h3>3. Variáveis: </h3>
Para que o analisador identifique variáveis escritas no código do usuário foi utilizado 
a expressão regular a seguir que permite apenas palavras que comece com uma letra 
e após ela contenha apenas letras ou números. <br>

<p align="center">^[a-zA-Z][a-zA-Z0-9]*$</p>
A expressão pode ser representada pelo seguinte autômato:

<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/ProjetoA3/src/main/resources/imagens3/AutomatoVariavel.png?raw=true">
</p>
Onde Letra é igual a [a-zA-Z] e número é [0-9].


<h3>4. Valores: </h3>
Para que o analisador identifique valores escritos no código do usuário foi utilizado 
a expressão regular a seguir que permite apenas valores numéricos com ou sem um 
ponto entre eles.

<p align="center">^[0-9]+(. [0-9]+)?$</p>
A expressão pode ser representada pelo seguinte autômato:

<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/ProjetoA3/src/main/resources/imagens3/AutomatoNumeros.png?raw=true">
</p>
Onde Número é igual a [0-9] e Separador é igual a [.].

<h3>5. Textos: </h3>
Para que o analisador identifique textos escritos no código do usuário foi utilizado a 
lógica do autômato a seguir: 


<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/ProjetoA3/src/main/resources/imagens3/AutmotoString.jpg?raw=true">
</p>
Onde Caracter é qualquer caractere.

<h3>6. Comentários </h3>
Para que o analisador identifique comentários escritos no código do usuário foi 
utilizado a lógica do autômato a seguir:


<p align="center">
<img src="https://github.com/Andrey-de-Freitas-Souza/Teoria-da-Computacao-e-Compiladores/blob/main/ProjetoA3/ProjetoA3/src/main/resources/imagens3/AutomatoComentario.png?raw=true">
</p>
Onde Caracter é qualquer caractere.

<h3>Grupo:</h3>
- Rafael Rossetto Guitarrari (RA: 823158602) <br>
- Andrey de Freitas Souza (RA: 823217536) <br>
- Gabriel Farah De Lima (RA: 822231424) <br>
- Fabrício de Barros Narbon (RA: 822227166)<br>
- Bianca Alves Ribeiro (RA: 8222240261)<br>
- Luiz Gustavo França de Abreu (RA: 823210075)<br>
- Gabrielle Garcia Paz (RA: 823126085)<br>
- Webster Diógenes Rodrigues (RA: 8222242764)<br>

## Contato

Para qualquer dúvida ou sugestão relacionada a este projeto, entre em contato com algum dos membros do grupo listados acima.
