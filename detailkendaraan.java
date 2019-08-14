class DetailKendaraan {
    public static void main(String[] args) {
        
        Motor m = new Motor("Motor", "Honda", 2, 18000000, 2);

        System.out.println(m.print(m));
    }
}