import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private int age;
    private String name;
    private String email;
    private String password;
    private List<Visit> visitList;

    public User(int age, String name, String email, String password) throws Exception {
        setAge(age);
        this.name = name;
        this.email = email;
        this.password = password;
        this.visitList = new ArrayList<>();
        setEmail(email);

    }

    public void setAge(int age) throws Exception {
        if(age < 18){
            throw new Exception(String.format("Person age %d cannot be below 18 !", age));
        }else{
            this.age = age;
        }
    }

    public void addVisit(Visit visit){
        if(visit != null && visit.getUser() == this) {
            visitList.add(visit);
        }
    }
    public int getAge() {
        return age;
    }

    public List<Visit> getVisitList() {
        return visitList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(!matcher.matches()){
            throw new Exception("Incorrect email format");
        }
        else {
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", visitList=" + visitList +
                '}';
    }
}
