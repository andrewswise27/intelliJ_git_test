public class Runner {
    public static void main(String[] args) {
        Planets mars;

        mars = new Planets("Mars", 908973);
        System.out.println(mars.getName() + " is " + mars.getSize());
        System.out.println(mars.explode());

    }
}
