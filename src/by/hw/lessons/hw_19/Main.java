package by.hw.lessons.hw_19;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        StringProcessor toUpperCase = (input) -> input.toUpperCase();

        City city1 = new City(1, "Minsk", 2000000, Continent.EURASIA);
        City city2 = new City(2, "Chicago", 2696555, Continent.NORTH_AMERICA);
        City city3 = new City(3, "Tokyo", 14043239, Continent.EURASIA);
        City city4 = new City(4, "Lima", 910431, Continent.SOUTH_AMERICA);
        City city5 = new City(5, "Sydney", 5_000_000, Continent.AUSTRALIA);
        City city6 = new City(6, "Lagos", 13745000, Continent.AFRICA);

        List<City> cities = Arrays.asList(city1, city2, city3, city4, city5, city6);

        City maxPopEurope = cities.stream()
                .filter(c -> c.getContinent() == Continent.EURASIA)
                .max(Comparator.comparingInt(City::getPopulation))
                .orElse(null);

        City minPopEurope = cities.stream()
                .filter(c -> c.getContinent() == Continent.EURASIA)
                .min(Comparator.comparingInt(City::getPopulation))
                .orElse(null);

        City maxPopGlobal = cities.stream()
                .max(Comparator.comparingInt(City::getPopulation))
                .orElse(null);

        City minPopGlobal = cities.stream()
                .min(Comparator.comparingInt(City::getPopulation))
                .orElse(null);

        City firstOverMillion = cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .findFirst()
                .orElse(null);

        List<City> citiesOverMillion = cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .collect(Collectors.toList());

        List<String> cityNames = cities.stream()
                .map(City::getName)
                .collect(Collectors.toList());

        System.out.println("Самый населённый город в Европе: " + maxPopEurope);
        System.out.println("Город с минимальным населением в Европе: " + minPopEurope);
        System.out.println("Самый населённый город в мире: " + maxPopGlobal);
        System.out.println("Город с самым маленьким населением: " + minPopGlobal);
        System.out.println("Первый город с населением > 1 млн: " + firstOverMillion);
        System.out.println("Все города с населением > 1 млн: " + citiesOverMillion);
        System.out.println("Названия всех городов: " + cityNames);
    }
}