package HW1;

public class Main {

    public static void main(String[] args) {
        Price price1 = PriceFactory.makePrice("$-12.85");
        Price price2 = PriceFactory.makePrice(-12);


        System.out.println(price2.isNegative());
    }
}
