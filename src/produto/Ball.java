package produto;

public class Ball extends Product {
    public Ball(String name, double price) {
        super(name, price);

    }

    @Override
    public void update(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
