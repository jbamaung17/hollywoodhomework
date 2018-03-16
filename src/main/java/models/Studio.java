package models;

import javax.persistence.*;

@Entity
@Table(name="studios")
public class Studio {
    private int id;
    private String name;
    private int budget;
    private Set<Films> films;

    public Studio() {
    }

    public Studio(String name, int budget) {
        this.name = name;
        this.budget = budget;
        this.films = films;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "budget")
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @OneToMany(mappedBy = "studio")
    public Set<Films> getFilms() {
        return films;
    }

    public void setFilms(Set<Films> films) {
        this.films = films;
    }
}
