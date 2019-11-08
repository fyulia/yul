import java.awt.*;


public class Pinguin extends Bird {
    public Pinguin(){
        System.out.println("Я пингвин!");

        color= Color.ORANGE;
    }
    @Override
    public void fly(){
        System.out.println("Я не хочу летать!");
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x,y,size,size);
        g.setColor(Color.white);
        g.fillOval(x+size/2-(size-5)/2,y+size/2-(size-5)/2,size-5,size-5);
    }

}
