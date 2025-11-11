# Jantar dos Filósofos - Programação Paralela e Distribuída

Este projeto implementa a solução do problema clássico do **Jantar dos Filósofos**, simulando um cenário em que filósofos tentam comer utilizando garfos compartilhados.  
A implementação utiliza conceitos de **programação paralela**, com cada filósofo representado por uma thread que alterna entre **pensar** e **comer**. Cada filósofo possui dois garfos, sendo que os garfos são compartilhados com os filósofos vizinhos. Estratégias de revezamento são aplicadas para evitar **deadlocks**.

## Estrutura do Projeto

O projeto contém as seguintes classes:

1. **Garfo**: Representa um garfo compartilhado entre dois filósofos.
2. **Fisolofo**: Representa um filósofo, com tempos de pensar e comer, que alterna o uso dos garfos.
3. **Jantar**: Controla o ambiente, criando filósofos e garfos, e inicia a execução.
4. **Main**: Ponto de entrada do programa, configurando os tempos e iniciando o jantar.

## Características desta implementação

Cada filósofo tem tempo de pensar e tempo de comer.

Há 5 filósofos e 5 garfos, cada garfo compartilhado entre dois filósofos.

Os filósofos de número par e ímpar pegam os garfos em ordens diferentes para evitar deadlock.

A implementação é paralela, usando threads.

Estrutura modular para testes e futuras melhorias (por exemplo, monitor ou semáforo).

## Como Rodar

1. Clone o repositório;
   
2. Entre na pasta do projeto:
cd jantar-dos-filosofos-paralelo

3. Compile e execute o projeto (usando Maven ou seu IDE favorito):
javac *.java
java Main

4. Observe a saída no console mostrando filósofos pensando e comendo.

## Resumo

O projeto demonstra a implementação do problema do Jantar dos Filósofos com:

Threads representando filósofos.

Alternância entre estados de pensar e comer.

Uso seguro de garfos compartilhados, evitando deadlocks.

Tempos configuráveis para pensar e comer.

O foco principal foi simular a concorrência e a sincronização de recursos, reforçando conceitos de programação paralela.

## Conclusão

Este projeto reforça conceitos fundamentais de programação concorrente, como:

Controle de acesso a recursos compartilhados.

Estratégias para evitar deadlock.

Uso de threads para simular processos paralelos.

A implementação modular permite futuras melhorias, como controle por semaphores, monitores ou testes avançados de sincronização.

