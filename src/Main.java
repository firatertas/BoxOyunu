public class Main {
    public static void main(String[] args) {


        Fighter f1 = new Fighter("Ali",20,100,100,40,50);
        Fighter f2 = new Fighter("Hasan", 20,100,85,35,50);

        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}