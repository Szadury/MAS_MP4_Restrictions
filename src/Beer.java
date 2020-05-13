import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Beer {
    private String name; //Unique
    private static Map<String, Beer> beerMap = new HashMap<>();
    private String wheatType;
    private String IBU;
    private List<Bar> barList;
    private List<Bar> sponsoringBarList;
    private List<Review> reviewList;

    public Beer(String name, String wheatType, String IBU) throws Exception {
        setName(name);
        this.wheatType = wheatType;
        this.IBU = IBU;
        this.barList = new ArrayList<>();
        this.sponsoringBarList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(!beerMap.containsKey(name)) {
            if(this.name!= null) {
                beerMap.remove(this.name);
            }
            beerMap.put(name, this);
            this.name = name;
        }
        else{
            throw new Exception("Name already exists in other beer");
        }
    }

    public List<Bar> getBarList() {
        return barList;
    }

    public List<Bar> getSponsoringBarList() {
        return sponsoringBarList;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void addBar(Bar bar){
        if(!barList.contains(bar)){
            barList.add(bar);
        }
    }

    public void addSponsoringBar(Bar bar){
        if(!sponsoringBarList.contains(bar) && barList.contains(bar)){
            sponsoringBarList.add(bar);
        }else{
            System.out.println("Bar already is sponsored or it is not in the menu");
        }
    }

    public static Map<String, Beer> getBeerMap() {
        return getBeerMap();
    }

    public String getWheatType() {
        return wheatType;
    }

    public void setWheatType(String wheatType) {
        this.wheatType = wheatType;
    }

    public String getIBU() {
        return IBU;
    }

    public void setIBU(String IBU) {
        this.IBU = IBU;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", wheatType='" + wheatType + '\'' +
                ", IBU='" + IBU + '\'' +
                ", barList=" + barList +
                ", sponsoringBarList=" + sponsoringBarList +
                '}';
    }
}
