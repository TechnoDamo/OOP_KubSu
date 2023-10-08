public class worker {
    String fio;
    int age;
    worker()
    {
        this.fio = "Sofka";
        this.age = 10000;
    }
    worker(String fio, int age)
    {
        this.fio = fio;
        this.age = age;
    }
    void setFio(String fio){this.fio = fio;}
    void getFio(){System.out.print(fio);}
    void setAge(int age){this.age = age;}
    void getWorker(){System.out.print(age);}
    void print()
    {
        System.out.println("fio: " + fio);
        System.out.println("age: " + age);
    }
}
