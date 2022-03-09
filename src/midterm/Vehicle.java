package midterm;

public abstract class Vehicle implements Steerable {
    private String productId;
    private Integer weight;

    public Vehicle(String productId, Integer weight) {
        this.productId = productId;
        setWeight(weight);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        if (weight < 0) {
            this.weight = null;
        } else {
            this.weight = weight;

        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return getProductId().equals(vehicle.getProductId());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "productId='" + productId + '\'' +
                ", weight=" + weight +
                '}';
    }
}
