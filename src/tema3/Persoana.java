package tema3;

import java.util.Locale;

public class Persoana {
    public static String curs;
    private String firstName;
    private String lastName;
    private String city;
    private Integer age;
    private boolean esteCasatorit;

    public Persoana(String firstName, String lastName, String city, Integer age, boolean esteCasatorit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
        this.esteCasatorit = esteCasatorit;
    }

    public Persoana (){

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        age = incrementAge(age);
        this.age = age;
    }

    public boolean isEsteCasatorit() {
        return esteCasatorit;
    }

    public void setEsteCasatorit(boolean esteCasatorit) {
        this.esteCasatorit = esteCasatorit;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", age='" + age + '\'' +
                ", esteCasatorit=" + esteCasatorit +
                ", curs=" + curs +
                '}';
    }
    public String obtineIdentificator(String firstName, String lastName){
       StringBuilder ID = new StringBuilder();
       ID.append(firstName.toLowerCase());
       ID.append("_");
       ID.append(lastName.toUpperCase());
        return ID.toString();

    }

    private Integer incrementAge(Integer age){
        return age + 1;
    }
}
