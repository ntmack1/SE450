package HW1;

public abstract class PriceFactory {

    public static Price makePrice(int value) {
        return new Price(value);
    }

    public static Price makePrice(String stringValueIn) {
        String removeCommasAndDecimal = stringValueIn.replaceAll("[,.]", "");

        String removeDollarSign = removeCommasAndDecimal.replaceAll("[$]", "");

        int value = Integer.parseInt(removeDollarSign);

        return new Price(value);
    }
}
