enum House {
    Villa(1000),Hut(200),Apartment(500);
    private int price;
    House(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
    public static void main(String args[]){
        System.out.println("All house prices:");
        for (House h : House.values()) System.out.println(
                h + " costs " + h.getPrice() + "$");
    }
}