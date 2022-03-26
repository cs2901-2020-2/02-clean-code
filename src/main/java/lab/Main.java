package lab;

import lab.demand.ManageDemand;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String [ ] args) {
        System.out.println("===INICIO====");
        ManageDemand mg = new ManageDemand();
        List<Long> testOrders = buildSampleOrders();
        long result = mg.filledOrders(testOrders, 10);
        System.out.println(String.format("RESULTADO => %s", result));
    }

    private static List<Long> buildSampleOrders() {
        List<Long> testOrders = new ArrayList<Long>();
        testOrders.add(10L);
        testOrders.add(20L);
        testOrders.add(30L);
        testOrders.add(11L);
        return testOrders;
    }

}
