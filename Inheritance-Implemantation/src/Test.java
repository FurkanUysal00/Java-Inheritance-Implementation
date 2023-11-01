import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Shape> list=new ArrayList<Shape>();

        for(int i=0;i<5;i++){
            list.add(new Circle(Math.random()*10,Math.random()*10,Math.random()*10));
        }
        for(int i=0;i<5;i++){
            list.add(new Rectangle(Math.random()*10,Math.random()*10,Math.random()*10,Math.random()*10));
        }

        getInfo(list);
    }
    private static void getInfo(ArrayList<Shape> list){
        for(Shape e: list){
            System.out.println(e);
            System.out.println();
        }
    }
}