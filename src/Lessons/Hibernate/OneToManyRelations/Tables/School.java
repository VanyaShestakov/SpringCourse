package Lessons.Hibernate.OneToManyRelations.Tables;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "schools")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "number")
    private int number;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "school", cascade = {
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.PERSIST,
            CascadeType.DETACH})
    private List<Teacher> teachers = new ArrayList<>();

    public School() {
    }

    public School(int number, String email) {
        this.number = number;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", number=" + number +
                ", email='" + email + '\'' +
                '}';
    }

    public void add(Teacher teacher){
        teachers.add(teacher);
        teacher.setSchool(this);
    }
}
