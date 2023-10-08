public class hourlyRate extends worker {
    int rate;
    hourlyRate()
    {
        super();
        this.rate = 100;
    }
    hourlyRate(String fio, int age, int rate)
    {
        super(fio, age);
        this.rate = rate;
    }
    void setRate(int rate){this.rate = rate;}
    void getRate(){System.out.print(rate);}
    @Override
    void print()
    {
      System.out.println("fio: " + fio);
      System.out.println("age: " + age);
      System.out.println("hourly rate: " + rate + "$ an hour");
      System.out.println();
    }
}
