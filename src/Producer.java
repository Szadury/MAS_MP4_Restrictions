import java.util.*;

public class Producer {
    private TreeSet<Beer> beerSet;
    private static Comparator<Beer> beerComparator = Comparator.comparing(Beer::getName);
    private String name;
    private String country;

    public Producer(String name, String country) {
        this.beerSet = new TreeSet<>(beerComparator);
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

