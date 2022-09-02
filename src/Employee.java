import java.util.StringJoiner;

public class Employee {
   private  String name;
    private String surname;
   private  int yearofbith;
   private  int startyearofwork;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearofbith() {
        return yearofbith;
    }

    public void setYearofbith(int yearofbith) {
        this.yearofbith = yearofbith;
    }

    public int getStartyearofwork() {
        return startyearofwork;
    }

    public void setStartyearofwork(int startyearofwork) {
        this.startyearofwork = startyearofwork;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("surname='" + surname + "'")
                .add("yearofbith=" + yearofbith)
                .add("startyearofwork=" + startyearofwork)
                .toString();
    }
}
