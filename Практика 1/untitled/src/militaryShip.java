public class militaryShip extends ship {
    int kArms;
    militaryShip()
    {
        super();
        this.kArms = 0;
    }
    militaryShip(String name, int disp, int x, int y, int kArms)
    {
        super();
        this.kArms = kArms;
    }
    void getArms(){System.out.println("Amount of armour: " + kArms);}
    void setArms(int kArms){this.kArms = kArms;}
    void setX(int x){this.x = x;}
    void setY(int y){this.y = y;}
    @Override
    void print() {
        System.out.println("Military ship name: " + name);
        System.out.println("Displacement: " + disp);
        System.out.println("Amount of arms: " + kArms);
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}
