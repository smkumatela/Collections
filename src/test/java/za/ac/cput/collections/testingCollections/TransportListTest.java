package za.ac.cput.collections.testingCollections;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.collections.domain.TransportList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Songezo on 2016-03-10.
 */
public class TransportListTest {

    TransportList road;
    TransportList air;
    TransportList water;
    TransportList railWayLine;

    @Before
    public void setUp() throws Exception {
        road = new TransportList("Car", "Road Transport");
        air = new TransportList("Plane", "Air Transport");
        water = new TransportList("Boat", "Water Transport");
        railWayLine = new TransportList("Train", "Rail Way Line Transport");
    }


    @Test
    public void testLists() throws Exception {

        List transList = new ArrayList();

        transList.add(road.getTransportName());
        transList.add(air.getTransportName());
        transList.add(water.getTransportName());
        transList.add(railWayLine.getTransportName() + "\n");

        System.out.print(transList + "\n");
        System.out.print("The size of Transports is:  " + transList.size() + "\n");

        transList.add(0, railWayLine.getTransportName());
        System.out.print(transList + "\n");
        System.out.print("The size of Transports is now:  " + transList.size());

        transList.remove(0);
        System.out.print(transList);
        System.out.print("And The size of Transports is now:  " + transList.size());

        Assert.assertEquals("Car", road.getTransportName());
    }

    @After
    public void tearDown() throws Exception {

    }

}
