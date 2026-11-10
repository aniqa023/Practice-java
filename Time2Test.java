public class Time2Test {

    public static void main(String[] args) {

        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21, 34);
        Time2 t4 = new Time2(12, 25, 42);
        Time2 t5 = new Time2(t4);

        System.out.println("Constructed with:");

        displayTime("t1: Default arguments", t1);
        displayTime("t2: Hour specified", t2);
        displayTime("t3: Hour and minute specified", t3);
        displayTime("t4: Hour, minute and second", t4);
        displayTime("t5: Copy of t4", t5);

        try {
            Time2 t6 = new Time2(27, 74, 99);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void displayTime(String header, Time2 t) {

        System.out.println(header);
        System.out.println(t.toUniversalString());
        System.out.println(t.toString());
    }
}

