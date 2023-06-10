package SaturdayProjects.Week3;

public class Country {
    String name;
    String continent;
    long population;
    boolean isConnectedToWater;

    public Country (String name) {
        this.name = name;
        System.out.println("The country name is: " + name);
    }
    public Country (String name, String continent){
        this.continent = continent;
        System.out.println("The continent is: " + continent);
    }
    public Country(String name, String continent, long population){
        this.population=population;
        System.out.println("The population is : " + population);
    }
    public Country (String name, String continent, long population, boolean isConnectedToWater){
        this.isConnectedToWater = isConnectedToWater;
        System.out.println("Is it connected to water ?" + isConnectedToWater);
    }

    public static class CountryMain{
        public static void main(String[] args) {
            Country c1 = new Country("US");
            Country c2 = new Country("US","NorthAmerica");
            Country c3 = new Country("US","North America", 350000000);
            Country c4 = new Country("US","North America", 350000000, true);
        }
    }
}
