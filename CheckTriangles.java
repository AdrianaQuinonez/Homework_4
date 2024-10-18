package Homework_4;

public class CheckTriangles {
    public static void main(String[] args) {
        try{
            Triangle triangle1 = new Triangle(5.0,6.3,5);
            System.out.println(triangle1.checkSide());
            Triangle triangle2 = new Triangle(1,2,8);
            System.out.println(triangle2.checkSide());
        }catch(IllegalTriangleSideException e){
            System.out.println(e.getMessage());
        }
    }
}
