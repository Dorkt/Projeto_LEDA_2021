package Utils;

public class test {
    public static void main(String[] args) {

        String pathBase = "/home/GabrielDuque/Desktop/Dados_covid/";

        // Caminho dos arquivos sem estruturas de dados aplicados
        String path_Arquivos_Medio_Caso = pathBase + "dados_medio_caso.csv";

        String path_Arquivos_Melhor_Caso_deaths = pathBase + "dados_melhor_caso_obitos.csv";
        String path_Arquivos_Melhor_Caso_confirmeds = pathBase + "dados_melhor_caso_confirmados.csv";
        String path_Arquivos_Melhor_Caso_cities = pathBase + "dados_melhor_caso_cidades.csv";

        String path_Arquivos_Pior_Caso_deaths = pathBase + "dados_pior_caso_obitos.csv";
        String path_Arquivos_Pior_Caso_confirmeds = pathBase + "dados_pior_caso_confirmados.csv";
        String path_Arquivos_Pior_Caso_cities = pathBase + "dados_pior_caso_cidades.csv";

        // **************************** Caminhos para o Selection Sort ***************************************
        String path_SelectionSort_Deaths_medio_caso = pathBase + "SelectionSort_ordena_obitos_medio_caso.csv";
        String path_SelectionSort_Confirmeds_medio_caso = pathBase + "SelectionSort_ordena_casos_confirmados_medio_caso.csv";
        String path_SelectionSort_Cities_medio_caso = pathBase + "SelectionSort_ordena_cidades_medio_caso.csv";

        String path_SelectionSort_Deaths_pior_caso = pathBase + "SelectionSort_ordena_obitos_pior_caso.csv";
        String path_SelectionSort_Confirmeds_pior_caso = pathBase + "SelectionSort_ordena_casos_confirmados_pior_caso.csv";
        String path_SelectionSort_Cities_pior_caso = pathBase + "SelectionSort_ordena_cidades_pior_caso.csv";

        String path_SelectionSort_Deaths_melhor_caso = pathBase + "SelectionSort_ordena_obitos_melhor_caso.csv";
        String path_SelectionSort_Confirmeds_melhor_caso = pathBase + "SelectionSort_ordena_casos_confirmados_melhor_caso.csv";
        String path_SelectionSort_Cities_melhor_caso = pathBase + "SelectionSort_ordena_cidades_melhor_caso.csv";

        // **************************** Caminhos para o Insertion Sort ***************************************
        String path_InsertionSort_Deaths = pathBase + "InsertionSort_ordena_obitos.csv";
        String path_InsertionSort_Confirmeds = pathBase + "InsertionSort_ordena_casos_confirmados.csv";
        String path_InsertionSort_Cities = pathBase + "InsertionSort_ordena_cidades.csv";

        String path_InsertionSort_Deaths_pior_caso = pathBase + "InsertionSort_ordena_obitos_pior_caso.csv";
        String path_InsertionSort_Confirmeds_pior_caso = pathBase + "InsertionSort_ordena_casos_confirmados_pior_caso.csv";
        String path_InsertionSort_Cities_pior_caso = pathBase + "InsertionSort_ordena_cidades_pior_caso.csv";

        String path_InsertionSort_Deaths_melhor_caso = pathBase + "InsertionSort_ordena_obitos_melhor_caso.csv";
        String path_InsertionSort_Confirmeds_melhor_caso = pathBase + "InsertionSort_ordena_casos_confirmados_melhor_caso.csv";
        String path_InsertionSort_Cities_melhor_caso = pathBase + "InsertionSort_ordena_cidades_melhor_caso.csv";

        // **************************** Caminhos para o Merge Sort ***************************************
        String path_MergeSort_Deaths = pathBase + "MergeSort_ordena_obitos.csv";
        String path_MergeSort_Confirmeds = pathBase + "MergeSort_ordena_casos_confirmados.csv";
        String path_MergeSort_Cities = pathBase + "MergeSort_ordena_cidades.csv";

        String path_MergeSort_Deaths_pior_caso = pathBase + "MergeSort_ordena_obitos_pior_caso.csv";
        String path_MergeSort_Confirmeds_pior_caso = pathBase + "MergeSort_ordena_casos_confirmados_pior_caso.csv";
        String path_MergeSort_Cities_pior_caso = pathBase + "MergeSort_ordena_cidades_pior_caso.csv";

        String path_MergeSort_Deaths_melhor_caso = pathBase + "MergeSort_ordena_obitos_melhor_caso.csv";
        String path_MergeSort_Confirmeds_melhor_caso = pathBase + "MergeSort_ordena_casos_confirmados_melhor_caso.csv";
        String path_MergeSort_Cities_melhor_caso = pathBase + "MergeSort_ordena_cidades_melhor_caso.csv";

        // **************************** Caminhos para o Quick Sort ***************************************
        String path_QuickSort_Deaths = pathBase + "QuickSort_ordena_obitos.csv";
        String path_QuickSort_Confirmeds = pathBase + "QuickSort_ordena_casos_confirmados.csv";
        String path_QuickSort_Cities = pathBase + "QuickSort_ordena_cidades.csv";

        String path_QuickSort_Deaths_pior_caso = pathBase + "QuickSort_ordena_obitos_pior_caso.csv";
        String path_QuickSort_Confirmeds_pior_caso = pathBase + "QuickSort_ordena_casos_confirmados_pior_caso.csv";
        String path_QuickSort_Cities_pior_caso = pathBase + "QuickSort_ordena_cidades_pior_caso.csv";

        String path_QuickSort_Deaths_melhor_caso = pathBase + "QuickSort_ordena_obitos_melhor_caso.csv";
        String path_QuickSort_Confirmeds_melhor_caso = pathBase + "QuickSort_ordena_casos_confirmados_melhor_caso.csv";
        String path_QuickSort_Cities_melhor_caso = pathBase + "QuickSort_ordena_cidades_melhor_caso.csv";

        // **************************** Caminhos para o Quick Sort Mediana de 3 ***************************************
        String path_QuickSortMed3_Deaths = pathBase + "QuickSortMed3_ordena_obitos.csv";
        String path_QuickSortMed3_Confirmeds = pathBase + "QuickSortMed3_ordena_casos_confirmados.csv";
        String path_QuickSortMed3_Cities = pathBase + "QuickSortMed3_ordena_cidades.csv";

        String path_QuickSortMed3_Deaths_pior_caso = pathBase + "QuickSortMed3_ordena_obitos_pior_caso.csv";
        String path_QuickSortMed3_Confirmeds_pior_caso = pathBase + "QuickSortMed3_ordena_casos_confirmados_pior_caso.csv";
        String path_QuickSortMed3_Cities_pior_caso = pathBase + "QuickSortMed3_ordena_cidades_pior_caso.csv";

        String path_QuickSortMed3_Deaths_melhor_caso = pathBase + "QuickSortMed3_ordena_obitos_melhor_caso.csv";
        String path_QuickSortMed3_Confirmeds_melhor_caso = pathBase + "QuickSortMed3_ordena_casos_confirmados_melhor_caso.csv";
        String path_QuickSortMed3_Cities_melhor_caso = pathBase + "QuickSortMed3_ordena_cidades_melhor_caso.csv";

        // **************************** Caminhos para o Counting Sort ***************************************
        String path_CountingSort_Deaths = pathBase + "CountingSort_ordena_obitos.csv";
        String path_CountingSort_Confirmeds = pathBase + "CountingSort_ordena_casos_confirmados.csv";

        String path_CountingSort_Deaths_pior_caso = pathBase + "CountingSort_ordena_obitos_pior_caso.csv";
        String path_CountingSort_Confirmeds_pior_caso = pathBase + "CountingSort_ordena_casos_confirmados_pior_caso.csv";

        String path_CountingSort_Deaths_melhor_caso = pathBase + "CountingSort_ordena_obitos_melhor_caso.csv";
        String path_CountingSort_Confirmeds_melhor_caso = pathBase + "CountingSort_ordena_casos_confirmados_melhor_caso.csv";

        // **************************** Caminhos para o Heap Sort ***************************************
        String path_HeapSort_Deaths = pathBase + "HeapSort_ordena_obitos.csv";
        String path_HeapSort_Confirmeds = pathBase + "HeapSort_ordena_casos_confirmados.csv";
        String path_HeapSort_Cities = pathBase + "HeapSort_ordena_cidades.csv";

        String path_HeapSort_Deaths_pior_caso = pathBase + "HeapSort_ordena_obitos_pior_caso.csv";
        String path_HeapSort_Confirmeds_pior_caso = pathBase + "HeapSort_ordena_casos_confirmados_pior_caso.csv";
        String path_HeapSort_Cities_pior_caso = pathBase + "HeapSort_ordena_cidades_pior_caso.csv";

        String path_HeapSort_Deaths_melhor_caso = pathBase + "HeapSort_ordena_obitos_melhor_caso.csv";
        String path_HeapSort_Confirmeds_melhor_caso = pathBase + "HeapSort_ordena_casos_confirmados_melhor_caso.csv";
        String path_HeapSort_Cities_melhor_caso = pathBase + "HeapSort_ordena_cidades_melhor_caso.csv";

        // *************** Criação do Storage e da classe que possui os algoritmos de ordenação ******************
        Storage storage = new Storage();
        Sort sort = new Sort();
        storage.ReadFile(path_Arquivos_Medio_Caso);

        // ******************** ORDENAÇÕES MÉDIO CASO *****************

        // MÉDIO CASO - Selection Sort
        sort.selectionSortForDeaths(storage.getData());
        storage.WriteFile(path_SelectionSort_Deaths_medio_caso, storage.getData());

        sort.selectionSortForConfirmed(storage.getData());
        storage.WriteFile(path_SelectionSort_Confirmeds_medio_caso, storage.getData());

        sort.selectionSortNameCity(storage.getData());
        storage.WriteFile(path_SelectionSort_Cities_medio_caso, storage.getData());

        System.out.println("ARQUIVOS ORDENADOS COM SELECTION SORT - PIOR/MEDIO/MELHOR - CASO");

        storage = new Storage();
        storage.ReadFile(path_Arquivos_Medio_Caso);

        // MÉDIO CASO - Insertion Sort
        sort.insertionSortForDeaths(storage.getData());
        storage.WriteFile(path_InsertionSort_Deaths, storage.getData());

        sort.insertionSortForConfirmed(storage.getData());
        storage.WriteFile(path_InsertionSort_Confirmeds, storage.getData());

        sort.insertionSortNameCity(storage.getData());
        storage.WriteFile(path_InsertionSort_Cities, storage.getData());

        System.out.println("ARQUIVOS ORDENADOS COM INSERTION SORT - PIOR/MEDIO/MELHOR - CASO");

        storage = new Storage();
        storage.ReadFile(path_Arquivos_Medio_Caso);

        // MÉDIO CASO - Merge Sort
        sort.mergeSortForDeaths(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_MergeSort_Deaths, storage.getData());

        sort.mergeSortForConfirmed(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_MergeSort_Confirmeds, storage.getData());

        sort.mergeSortNameCity(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_MergeSort_Cities, storage.getData());

        System.out.println("ARQUIVOS ORDENADOS COM MERGE SORT - PIOR/MEDIO/MELHOR - CASO");

        storage = new Storage();
        storage.ReadFile(path_Arquivos_Medio_Caso);

        // MÉDIO CASO - Quick Sort
        sort.quickSortForDeaths(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSort_Deaths, storage.getData());

        sort.quickSortForConfirmed(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSort_Confirmeds, storage.getData());

        sort.quickSortNameCity(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSort_Cities, storage.getData());

        System.out.println("ARQUIVOS ORDENADOS COM QUICK SORT - PIOR/MEDIO/MELHOR - CASO");

        storage = new Storage();
        storage.ReadFile(path_Arquivos_Medio_Caso);

        // MÉDIO CASO - Quick Sort Mediana de 3
        sort.quickSortMed3ForDeaths(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSortMed3_Deaths, storage.getData());

        sort.quickSortMed3ForConfirmeds(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSortMed3_Confirmeds, storage.getData());

        sort.quickSortMed3ForCities(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSortMed3_Cities, storage.getData());

        System.out.println("ARQUIVOS ORDENADOS COM QUICK SORT MEDIANA DE 3 - PIOR/MEDIO/MELHOR - CASO");

        storage = new Storage();
        storage.ReadFile(path_Arquivos_Medio_Caso);

        // MÉDIO CASO - Counting Sort
        sort.coutingSortForDeaths(storage.getData());
        storage.WriteFile(path_CountingSort_Deaths, storage.getData());

        sort.coutingSortForConfirmed(storage.getData());
        storage.WriteFile(path_CountingSort_Confirmeds, storage.getData());

        storage = new Storage();
        storage.ReadFile(path_Arquivos_Medio_Caso);
        System.out.println("ARQUIVOS ORDENADOS COM COUNTING SORT - PIOR/MEDIO/MELHOR - CASO");

        // MÉDIO CASO - Heap Sort
        sort.heapSortForDeaths(storage.getData());
        storage.WriteFile(path_HeapSort_Deaths, storage.getData());

        sort.heapSortForConfirmed(storage.getData());
        storage.WriteFile(path_HeapSort_Confirmeds, storage.getData());

        sort.heapSortNameCity(storage.getData());
        storage.WriteFile(path_HeapSort_Cities, storage.getData());

        System.out.println("ARQUIVOS ORDENADOS COM HEAP SORT - PIOR/MEDIO/MELHOR - CASO");

        // PIOR CASO - DEATHS
        storage = new Storage();
        storage.ReadFile(path_Arquivos_Pior_Caso_deaths);

        sort.selectionSortForDeaths(storage.getData());
        storage.WriteFile(path_SelectionSort_Deaths_pior_caso, storage.getData());

        sort.insertionSortForDeaths(storage.getData());
        storage.WriteFile(path_InsertionSort_Deaths_pior_caso, storage.getData());

        sort.mergeSortForDeaths(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_MergeSort_Deaths_pior_caso, storage.getData());

        sort.quickSortForDeaths(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSort_Deaths_pior_caso, storage.getData());

        sort.quickSortMed3ForDeaths(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSortMed3_Deaths_pior_caso, storage.getData());

        storage = new Storage();
        storage.ReadFile(path_Arquivos_Medio_Caso);

        sort.coutingSortForDeaths(storage.getData());
        storage.WriteFile(path_CountingSort_Deaths_pior_caso, storage.getData());

        storage = new Storage();
        storage.ReadFile(path_Arquivos_Pior_Caso_deaths);

        sort.heapSortForDeaths(storage.getData());
        storage.WriteFile(path_HeapSort_Deaths_pior_caso, storage.getData());

        // PIOR CASO - CONFIRMEDS
        storage = new Storage();
        storage.ReadFile(path_Arquivos_Pior_Caso_confirmeds);

        sort.selectionSortForConfirmed(storage.getData());
        storage.WriteFile(path_SelectionSort_Confirmeds_pior_caso, storage.getData());

        sort.insertionSortForConfirmed(storage.getData());
        storage.WriteFile(path_InsertionSort_Confirmeds_pior_caso, storage.getData());

        sort.mergeSortForConfirmed(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_MergeSort_Confirmeds_pior_caso, storage.getData());

        sort.quickSortForConfirmed(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSort_Confirmeds_pior_caso, storage.getData());

        sort.quickSortMed3ForConfirmeds(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSortMed3_Confirmeds_pior_caso, storage.getData());

        storage = new Storage();
        storage.ReadFile(path_Arquivos_Medio_Caso);

        sort.coutingSortForConfirmed(storage.getData());
        storage.WriteFile(path_CountingSort_Confirmeds_pior_caso, storage.getData());

        storage = new Storage();
        storage.ReadFile(path_Arquivos_Pior_Caso_confirmeds);

        sort.heapSortForConfirmed(storage.getData());
        storage.WriteFile(path_HeapSort_Confirmeds_pior_caso, storage.getData());

        // PIOR CASO - CITIES
        storage = new Storage();
        storage.ReadFile(path_Arquivos_Pior_Caso_cities);

        sort.selectionSortNameCity(storage.getData());
        storage.WriteFile(path_SelectionSort_Cities_pior_caso, storage.getData());

        sort.insertionSortNameCity(storage.getData());
        storage.WriteFile(path_InsertionSort_Cities_pior_caso, storage.getData());

        sort.mergeSortNameCity(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_MergeSort_Cities_pior_caso, storage.getData());

        sort.quickSortNameCity(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSort_Cities_pior_caso, storage.getData());

        sort.quickSortMed3ForCities(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSortMed3_Cities_pior_caso, storage.getData());

        sort.heapSortNameCity(storage.getData());
        storage.WriteFile(path_HeapSort_Cities_pior_caso, storage.getData());

        // MELHOR CASO - DEATHS
        storage = new Storage();
        storage.ReadFile(path_Arquivos_Melhor_Caso_deaths);

        sort.selectionSortForDeaths(storage.getData());
        storage.WriteFile(path_SelectionSort_Deaths_melhor_caso, storage.getData());

        sort.insertionSortForDeaths(storage.getData());
        storage.WriteFile(path_InsertionSort_Deaths_melhor_caso, storage.getData());

        sort.mergeSortForDeaths(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_MergeSort_Deaths_melhor_caso, storage.getData());

        sort.quickSortForDeaths(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSort_Deaths_melhor_caso, storage.getData());

        sort.quickSortMed3ForDeaths(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSortMed3_Deaths_melhor_caso, storage.getData());

        storage = new Storage();
        storage.ReadFile(path_Arquivos_Medio_Caso);

        sort.coutingSortForDeaths(storage.getData());
        storage.WriteFile(path_CountingSort_Deaths_melhor_caso, storage.getData());

        storage = new Storage();
        storage.ReadFile(path_Arquivos_Melhor_Caso_deaths);

        sort.heapSortForDeaths(storage.getData());
        storage.WriteFile(path_HeapSort_Deaths_melhor_caso, storage.getData());

        // MELHOR CASO - CONFIRMEDS
        storage = new Storage();
        storage.ReadFile(path_Arquivos_Melhor_Caso_confirmeds);

        sort.selectionSortForConfirmed(storage.getData());
        storage.WriteFile(path_SelectionSort_Confirmeds_melhor_caso, storage.getData());

        sort.insertionSortForConfirmed(storage.getData());
        storage.WriteFile(path_InsertionSort_Confirmeds_melhor_caso, storage.getData());

        sort.mergeSortForConfirmed(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_MergeSort_Confirmeds_melhor_caso, storage.getData());

        sort.quickSortForConfirmed(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSort_Confirmeds_melhor_caso, storage.getData());

        sort.quickSortMed3ForConfirmeds(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSortMed3_Confirmeds_melhor_caso, storage.getData());

        storage = new Storage();
        storage.ReadFile(path_Arquivos_Medio_Caso);

        sort.coutingSortForConfirmed(storage.getData());
        storage.WriteFile(path_CountingSort_Confirmeds_melhor_caso, storage.getData());

        storage = new Storage();
        storage.ReadFile(path_Arquivos_Melhor_Caso_confirmeds);

        sort.heapSortForConfirmed(storage.getData());
        storage.WriteFile(path_HeapSort_Confirmeds_melhor_caso, storage.getData());

        // MELHOR CASO - CITIES
        storage = new Storage();
        storage.ReadFile(path_Arquivos_Melhor_Caso_cities);

        sort.selectionSortNameCity(storage.getData());
        storage.WriteFile(path_SelectionSort_Cities_melhor_caso, storage.getData());

        sort.insertionSortNameCity(storage.getData());
        storage.WriteFile(path_InsertionSort_Cities_melhor_caso, storage.getData());

        sort.mergeSortNameCity(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_MergeSort_Cities_melhor_caso, storage.getData());

        sort.quickSortNameCity(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSort_Cities_melhor_caso, storage.getData());

        sort.quickSortMed3ForCities(storage.getData(), 0, storage.getData().length - 1);
        storage.WriteFile(path_QuickSortMed3_Cities_melhor_caso, storage.getData());

        sort.heapSortNameCity(storage.getData());
        storage.WriteFile(path_HeapSort_Cities_melhor_caso, storage.getData());

        System.out.println("TODOS OS ARQUIVOS GERADOS E ORDENADOS!!!!");
    }
}
