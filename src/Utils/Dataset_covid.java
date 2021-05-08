package Utils;

public class Dataset_covid {
    private String date;
    private String state;
    private String city;
    private String place_type;
    private Integer confirmed;
    private Integer deaths;
    private String order_for_place;
    private String is_last;
    private String estimated_population_2019;
    private String city_ibge_code;
    private String confirmed_per_100k_inhabitants;
    private String death_rate;

    public Dataset_covid(String date, String state, String city, String place_type, Integer confirmed, Integer deaths, String order_for_place, String is_last, String estimated_population_2019, String city_ibge_code, String confirmed_per_100k_inhabitants, String death_rate){
        this.date = date;
        this.state = state;
        this.city = city;
        this.place_type = place_type;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.order_for_place = order_for_place;
        this.is_last = is_last;
        this.estimated_population_2019 = estimated_population_2019;
        this.city_ibge_code = city_ibge_code;
        this.confirmed_per_100k_inhabitants = confirmed_per_100k_inhabitants;
        this.death_rate = death_rate;
    }

    public String getDate() { return this.date; }
    public String getState() { return this.state; }
    public String getCity() { return this.city; }
    public String getPlace_type() { return this.place_type; }
    public Integer getConfirmed() { return this.confirmed; }
    public Integer getDeaths() { return this.deaths; }
    public String getOrder_for_place() { return this.order_for_place; }
    public String getIs_last() { return this.is_last; }
    public String getEstimated_population_2019() { return this.estimated_population_2019; }
    public String getCity_ibge_code() { return this.city_ibge_code; }
    public String getConfirmed_per_100k_inhabitants() { return this.confirmed_per_100k_inhabitants; }
    public String getDeath_rate() { return this.death_rate; }
}