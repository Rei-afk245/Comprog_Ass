public class Exercise2 {
    private String id, desc;
    private double unitPrice;
    private int qty;

    public Exercise2(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        setQty(qty);
        setUnitPrice(unitPrice);

    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getID() {
        return id;
    }

    public int getQty() {
        return this.qty;
    }

    public String getDesc() {
        return desc;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    public void ToString() {
        System.out.println("*************************************");
        System.out.println("*    ID              : " + getID() + "        *");
        System.out.println("*    Description     : " + getDesc() + "    *");
        System.out.printf("*    Price           : Php %.2f    *\n", unitPrice);
        System.out.println("*    Quantity        : " + getQty() + "            *");
        System.out.printf("*    Total           : Php%.2f     *\n", getTotal());
        System.out.println("*************************************");
    }
}
