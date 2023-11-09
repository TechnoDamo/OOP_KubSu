public class Data {
    int d, m, y;
    Data(int d, int m, int y) throws MyException {
        if (d > 31 || m > 12 || y < 0 || d < 0 || m < 0) throw new MyException("Incorrect date", d, m, y);
        this.d = d;
        this.m = m;
        this.y = y;
    }
    // output method
    void print() {
        System.out.println("Year: " + y + " " + "month: " + m + "day: " + y);
        System.out.println();
    }
    // method - add some days to the current date
    void addDays(int extraDays) throws MyException{
        int extraYears = extraY(y, extraDays);
        int k = 0;
        for (int i = y; i <= extraYears + y; i++) {
            if(i % 4 == 0){ k++; }
        }
        if(extraDays / (extraYears * 365 + k) != extraYears){ extraYears--; }
        y += extraYears;

        int extraMonths;
        extraDays -= extraYears * 365;
        d += extraDays;
        if (d > 31 || m > 12 || y < 0 || d < 0 || m < 0) throw new MyException("Incorrect date", d, m, y);
    }
    // count day number from the beginning of the year


    //вспомогательные методы
    int extraY(int Year, int extraDays) {
        int extraYears = extraDays / 365;
        int k = 0;
        for (int i = Year; i <= extraYears + Year; i++) {
            if(i % 4 == 0){ k++; }
        }
        if(extraDays / (extraYears * 365 + k) != extraYears){ extraYears--; }
        return extraYears;
    }
    int newM(int Month, int extraDays)
    {
        int []months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(y % 4 == 0) { months[1] = 29;}
        while (extraDays >= months[Month]) {
            extraDays -= months[Month];
            Month++;
        }
        d = extraDays;
        return Month;
    }

}
