import java.util.*;
public class ship {
    String name;
    int disp;
    int x, y;
    ship()
    {
        name = "default ship";
        disp = 0;
        x = 0;
        y = 0;
    }
    ship(String name, int disp, int x, int y)
    {
        this.name = name;
        this.disp= disp;
        this.x = x;
        this.y= y;
    }
    void getName(){System.out.println("Name: " + name);}
    void getDisp(){System.out.println("Displacement: " + disp);}
    void getX(){System.out.println("Name: " + x);}
    void getY(){System.out.println("Name: " + y);}

    void setName(String name){this.name = name;}
    void setDisp(int disp){this.disp = disp;}
    void setX(int x){this.x = x;}
    void setY(int y){this.y = y;}
    void print()
    {
        System.out.println("Civilian ship name: " + name);
        System.out.println("Displacement: " + disp);
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}
