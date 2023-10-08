public class fullTime extends worker {
    int salary;
    fullTime()
    {
        super();
        this.salary = 100;
    }
    fullTime(String fio, int age, int salary)
    {
        super(fio, age);
        this.salary = salary;
    }
    void setRate(int rate){this.salary = salary;}
    void getRate(){System.out.print(salary);}
    @Override
    void print()
    {
        System.out.println("fio: " + fio);
        System.out.println("age: " + age);
        System.out.println("salary: " + salary + "$ a month");
        System.out.println();
    }
}
