import java.awt.*;
import java.util.Random;



public abstract class Bird {
    private static int num=0;
  //  protected int a=0;
  //  protected int b=400;

    protected  int y;
    protected  int x;
    protected int size=10;
    protected Color color=Color.magenta;
    public Bird() {
        Random a=new Random();
        num++;

        y=-MyFrame.width/2+a.nextInt(MyFrame.width);
        x=-MyFrame.width/2+a.nextInt(MyFrame.width);
        System.out.println("2-ое случайное число: " + y);
        System.out.println("Я птица № "+num);

    }

    public void fly() {
        System.out.println("Я лечу");
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x,y,size,size);
    }
}
