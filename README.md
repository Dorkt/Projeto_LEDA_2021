# Projeto_LEDA_2021

## O projeto consiste das seguintes fases:

  Preparação do dataset > O dataset (Links para um site externo.) (link (Links para um site externo.) para descrição do dataset) compreende um registro histórico de ocorrência de COVID-19 para todas as cidades e estados do Brasil.
  Você deve baixar a planilha localmente para poder processá-la no seu código Java. Atenção, quando descompacta se torna algo bem maior.
  Você deve tratar apenas com os dados mais atuais (tem um campo chamado "É a última atualização?" ou "is_last" que deve eestar marcado como True). Valores antigos não interessam
  Você deve utilizar apenas dados não repetidos( existe um campo que indica isso "Dado repetido?")
  Gerar um arquivo formatado para ser processado na próxima fase
  Análise dos algoritmos de ordenação
  Implemente e utilize todos os algoritmos de ordenação estudados (Selection Sort, Insertion Sort, Merge Sort, Quick Sort, QuickSort com Mediana de 3, counting, e HeapSort) para ordenar os registros de acordo com os seguintes parâmetros:
  
  - Ordenação crescente por quantidade acumulada de óbitos;
  
  - Ordenação crescente por quantidade acumulada de casos;
  
  - Ordenação crescente por ordem alfabética pelo nome das cidades.
  
  Cada arquivo de saída de ordenação deve ser gerado com base no método de ordenação e no elemento ordenado. Por exemplo, para o quick sort devem ser gerado 3 arquivos: qSort_ordena_obitos.csv e qSort_ordena_casos.csv, qSort_ordena_cidades.csv. Isso deve continuar para cada um dos métodos de ordenação.
Para cada algoritmo, registre o tempo necessário para ordenar o vetor de senhas (em milissegundos).

## Pré-Requisitos
  1 - Possuir uma JRE ou JDK do Java, instalada no seu SO(sistema operacional) de nível 1.8 ou superior.

  2 - Baixar os arquivos que serão usados pelas estruturas de dados, para a ordenação, baixa aqui.

  3 - Baixar o arquivo executável do projeto e adicionar ele em uma pasta que você possua a rota dele até a pasta
  
## Execução
  
  1 - Abra o terminal do seu Sistema Operacional, e usando o comando "cd", entre na pasta que você adicionou o arquivo executável baixado, Exemplo do comando: cd /home/GabrielDuque

  2 - No prompt de comando executar o comando(java -jar) + caminho até a pasta que está localizada o arquivo executável, no fim o comando no prompt deverá ficar parecido com esse: java -jar "caminho-aqui"



