public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Dima");
        Human human3 = new Human("Roma");
        Human human4 = new Human("Nastya");

        market.acceptToMarket(human1);
        market.update();
        System.out.println();
        market.acceptToMarket(human2);
        market.update();
        System.out.println();
        market.acceptToMarket(human3);
        market.update();
        System.out.println();
        market.acceptToMarket(human4);
        market.update();

    }
}