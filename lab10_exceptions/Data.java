public class Data {
    int d, m, y;
    Data(int d, int m, int y) throws MyException {
        int []months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(y % 4 == 0) { months[1] = 29; }
        if (d > months[m-1] || m > 12 || y < 0 || d < 0 || m < 0) throw new MyException("Incorrect date", d, m, y);
        this.d = d;
        this.m = m;
        this.y = y;
    }
    // вывод
    void print() {
        System.out.println("Year: " + y + " " + "month: " + m + " day: " + d);
        System.out.println();
    }
    // увеличить текущую дату на опр. кол-во дней
    void addDays(int extraDays) {
        int extraYears = extraY(y, extraDays);
        int k = 0; //количество весокосных лет в данном промежутке
        for (int i = y; i <= extraYears + y; i++) {
            if(i % 4 == 0){ k++; }
        }
        if(extraYears != 0 && extraDays / (extraYears * 365 + k) != 1){ extraYears--; }
        y += extraYears;
        extraDays -= (extraYears * 365 + k);

        m = newM(m-1, extraDays);// в newM поменяли количество extraDays
    }

    // посчитать номер дня с начала года
    int dayNum() {
        int []months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(y % 4 == 0) { months[1] = 29;}
        int k = 0;
        for(int i = 0; i < m-1; i++) {
            k += months[i];
        }
        k += d;
        return k;
    }

    int dayNum(int year, int month, int day) throws MyException{
        int []months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(y % 4 == 0) { months[1] = 29; }
        if (d > months[m-1] || m > 12 || y < 0 || d < 0 || m < 0) throw new MyException("Incorrect date", d, m, y);
        int k = 0;
        for(int i = 0; i < month-1; i++) {
            k += months[i];
        }
        k += d;
        return k;
    }

    //вспомогательные методы
    int extraY(int Year, int extraDays) {
        int extraYears = extraDays / 365;
        return extraYears;
    }
    int newM(int Month, int extraDays) {
        int []months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(y % 4 == 0) { months[1] = 29;}
        while (extraDays >= months[Month]) {
            extraDays -= months[Month];
            Month++;
            if(Month == 12){Month = 0; y++;}
        }
        d += extraDays;
        return Month+1;
    }

}
