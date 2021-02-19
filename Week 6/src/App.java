public class App {
    public static void main(String[] args) throws Exception {
        TallyCounter tally = new TallyCounter();
        System.out.println(tally);
        tally.increment();
        tally.increment();
        System.out.println(tally);
        System.out.println(tally.read());
        tally.reset();
        System.out.println(tally);

        TallyCounter tally2 = new TallyCounter(5);
        System.out.println(tally2);
        tally2.increment();
        tally2.increment();
        System.out.println(tally2);
        tally2.decrement();
        tally2.decrement();
        tally2.decrement();
        System.out.println(tally2);
        tally2.reset();
        System.out.println(tally2);
    }
}
