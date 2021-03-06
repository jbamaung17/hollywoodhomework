package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="actors")
public class Actor {
    private int id;
    private String name;
    private Set<Film> films;

    public Actor() {}

    public Actor(String name) {
        this.name = name;
        this.films = new HashSet<Film>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
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

    @ManyToMany
    @JoinTable(name="actor_films", joinColumns = {@JoinColumn(name="actor_id", nullable = false, updatable = false)},
    inverseJoinColumns = {@JoinColumn(name="film_id", nullable = false, updatable = false)}
    )
    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }

    public void addFilm(Film film) {
        this.films.add(film);
    }

}
