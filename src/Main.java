import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------ Ograniczenie atrybutu -------------------------------");
        User user1 = new User(18, "adam testowy", "atest@tt.tt", "123ewq");
        System.out.println(user1);
        User user;
        try{
            user = new User(17, "adam testowy", "atest@tt.tt", "123ewq");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            user1.setAge(16);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("------------------ Ordered -------------------------------");

        Beer beer1 = new Beer("Amsterdam", "Brytyjskie", "12");
        Beer beer2 = new Beer("B", "Brytyjskie", "12");
        Beer beer3 = new Beer("Albert", "Brytyjskie", "12");
        Producer producer = new Producer("Heineken", "Holandia");
        producer.addBeer(beer1);
        producer.addBeer(beer2);
        producer.addBeer(beer3);
        producer.addBeer(beer1);
        System.out.println(producer.getBeerSet());

        System.out.println("------------------ Unikatowość -------------------------------");
        System.out.println(beer2);
        try {
            beer2.setName("Albert");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            Beer beer4 = new Beer("Amsterdam", "Brytyjskie", "12");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(Beer.getBeerMap());

        System.out.println("------------------ Subset -------------------------------");
        Beer beer4 = new Beer("Amster", "Holenderskie", "12");

        Bar bar = new Bar("Bulldog", "123456789");
        bar.addBeer(beer1);
        bar.addBeer(beer2);
        bar.addBeer(beer3);
        bar.addSponsoredBeer(beer1);
        bar.addSponsoredBeer(beer4);
        System.out.println(bar.getBeerMenu());
        System.out.println(bar.getSponsoredBeers());

        System.out.println("------------------ XOR -------------------------------");
        Review review1 = new Review(beer1, user1, 5.0, "", LocalDate.now());
        review1.setBar(bar);
        Review review2 = new Review(bar, user1, 5.0, "", LocalDate.now());
        Bar bar1 = new Bar("Amrit", "123456789");
        review2.setBar(bar1);
        review2.setBeer(beer1);
        System.out.println(review1);
        System.out.println(review2);

        System.out.println("------------------ BAG -------------------------------");
        Visit visit = new Visit(LocalDate.now(), 2.0, user1, bar);
        Visit visit1 = new Visit(LocalDate.of(2020, 3, 14), 2.0, user1, bar);
        System.out.println(visit);
        System.out.println(visit1);
        System.out.println(user1.getVisitList());

        System.out.println("------------------ Dowolne własne -------------------------------");
        try {
            User userBadEmail = new User(18, "Paweł", "www@", "wasd");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
