public class money {
    int rub;
    int cop;
    int smR = 0, smCop = 0;
    money()
    {
        this.rub = 0;
        this.cop = 0;
        smR += rub;
        smCop = cop;
    }
    money(int rub)
    {
        this.rub = rub;
        this.cop = 0;
        smR += rub;
        smCop = cop;
    }
    money(int rub, int cop)
    {
        this.rub = rub+cop/100;
        this.cop = cop%100;
        smR += rub;
        smCop = cop;
    }
    void  add(int rub)
    {
        this.rub+=rub;
    }
    void  add(int rub, int cop)
    {
        this.rub+=rub+cop/100;
        this.cop+=cop%100;
    }
    int getRub() {
        return rub;
    }

    void setRub(int rub) {
        this.rub = rub;
    }

    int getCop() {
        return cop;
    }

    void setCop(int cop) {
        this.cop = cop;
    }
    void print()
    {
        //cases for rub 1 рубль, 2-4 рубля, 5-20 рублей
        //cases for rub 1 копейка, 2-4 копейки, 5-20 копеек
        int kr, kc;
        if(rub%10==1&&rub!=11){kr=1;}
        else if((rub%10==2||rub%10==3||rub%10==4)&&(rub<5||rub>20)){kr=2;}
        else{kr=3;}
        if(cop%10==1&&cop!=11){kc=1;}
        else if((cop%10==2||cop%10==3||cop%10==4)&&(cop<5||cop>20)){kc=2;}
        else{kc=3;}
        String r, c;
        if(kr == 1){r = " рубль ";}
        else if(kr == 2){r = " рубля ";}
        else{r = " рублей ";}
        if(kc == 1){c = " копейка ";}
        else if(kc == 2){c = " копейки ";}
        else{c = " копеек ";}
        System.out.print("Итого у вас: " + rub + r + cop + c);
        System.out.println();
    }
}
