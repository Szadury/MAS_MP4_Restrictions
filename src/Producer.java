import java.util.*;

public class Producer {
    private TreeSet<Beer> beerSet;
    private String name;
    private String country;

    public Producer(String name, String country) {
        Comparator<Beer> byName
                = Comparator.comparing(Beer::getName);
        this.beerSet = new TreeSet<>(byName);
        this.name = name;
        this.country = country;
    }

    public TreeSet<Beer> getBeerSet(){
        return beerSet;
    }

    public void addBeer(Beer beer){
        beerSet.add(beer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

