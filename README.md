itexto-automata
===============

Biblioteca Java para processamento de automatos finitos determininsticos da itexto.

De tempos em tempos me pego precisando implementar autômatos finitos deterministas para diversos projetos, então,
com o objetivo de minimizar meu trabalho, lhes ofereço uma biblioteca 100% pronta para que possam tirar proveito
em seus projetos também (ou mesmo em seus trabalhos acadêmicos em disciplinas como compiladores ou fundamentos
teóricos de Computação).

Sintaxe 
===============

A biblioteca itexto-automata pode processar tanto arquivos binários quanto textuais. Para tal, basta
seguier a sintaxe abaixo.

[formato] <- Pode ser binary ou text
estados e regras de validação

Toda regra de validação segue a seguinte sintaxe:
[estado de origem] -> [regra](estado destino) 
Pode haver mais de uma regra por linha. Para tal basta que estas sejam separadas pelo caractere |

Abaixo segue um exemplo de automato com tres estados.

text
init   -> \w(state1) | a(state2)
state1 -> final
state2 -> b(init) | c(state1)

O estado inicial do autômato finito determinista (AFD) será sempre o primeiro declarado no arquivo de configuração.
Há regras especiais para lidar com arquivos textuais que são descritas na seção abaixo.

Regras textuais
==================

\w - Espaço em branco
\t - Caractere de tabulação
\n - Nova linha
\r - Retorno de linha
\nwtr - Um caractere que seja espaço em branco, tabulação, retorno ou nova linha (como sempre usava quatro regras, isto simplifica nossa vida) :)
\* - Qualquer outro caractere
final - Se presente, indica que o estado aonde as regras são aplicadas consiste em um estado final


Exemplo:
text
init -> \nwtr(state1) | a(state2) | b(state3) | \*(state4)
state4 -> final

Se for lido (\n, \t, \w ou \r), vai para o state1
Se fo rlido o caractere a, vai para o state2
Se for lido o caractere b, vai para o state 3
Qualquer outro caractere, siga para o state 4
O estado state4 é um estado final
O estado init, por ter sido o primeiro declarado, é o inicial

Regras binárias
====================
Não existem muitas regras para arquivos binarios. Basicamente tudo o que você precisa fazer consiste em incluir
seus caracteres expostos com notação decimal ou exadecimal e o estado destino.
Exemplo:
binary
init -> 0x01(state1) | 2(state2) | 0xFF(state3)
state3 -> final
