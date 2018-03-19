import db.DBHelper;
import models.Director;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestDirector {

    private Director director;

    @Before
    public void before() {
        Director director1 = new Director("George Lucas");
        DBHelper.save(director1);
    }

    @Test
    public void directorCanBeSaved() {
        List<Director> results = DBHelper.getAll(Director.class);
        assertEquals(1, results.size());
    }
}
