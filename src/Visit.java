import java.time.LocalDate;

public class Visit {
    LocalDate visitDate;
    double hoursSpent;
    User user;
    Bar bar;

    public Visit(LocalDate visitDate, double hoursSpent, User user, Bar bar) {
        this.visitDate = visitDate;
        this.hoursSpent = hoursSpent;
        this.user = user;
        user.addVisit(this);
        this.bar = bar;
        bar.addVisit(this);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public double getHoursSpent() {
        return hoursSpent;
    }

    public void setHoursSpent(double hoursSpent) {
        this.hoursSpent = hoursSpent;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "visitDate=" + visitDate +
                ", hoursSpent=" + hoursSpent +
                ", user=" + user.getName() +
                ", bar=" + bar.getName() +
                '}';
    }
}
