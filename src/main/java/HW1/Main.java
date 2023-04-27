package HW1;

public class Main {

    public static void main(String[] args) {
        Price price1 = PriceFactory.makePrice("12.85");
        Price price2 = PriceFactory.makePrice("-12.85");
        Price price3 = PriceFactory.makePrice("$12.85");
        Price price4 = PriceFactory.makePrice("$-12.85");

        Price price5 = PriceFactory.makePrice(-12);
        Price price6 = PriceFactory.makePrice(12);



        System.out.println(price1.isNegative());
        System.out.println(price2.isNegative());
        System.out.println(price3.isNegative());
        System.out.println(price4.isNegative());
        System.out.println(price5.isNegative());
        System.out.println(price6.isNegative());

    }
}
