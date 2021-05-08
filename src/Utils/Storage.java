package Utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class Storage {

    private static final Integer add_capacity = 10;
    private Dataset_covid[] data;
    private int size = 0;
    private int sizeAux = 0;


    public Storage() {
        data = new Dataset_covid[add_capacity];
    }

    private void moreSize() {
        int newSize = data.length + add_capacity;
        Dataset_covid temp[] = data;
        data = new Dataset_covid[newSize];
        for(int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    private void verifyNull(){
        int verify = 0;
        Dataset_covid temp[] = data;
        for(int i = 0; i < data.length; i++) {
            if(data[i] == null) {
                verify++;
            }
        }
        data = new Dataset_covid[temp.length - verify];

        for(int i = 0; i < data.length; i++) {
            data[i] = temp[i];
        }
    }

    public void add(Dataset_covid newData) {
        if(data.length == size){
            moreSize();
        }
        data[size] = newData;
        size++;
    }


    public void ReadFile (String path) {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = "";
            line = br.readLine();
            int i = 0;
            while(line != null) {
                String[] lines = line.split(",");
                if(lines[7].equals("True") && lines != null) {
                    i++;
                    add(new Dataset_covid(lines[0], lines[1], lines[2], lines[3], Integer.parseInt(lines[4]), Integer.parseInt(lines[5]), lines[6], lines[7], lines[8], lines[9], lines[10], lines[11]));
                }
                line = br.readLine();
            }
            verifyNull();
        } catch(IOException e) {
            System.out.println("Error = " + e);
        }
    }

    public void WriteFile(String path_output, Dataset_covid data[]) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path_output))) {
            String line = "";
            bw.write("date, state, city, place_type, confirmed, deaths, order_for_place, is_last, estimated_population_2019, estimated_population, city_ibge_code, confirmed_per_100k_inhabitants, death_rate" + '\n');
            for(int i = 0; i < data.length; i++) {
                if(data[i] != null) {
                    //System.out.println(data[i].getDeaths());
                    line = data[i].getDate() + ", " + data[i].getState() + ", " + data[i].getCity() + ", " + data[i].getPlace_type() + ", " + data[i].getConfirmed() + ", " + data[i].getDeaths() + ", " + data[i].getOrder_for_place() + ", " + data[i].getIs_last() + ", " + data[i].getEstimated_population_2019() + ", " + data[i].getCity_ibge_code() + ", " + data[i].getConfirmed_per_100k_inhabitants() + ", " + data[i].getDeath_rate();
                    bw.write(line + '\n');
                }
            }
        } catch(Exception e) {
            System.out.println("Error = " + e);
        }
    }

    public Dataset_covid[] getData() {
        return this.data;
    }
}