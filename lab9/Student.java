import java.util.*;
public class Student {
    String fio;
    String adress;
    String fackulty;
    int year;
    ArrayList<Integer> grades = new ArrayList<Integer>();
    Student() {
        this.fio = fio;
        this.adress = adress;
        this.fackulty = fackulty;
        this.year = year;
        this.grades = grades;
    }
    Student(String fio, String adress, String fackulty, int year, ArrayList<Integer> grades) {
        this.fio = fio;
        this.adress = adress;
        this.fackulty = fackulty;
        this.year = year;
        this.grades = grades;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    public double addGrade(int gr) {
        grades.add()
    }
    public double averageP()
    {
        int sm = 0, k = grades.size();
        for(int i = 0; i < k; i++)
        {
            sm+=grades.get(i);
        }
        return (double)sm/k;
    }
}
