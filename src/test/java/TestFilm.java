import db.DBHelper;
import models.Director;
import models.Film;
import models.Studio;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFilm {
    private Film film;
    private Director director;
    private Studio studio;

    @Before
    public void before() {
        Director director = new Director("George Lucas");
        DBHelper.save(director);
        Studio studio = new Studio("LucasFilm", 3);
        DBHelper.save(studio);
        Film film = new Film("Star Wars", director, studio, 4);
        DBHelper.save(film);

    }

    @Test
    public void canSaveFilm() {
        List<Film> results = DBHelper.getAll(Film.class);
        assertEquals(1, results.size());
    }
}
