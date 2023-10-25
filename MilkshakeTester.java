import org.junit.Test;

public class MilkshakeTester extends Autograder {

    @Test
    public void testName1() {
        test("testName1", (params) -> {
            Milkshake milkshake = new Milkshake("vanilla", 3.50, false);
            return milkshake.getName();
        }, new Object[] {}, "vanilla milkshake", 10);
    }

    @Test
    public void testGetPrice1() {
        test("testGetPrice1", (params) -> {
            Milkshake milkshake = new Milkshake("vanilla", 3.50, false);
            return milkshake.getPrice();
        }, new Object[] {}, 3.50, 10);
    }

    @Test
    public void testGetTotalPrice1_1() {
        test("testGetTotalPrice1_1", (params) -> {
            Milkshake milkshake = new Milkshake("vanilla", 3.50, false);
            return milkshake.getTotalPrice();
        }, new Object[] {}, 3.50, 10);
    }

    @Test
    public void testGetTotalPrice1_2() {
        test("testGetTotalPrice1_2", (params) -> {
            Milkshake milkshake = new Milkshake("vanilla", 3.50, false);
            milkshake.setChocolate(true);
            return milkshake.getTotalPrice();
        }, new Object[] {}, 7.00, 10);
    }

    @Test
    public void testToString1() {
        test("testToString1", (params) -> {
            Milkshake milkshake = new Milkshake("vanilla", 3.50, false);
            return milkshake.toString();
        }, new Object[] {}, "Thank you for visiting our food truck. Enjoy your vanilla milkshake.", 10);
    }

    // SECTION 2 -- STARTING WITH CHOCOLATE, THEN GOING BACK
    @Test
    public void testName2() {
        test("testName2", (params) -> {
            Milkshake milkshake = new Milkshake("strawberry", 4.75, true);
            return milkshake.getName();
        }, new Object[] {}, "strawberry milkshake", 10);
    }

    @Test
    public void testGetPrice2() {
        test("testGetPrice2", (params) -> {
            Milkshake milkshake = new Milkshake("strawberry", 4.75, true);
            return milkshake.getPrice();
        }, new Object[] {}, 4.75, 10);
    }

    @Test
    public void testGetTotalPrice2_1() {
        test("testGetTotalPrice2_1", (params) -> {
            Milkshake milkshake = new Milkshake("strawberry", 4.75, true);
            return milkshake.getTotalPrice();
        }, new Object[] {}, 9.50, 10);
    }

    @Test
    public void testGetTotalPrice2_2() {
        test("testGetTotalPrice2_2", (params) -> {
            Milkshake milkshake = new Milkshake("strawberry", 4.75, true);
            milkshake.setChocolate(false);
            return milkshake.getTotalPrice();
        }, new Object[] {}, 4.75, 10);
    }

    @Test
    public void testToString2() {
        test("testToString2", (params) -> {
            Milkshake milkshake = new Milkshake("strawberry", 4.75, true);
            return milkshake.toString();
        }, new Object[] {}, "Thank you for visiting our food truck. Enjoy your strawberry milkshake.", 10);
    }
}
