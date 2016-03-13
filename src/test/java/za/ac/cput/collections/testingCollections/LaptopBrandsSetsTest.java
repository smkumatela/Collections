package za.ac.cput.collections.testingCollections;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.collections.domain.LaptopBrandsSets;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Songezo on 2016-03-11.
 */
public class LaptopBrandsSetsTest {

    LaptopBrandsSets laptopBrandsSets;

    @Before
    public void setUp() throws Exception {
        laptopBrandsSets = new LaptopBrandsSets("HP", "Pentium 4");

    }

    @Test
    public void testSetMaps() throws Exception {
        Set <String>  set = new HashSet<String>();

        set.add("Lenovo");
        set.add("Dell");
        set.add("HP");
        set.add("Accer");
        set.add("Samsung");
        set.add(laptopBrandsSets.getBrandName());


        System.out.print("Set List is: " + set + "\n");
        System.out.print("Set Size is: " + set.size() + "\n");

        set.remove("Dell");
        System.out.print("Set List is: " + set + "\n");
        System.out.print("Set Size is: " + set.size() + "\n");

        Assert.assertEquals("HP", laptopBrandsSets.getBrandName());


    }

    @After
    public void tearDown() throws Exception {

    }
}
