import java.util.ArrayList;
import java.util.List;

public class Bar {
    private String name;
    private String phoneNumber;
    private List<Beer> beerMenu;
    private List<Beer> sponsoredBeers;
    private List<Visit> visitList;
    private List<Review> reviewList;

    public Bar(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.beerMenu = new ArrayList<>();
        this.sponsoredBeers = new ArrayList<>();
        this.visitList = new ArrayList<>();
        this.reviewList = new ArrayList<>();
    }

    public void addBeer(Beer beer){
        if(!beerMenu.contains(beer)){
            beerMenu.add(beer);
            beer.addBar(this);
        }
        else {
            System.out.println("Beer already is in a menu");
        }
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void addSponsoredBeer(Beer beer){
        if(!sponsoredBeers.contains(beer) && beerMenu.contains(beer)){
            sponsoredBeers.add(beer);
            beer.addSponsoringBar(this);
        }
        else {
            System.out.println("Beer " + beer.getName() + " already is a sponsor or it is not in the menu");
        }
    }

    public void addVisit(Visit visit){
        if(visit!=null && visit.getBar() == this){
            visitList.add(visit);
        }
    }

    public List<Visit> getVisitList() {
        return visitList;
    }

    public List<Beer> getBeerMenu(){
        return beerMenu;
    }

    public List<Beer> getSponsoredBeers(){
        return sponsoredBeers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
