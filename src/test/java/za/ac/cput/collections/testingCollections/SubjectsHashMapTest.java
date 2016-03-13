package za.ac.cput.collections.testingCollections;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.collections.domain.SubjectsHashMaps;

import java.util.HashMap;

/**
 * Created by Songezo on 2016-03-10.
 */
public class SubjectsHashMapTest {

    SubjectsHashMaps firstYearSubj;
    SubjectsHashMaps secondYearSubj;
    SubjectsHashMaps thirdYearSubj;

    @Before
    public void setUp() throws Exception {

        firstYearSubj = new SubjectsHashMaps("Development Software 1", "DOS100S");
        secondYearSubj = new SubjectsHashMaps("Information Systems II", "ISY200S");
        thirdYearSubj = new SubjectsHashMaps("Technical Programming 2/3", "TPG300S");
    }

    @Test
    public void testHashMap() throws Exception {

        HashMap <String, String> subjectType = new HashMap<String, String>();

        subjectType.put(firstYearSubj.getSubjectName(), firstYearSubj.getSubjectCode());
        subjectType.put(secondYearSubj.getSubjectName(), secondYearSubj.getSubjectCode());
        subjectType.put(thirdYearSubj.getSubjectName(), thirdYearSubj.getSubjectCode());

        System.out.print("Here are the subjects " + subjectType + "\n");
        System.out.print("The size of the subjects is: " + subjectType.size() + "\n");

        subjectType.remove("Development Software 1");
        System.out.print("Here are the subjects " + subjectType + "\n");
        System.out.print("The size of the subjects is: " + subjectType.size() + "\n");

        subjectType.clear();
        System.out.print("Here are the subjects " + subjectType + "\n");
        System.out.print("The size of the subjects is: " + subjectType.size() + "\n");

        Assert.assertEquals("DOS100S", firstYearSubj.getSubjectCode());
    }

    @After
    public void tearDown() throws Exception {

    }
}
