public class percent extends worker{
    int percent;
    percent()
    {
        super();
        this.percent = 100;
    }
    percent(String fio, int age, int percent)
    {
        super(fio, age);
        this.percent = percent;
    }
    void setPecentage(int percent){this.percent = percent;}
    void getPercentage(){System.out.print(percent);}
    @Override
    void print()
    {
        System.out.println("fio: " + fio);
        System.out.println("age: " + age);
        System.out.println("percent: " + percent + "%");
        System.out.println();
    }
}
