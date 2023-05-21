public class Products {
    private String name;
    private String type;
    private String place;
    private int Warranty;

    public Products() {
    }

    public Products(String name, String type, String place, int warranty) {
        this.name = name;
        this.type = type;
        this.place = place;
        this.Warranty = warranty;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getPlace() {
        return place;
    }

    public int getWarranty() {
        return Warranty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setWarranty(int warranty) {
        this.Warranty = warranty;
    }

    public String toString() {
        return "Products= {" + name + " , " + type + " , " + place + " , " + Warranty + "}";
    }
}
