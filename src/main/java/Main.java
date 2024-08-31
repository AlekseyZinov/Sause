public class Main {
    public static void main(String[] args) {
        Sauce chile = new Sauce("Чили", Sharpness.ОСТРЫЙ);
        Sauce tobasco = new Sauce("Тобаско", Sharpness.ОЧЕНЬ_ОСТРЫЙ);

        System.out.println(chile);
        System.out.println(tobasco);
    }
}
