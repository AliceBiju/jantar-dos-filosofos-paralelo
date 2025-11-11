# Jantar dos Filósofos - Programação Paralela e Distribuída

Este projeto implementa a solução do problema clássico do **Jantar dos Filósofos**, que simula um cenário em que filósofos tentam comer utilizando garfos compartilhados. A implementação utiliza conceitos de programação paralela, onde cada filósofo tenta pegar dois garfos para comer. O problema é resolvido com a criação de 5 filósofos e 5 garfos, com a garantia de que os garfos são compartilhados de maneira adequada entre os filósofos.

Além disso, foi implementado um **teste de unidade** utilizando JUnit 5 para garantir que os objetos (filósofos e garfos) sejam corretamente inicializados e configurados.

## Estrutura do Projeto

O projeto é composto por 3 classes principais:

1. **Garfo**: Representa um garfo compartilhado entre dois filósofos.  
2. **Fisolofo**: Representa um filósofo que tem dois garfos (um à esquerda e um à direita).  
3. **Jantar**: Controla o ambiente, criando e inicializando os filósofos e garfos.

O objetivo do código é verificar se, ao rodar o método `iniciar()`, todos os filósofos e garfos são configurados corretamente.

## Testes de Unidade

O projeto inclui testes com JUnit 5 para validar a configuração dos filósofos e garfos:

- testFilosofosEConfiguração: Verifica se existem 5 filósofos e se cada um possui dois garfos (esquerdo e direito).

- testGarfosEConfiguração: Verifica se existem 5 garfos distintos e se não há duplicação de objetos.

## Como Rodar o Projeto

- Acesse a pasta do projeto:

cd repo-jantar-dos-filosofos

- Compile o projeto utilizando Maven:

mvn clean install

- Para rodar os testes, utilize o comando:

mvn test

## Conclusão

Este projeto reforça conceitos importantes de sincronização de recursos e programação concorrente, mostrando como a configuração correta dos objetos é crucial para evitar condições de corrida.
Embora o teste de unidade inicial esteja configurado para falhar de propósito, ele serve como base para futuras implementações mais complexas, incluindo threads ativas e controle de acesso a recursos compartilhados.
O aprendizado central é que a estrutura e organização do código, aliadas a testes bem planejados, são fundamentais para garantir o correto funcionamento de sistemas concorrentes
