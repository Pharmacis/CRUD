package web.model;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table
public class User {

    private Long id;
    private String name;
    private String profession;
    private int age;

    public User(String name,String profession,int age) {

        this.name = name;
        this.profession = profession;
        this.age = age;
    }

    public User() {
    }
    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    @Column
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge () == user.getAge () &&
                Objects.equals (getName (), user.getName ()) &&
                Objects.equals (getProfession (), user.getProfession ());
    }

    @Override
    public int hashCode() {
        return Objects.hash (getName (), getProfession (), getAge ());
    }

    @Override
    public String toString() {
        return "User" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", age=" + age;
    }
}
