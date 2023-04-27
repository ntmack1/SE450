package HW1;

public abstract class PriceFactory {

    public static Price makePrice(int value) {
        Price price = new Price(value);

        return price;
    }

    public static Price makePrice(String stringValueIn) {
        String removeCommasandDecimal = stringValueIn.replaceAll("[,.]", "");

        String removeDollarSign = removeCommasandDecimal.replaceAll("[$]", "");

        int value = Integer.parseInt(removeDollarSign);

        Price price = new Price(value);

        return price;
    }
}
