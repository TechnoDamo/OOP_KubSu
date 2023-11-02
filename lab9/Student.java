import java.util.*;
class Student implements Comparator<Student>{
    private String fio, adress, fackulty;
    private int kurs;
    private int[] marks;
    Student(String fio, String adress, String fackulty, int kurs, int[] marks)
    {
        this.fio=fio;
        this.adress=adress;
        this.fackulty=fackulty;
        this.kurs=kurs;
        this.marks=marks;
    }
    Student()
    {
        fio = "Kusch KK";
        adress = "5th Avenue";
        fackulty = "FKTiPM";
        kurs = 2;
        marks = new int[5];
        for(int i = 0; i < 5; i++)marks[i] = 3;
    }
    String getFio(){return fio;}
    void setFio(String fio){this.fio=fio;}

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getFackulty() {
        return fackulty;
    }

    public void setFackulty(String fackulty) {
        this.fackulty = fackulty;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    double sr()
    {
        double s = 0;
        for(int i = 0; i < marks.length; i++)
        {
            s+=marks[i];
        }
        return s/marks.length;
    }
    public String toString(){
        String s = " ";
        for(int i = 0; i < marks.length; i++)
        {
            s+=String.valueOf(marks[i]);
            s+=" ";
        }
        return "Student "+fio+"\n Adress"+adress+"\n Fackulty "+fackulty+"\n Kurs "+kurs+"\n Marks "+s+"\n";
    }
    public static Comparator<Student> stComp = new Comparator<Student>(){
        public int compare(Student s1, Student s2){
            return s1.getFio().compareTo(s2.getFio());
        }
    };

    public static Comparator<Student> kursComp = new Comparator<Student>() {
        public int compare(Student s1, Student s2) {
            return s1.getKurs() - s2.getKurs();
        }
    };
}