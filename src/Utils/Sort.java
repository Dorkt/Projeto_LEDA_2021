package Utils;

import javax.xml.crypto.Data;

public class Sort {

    public void swap(Dataset_covid[] data, int i, int j){
        Dataset_covid temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void selectionSortForDeaths(Dataset_covid[] data) {
        int min;
        int size = data.length;

        for(int i = 0; i < size - 1; i++) {
            min = i;
            for(int j = i + 1; j < size; j++) {
                if(data[j].getDeaths() > data[min].getDeaths()) {
                    min = j;
                }
            }
            if(i != min) {
                swap(data, i, min);
            }
        }
    }

    public void selectionSortForConfirmed(Dataset_covid[] data) {
        int min;
        int size = data.length;

        for(int i = 0; i < size - 1; i++) {
            min = i;
            for(int j = i + 1; j < size; j++) {
                if(data[j].getConfirmed() < data[min].getConfirmed()){
                    min = j;
                }
            }
            if(i != min) {
                swap(data, i, min);
            }
        }
    }

    public void selectionSortNameCity(Dataset_covid[] data) {
        int min;
        int size = data.length;

        for(int i = 0; i < size - 1; i++) {
            min = i;
            for(int j = i + 1; j < size; j++) {
                if(data[j].getCity().compareTo(data[min].getCity()) < 0){
                    min = j;
                }
            }
            if(i != min) {
                swap(data, i, min);
            }
        }
    }


    public void insertionSortForDeaths(Dataset_covid[] data) {
        Dataset_covid key;
        int j, size = data.length;

        for(int i = 1; i < size; i++) {
            key = data[i];
            j = i - 1;
            while(j >= 0 && data[j].getDeaths() > key.getDeaths()){
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
    }

    public void insertionSortForConfirmed(Dataset_covid[] data) {
        Dataset_covid key;
        int j, size = data.length;

        for(int i = 1; i < size; i++) {
            key = data[i];
            j = i - 1;
            while(j >= 0 && data[j].getConfirmed() > key.getConfirmed()){
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
    }

    public void insertionSortNameCity(Dataset_covid[] data) {
        Dataset_covid key;
        int j, size = data.length;

        for(int i = 1; i < size; i++) {
            key = data[i];
            j = i - 1;
            while(j >= 0 && data[j].getCity().compareTo(key.getCity()) > 0){
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
    }

    public void merge(Dataset_covid[] data, Integer left, Integer mid, Integer right, String comeFrom) {
        int sizeArray1 = mid - left + 1;
        int sizeArray2 = right - mid;

        Dataset_covid L[] = new Dataset_covid[sizeArray1];
        Dataset_covid R[] = new Dataset_covid[sizeArray2];

        for(int i = 0; i < sizeArray1; i++) {
            L[i] = data[left + i];
        }
        for(int j = 0; j < sizeArray2; j++) {
            R[j] = data[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = left;

        if(comeFrom.equals("Death")){
            while(i < sizeArray1 && j < sizeArray2) {
                if(L[i].getDeaths() <= R[j].getDeaths()) {
                    data[k] = L[i];
                    i++;
                } else {
                    data[k] = R[j];
                    j++;
                }
                k++;
            }
        } else if(comeFrom.equals("Confirmed")) {
            while(i < sizeArray1 && j < sizeArray2) {
                if(L[i].getConfirmed() <= R[j].getConfirmed()) {
                    data[k] = L[i];
                    i++;
                } else {
                    data[k] = R[j];
                    j++;
                }
                k++;
            }
        } else if(comeFrom.equals("City")){
            while(i < sizeArray1 && j < sizeArray2) {
                if(L[i].getCity().compareTo(R[j].getCity()) <= 0 ) {
                    data[k] = L[i];
                    i++;
                } else {
                    data[k] = R[j];
                    j++;
                }
                k++;
            }
        }

        while(i < sizeArray1) {
            data[k] = L[i];
            i++;
            k++;
        }
        while (j < sizeArray2) {
            data[k] = R[j];
            j++;
            k++;
        }
    }

    public void mergeSortForDeaths(Dataset_covid[] data, Integer left, Integer right) {
        if(left < right) {
            int mid = left + (right-left) / 2;

            mergeSortForDeaths(data, left, mid);
            mergeSortForDeaths(data, mid + 1, right);
            merge(data, left, mid, right, "Death");
        }
    }

    public void mergeSortForConfirmed(Dataset_covid[] data, Integer left, Integer right) {
        if(left < right) {
            int mid = left + (right-left) / 2;

            mergeSortForConfirmed(data, left, mid);
            mergeSortForConfirmed(data, mid + 1, right);
            merge(data, left, mid, right, "Confirmed");
        }
    }

    public void mergeSortNameCity(Dataset_covid[] data, Integer left, Integer right) {
        if(left < right) {
            int mid = left + (right-left) / 2;

            mergeSortNameCity(data, left, mid);
            mergeSortNameCity(data, mid + 1, right);
            merge(data, left, mid, right, "City");
        }
    }

    public static int partitionForQuickSort(Dataset_covid data[], int inicio, int fim, String comeFrom) {
        Dataset_covid pivot = data[fim];
        int i = (inicio - 1);

        if(comeFrom.equals("Death")) {
            for (int j = inicio; j < fim; j++) {
                if (data[j].getDeaths() <= pivot.getDeaths()) {
                    i++;

                    Dataset_covid temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        } else if(comeFrom.equals("Confirmed")) {
            for (int j = inicio; j < fim; j++) {
                if (data[j].getConfirmed() <= pivot.getConfirmed()) {
                    i++;

                    Dataset_covid temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        } else if(comeFrom.equals("City")) {
            for (int j = inicio; j < fim; j++) {
                if (data[j].getCity().compareTo(pivot.getCity()) <= 0) {
                    i++;

                    Dataset_covid temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

        Dataset_covid temp = data[i + 1];
        data[i + 1] = data[fim];
        data[fim] = temp;

        return i + 1;
    }

    public void quickSortForDeaths(Dataset_covid data[], int inicio, int fim) {
        if (inicio < fim) {
            int partitionIndex = partitionForQuickSort(data, inicio, fim, "Death");

            quickSortForDeaths(data, inicio, partitionIndex - 1);
            quickSortForDeaths(data, partitionIndex + 1, fim);
        }
    }

    public void quickSortForConfirmed(Dataset_covid data[], int inicio, int fim) {
        if (inicio < fim) {
            int partitionIndex = partitionForQuickSort(data, inicio, fim, "Confirmed");

            quickSortForConfirmed(data, inicio, partitionIndex - 1);
            quickSortForConfirmed(data, partitionIndex + 1, fim);
        }
    }

    public void quickSortNameCity(Dataset_covid data[], int inicio, int fim) {
        if (inicio < fim) {
            int partitionIndex = partitionForQuickSort(data, inicio, fim, "City");

            quickSortNameCity(data, inicio, partitionIndex - 1);
            quickSortNameCity(data, partitionIndex + 1, fim);
        }
    }

    private static void swapMedianaDeTres(Dataset_covid data[], int i, int j) {
        Dataset_covid temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private static int partitionQuickMedianaDeTres(Dataset_covid data[], int inicio, int fim, String comeFrom) {
        int meio = (inicio + fim) / 2;
        Dataset_covid a = data[inicio];
        Dataset_covid b = data[meio];
        Dataset_covid c = data[fim];

        int medianaIndice;

        if(comeFrom == "Death") {
            if (a.getDeaths() < b.getDeaths()) {
                if (b.getDeaths() < c.getDeaths()) {
                    //a < b && b < c
                    medianaIndice = meio;
                } else {
                    if (a.getDeaths() < c.getDeaths()) {
                        //a < c && c <= b
                        medianaIndice = fim;
                    } else {
                        //c <= a && a < b
                        medianaIndice = inicio;
                    }
                }
            } else {
                if (c.getDeaths() < b.getDeaths()) {
                    //c < b && b <= a
                    medianaIndice = meio;
                } else {
                    if (c.getDeaths() < a.getDeaths()) {
                        //b <= c && c < a
                        medianaIndice = fim;
                    } else {
                        //b <= a && a <= c
                        medianaIndice = inicio;
                    }
                }
            }
            swapMedianaDeTres(data, medianaIndice, fim);
            Dataset_covid pivo = data[fim];
            int i = inicio - 1;

            for (int j = inicio; j <= fim - 1; j++) {
                if (data[j].getDeaths() <= pivo.getDeaths()) {
                    i = i + 1;
                    swapMedianaDeTres(data, i, j);
                }
            }
            swapMedianaDeTres(data, i + 1, fim);
            return i + 1;
        } else if(comeFrom == "Confirmed") {
            if (a.getConfirmed() < b.getConfirmed()) {
                if (b.getConfirmed() < c.getConfirmed()) {
                    //a < b && b < c
                    medianaIndice = meio;
                } else {
                    if (a.getConfirmed() < c.getConfirmed()) {
                        //a < c && c <= b
                        medianaIndice = fim;
                    } else {
                        //c <= a && a < b
                        medianaIndice = inicio;
                    }
                }
            } else {
                if (c.getConfirmed() < b.getConfirmed()) {
                    //c < b && b <= a
                    medianaIndice = meio;
                } else {
                    if (c.getConfirmed() < a.getConfirmed()) {
                        //b <= c && c < a
                        medianaIndice = fim;
                    } else {
                        //b <= a && a <= c
                        medianaIndice = inicio;
                    }
                }
            }
            swapMedianaDeTres(data, medianaIndice, fim);
            Dataset_covid pivo = data[fim];
            int i = inicio - 1;

            for (int j = inicio; j <= fim - 1; j++) {
                if (data[j].getConfirmed() <= pivo.getConfirmed()) {
                    i = i + 1;
                    swapMedianaDeTres(data, i, j);
                }
            }
            swapMedianaDeTres(data, i + 1, fim);
            return i + 1;
        } else {
            if (a.getCity().compareTo(b.getCity()) < 0) {
                if (b.getCity().compareTo(c.getCity()) < 0) {
                    //a < b && b < c
                    medianaIndice = meio;
                } else {
                    if (a.getCity().compareTo(c.getCity()) < 0) {
                        //a < c && c <= b
                        medianaIndice = fim;
                    } else {
                        //c <= a && a < b
                        medianaIndice = inicio;
                    }
                }
            } else {
                if (c.getCity().compareTo(b.getCity()) < 0) {
                    //c < b && b <= a
                    medianaIndice = meio;
                } else {
                    if (c.getCity().compareTo(a.getCity()) < 0) {
                        //b <= c && c < a
                        medianaIndice = fim;
                    } else {
                        //b <= a && a <= c
                        medianaIndice = inicio;
                    }
                }
            }
            swapMedianaDeTres(data, medianaIndice, fim);
            Dataset_covid pivo = data[fim];
            int i = inicio - 1;

            for (int j = inicio; j <= fim - 1; j++) {
                if (data[j].getCity().compareTo(pivo.getCity()) <= 0) {
                    i = i + 1;
                    swapMedianaDeTres(data, i, j);
                }
            }
            swapMedianaDeTres(data, i + 1, fim);
            return i + 1;
        }
    }

    public void quickSortMed3ForDeaths(Dataset_covid[] data, int inicio, int fim) {
        if (inicio < fim) {
            int q = partitionQuickMedianaDeTres(data, inicio, fim, "Death");
            quickSortMed3ForDeaths(data, inicio, q - 1);
            quickSortMed3ForDeaths(data, q + 1, fim);
        }
    }

    public void quickSortMed3ForConfirmeds(Dataset_covid[] data, int inicio, int fim) {
        if (inicio < fim) {
            int q = partitionQuickMedianaDeTres(data, inicio, fim, "Confirmed");
            quickSortMed3ForConfirmeds(data, inicio, q - 1);
            quickSortMed3ForConfirmeds(data, q + 1, fim);
        }
    }

    public void quickSortMed3ForCities(Dataset_covid[] data, int inicio, int fim) {
        if (inicio < fim) {
            int q = partitionQuickMedianaDeTres(data, inicio, fim, "City");
            quickSortMed3ForCities(data, inicio, q - 1);
            quickSortMed3ForCities(data, q + 1, fim);
        }
    }

    public int[] maxValueCountingSort(Dataset_covid data[], String comeFrom) {
        int size = data.length;
        int maxValue;
        int minValue;

        if(comeFrom.equals("Death")) {
            maxValue = data[0].getDeaths();
            minValue = data[0].getDeaths();
            for (int i = 0; i < size; i++) {
                if(data[i] != null) {
                    if (maxValue < data[i].getDeaths()) {
                        maxValue = data[i].getDeaths();
                    }
                    if (minValue > data[i].getDeaths()) {
                        minValue = data[i].getDeaths();
                    }
                }
            }
            int max_Min_values[] = {maxValue, minValue};
            return max_Min_values;
        } else {
            maxValue = data[0].getConfirmed();
            minValue = data[0].getDeaths();
            for (int i = 0; i < size; i++) {
                if(data[i] != null) {
                    if (maxValue < data[i].getConfirmed()) {
                        maxValue = data[i].getConfirmed();
                    }
                    if (minValue > data[i].getConfirmed()) {
                        minValue = data[i].getConfirmed();
                    }
                }
            }
            int max_Min_values[] = {maxValue, minValue};
            return max_Min_values;
        }
    }

    public void coutingSortForDeaths(Dataset_covid data[]) {
        int Values[] = maxValueCountingSort(data, "Death");
        int maxValue = Values[0];
        int minValue = Values[1];
        int range = maxValue - minValue + 1;
        int count[] = new int[range];
        Dataset_covid finishSort[] =  new Dataset_covid[data.length];

        for(int i = 1; i < data.length; i++) {
            count[data[i].getDeaths() - minValue]++;
        }

        for(int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for(int i = data.length - 1; i >= 0; i--) {
            finishSort[count[data[i].getDeaths()] - 1] = data[i];
            count[data[i].getDeaths() - minValue]--;
        }

        for(int i = 0; i < data.length; i++) {
            data[i] = finishSort[i];
        }
    }

    public void coutingSortForConfirmed(Dataset_covid data[]) {
        int Values[] = maxValueCountingSort(data, "Confirmed");
        int maxValue = Values[0];
        int minValue = Values[1];
        int range = maxValue - minValue + 1;
        int count[] = new int[range];
        Dataset_covid finishSort[] =  new Dataset_covid[data.length];

        for(int i = 1; i < data.length; i++) {
            if(data[i] != null) {
                count[data[i].getConfirmed() - minValue]++;
            }
        }

        for(int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for(int i = data.length - 1; i >= 0; i--) {
            if(data[i] != null) {
                finishSort[count[data[i].getConfirmed()] - 1] = data[i];
                count[data[i].getConfirmed() - minValue]--;
            }
        }

        for(int i = 0; i < data.length; i++) {
            data[i] = finishSort[i];
        }
    }

    public void heapSortForDeaths(Dataset_covid data[]) {
        int tamanho = data.length;
        int i = tamanho / 2, pai, filho;
        Dataset_covid t;
        while (true){
            if (i > 0){
                i--;
                t = data[i];
            }else{
                tamanho--;
                if (tamanho <= 0) {return;}
                t = data[tamanho];
                data[tamanho] = data[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (data[filho + 1].getDeaths() > data[filho].getDeaths())) {filho++;}
                if (data[filho].getDeaths() > t.getDeaths()){
                    data[pai] = data[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                }else {break;}
            }
            data[pai] = t;
        }
    }

    public void heapSortForConfirmed(Dataset_covid data[]) {
        int tamanho = data.length;
        int i = tamanho / 2, pai, filho;
        Dataset_covid t;
        while (true){
            if (i > 0){
                i--;
                t = data[i];
            }else{
                tamanho--;
                if (tamanho <= 0) {return;}
                t = data[tamanho];
                data[tamanho] = data[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (data[filho + 1].getConfirmed() > data[filho].getConfirmed())) {filho++;}
                if (data[filho].getConfirmed() > t.getConfirmed()){
                    data[pai] = data[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                }else {break;}
            }
            data[pai] = t;
        }
    }

    public void heapSortNameCity(Dataset_covid data[]) {
        int tamanho = data.length;
        int i = tamanho / 2, pai, filho;
        Dataset_covid t;
        while (true){
            if (i > 0){
                i--;
                t = data[i];
            }else{
                tamanho--;
                if (tamanho <= 0) {return;}
                t = data[tamanho];
                data[tamanho] = data[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (data[filho + 1].getCity().compareTo(data[filho].getCity())) > 0) {filho++;}
                if (data[filho].getCity().compareTo(t.getCity()) > 0){
                    data[pai] = data[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                }else {break;}
            }
            data[pai] = t;
        }
    }
}
