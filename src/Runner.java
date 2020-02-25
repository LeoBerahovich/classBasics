public class Runner {
    public static void main(String[] args) {
        car myCar = new car();
        System.out.print(myCar.toString());
        myCar.drive(15);
        System.out.print(myCar.toString());
        Rectangle myRekt = new Rectangle(15, 15);
        System.out.println(myRekt.getDiagonal());
        System.out.println(myRekt.getArea());
        System.out.println(myRekt.isSquare());
    }
}
