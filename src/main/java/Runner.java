import db.DBHelper;
import models.Actor;
import models.Director;
import models.Film;
import models.Studio;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Studio studio1 = new Studio ("LucasFilm", 500);
        DBHelper.save(studio1);

        Director director1 = new Director("George Lucas");
        DBHelper.save(director1);

        Actor actor1 = new Actor("Mark Hamill");
        DBHelper.save(actor1);
        Actor actor2 = new Actor("Carrie Fisher");
        DBHelper.save(actor2);
        Actor actor3 = new Actor("Harrison Ford");
        DBHelper.save(actor3);

        Film film1 = new Film("A New Hope", director1, studio1, 70);
        DBHelper.save(film1);
        Film film2 = new Film("The Empire Strikes Back", director1, studio1, 90);
        DBHelper.save(film2);
        Film film3 = new Film("The Return of the Jedi", director1, studio1, 100);
        DBHelper.save(film3);


        List<Actor> allActors = DBHelper.getAll(Actor.class);
        List<Film> allFilms = DBHelper.getAll(Film.class);



    }
}
