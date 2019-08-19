package Domain;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String accessrole;

    public Person(String id, String firstname, String lastname, String email, String accessrole) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.accessrole = accessrole;
    }

    public String getId(){
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getAccessrole() {
        return accessrole;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAccessrole(String accessrole) {
        this.accessrole = accessrole;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", accessrole='" + accessrole + '\'' +
                '}';
    }
}
