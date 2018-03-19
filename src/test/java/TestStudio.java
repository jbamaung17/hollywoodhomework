import db.DBHelper;
import models.Studio;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestStudio{

    private Studio studio;


    @Before
    public void before() {
        Studio studio = new Studio("MGM", 4000);
        DBHelper.save(studio);
        Studio studio2 = new Studio("Universal", 5000);
        DBHelper.save(studio2);
    }

    @Test
    public void canSave() {
        List<Studio> results = DBHelper.getAll(Studio.class);
        assertEquals(2, results.size());
    }

}
