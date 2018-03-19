import db.DBHelper;
import models.Actor;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestActor {

    private Actor actor;


    @Before
    public void before() {
        Actor actor1 = new Actor("Angelina Jolie");
        DBHelper.save(actor1);
    }

    @Test
    public void actorCanSave() {
        List<Actor> results = DBHelper.getAll(Actor.class);
        assertEquals(1, results.size());
    }

}

