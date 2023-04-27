package HW1;

import java.util.Objects;

public class Price {

    int price;

    public Price (int price) {
        this.price = price;
    }
    boolean isNegative() {
        return this.price < 0;
    }
    Price add(Price p) {
        return new Price(this.price + p.price);
    }

    Price subtract(Price p) {
        return new Price(this.price - p.price);
    }

    Price multiply(int n) {
        return new Price(this.price * n);
    }

    boolean greaterOrEqual(Price p) {
        return this.price >= p.price;
    }

    boolean lessOrEqual(Price p) {
        return this.price <= p.price;
    }

    boolean greaterThan(Price p) {
        return this.price > p.price;
    }

    boolean lessThan(Price p) {
        return this.price < p.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price1 = (Price) o;
        return price == price1.price;
    }

    int compareTo(Price p) {
        return this.price - p.price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

}




