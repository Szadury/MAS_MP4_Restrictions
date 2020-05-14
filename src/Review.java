import java.time.LocalDate;

public class Review {
    private Bar bar;
    private Beer beer;
    private User user;
    private double rate;
    private String description;
    private LocalDate date;

    public Review(Beer beer, User user, double rate, String description, LocalDate date) throws Exception {
        if(beer == null){
            throw new Exception("Can't create beer review without a beer");
        }
        this.beer = beer;
        this.bar = null;
        this.user = user;
        this.rate = rate;
        this.description = description;
        this.date = date;
    }

    public Review(Bar bar, User user, double rate, String description, LocalDate date) throws Exception {
        if(bar == null){
            throw new Exception("Can't create bar review without a bar");
        }
        this.bar = bar;
        this.beer = null;
        this.user = user;
        this.rate = rate;
        this.description = description;
        this.date = date;
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        if(this.bar != null) {
            this.bar = bar;
        }
        else{
            System.out.println("Cant fill bar field. This is review for Beer");
        }
    }

    public Beer getBeer() {
        return beer;
    }

    public void setBeer(Beer beer) {
        if(this.beer != null) {
            this.beer = beer;
        }
        else{
            System.out.println("Cant fill beer field. This is review for Bar");
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        if(bar!=null){
            return "Review{" +
                    "bar=" + bar.getName() +
                    ", user=" + user +
                    ", rate=" + rate +
                    ", description='" + description + '\'' +
                    ", date=" + date +
                    '}';
        }
        else{
            return "Review{" +
                    ", beer=" + beer.getName() +
                    ", user=" + user +
                    ", rate=" + rate +
                    ", description='" + description + '\'' +
                    ", date=" + date +
                    '}';
        }
    }
}
