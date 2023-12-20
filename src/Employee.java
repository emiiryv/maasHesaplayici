public class Employee {
    String name;
    int salary;
    int workHours;
    int  hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.salary < 1000){
            return 0;
        }
            double cutIt = (this.salary*3)/100;
        return cutIt;
    }

    public double bonus(){
        double giveIt = 0;
        if (this.workHours <= 40){
        return giveIt;
        }else {
            giveIt = (this.workHours-40)*30;
        }

        return giveIt;
    }

    public double raiseSalary(){
        double currentYear = 2023;
        double workYear;
        double raiseIt = 0;
        workYear = currentYear - this.hireYear;

        if (workYear < 10){
        raiseIt = (this.salary*5)/100;
        return raiseIt;
        }

        if (workYear >= 9 && workYear < 20){
            raiseIt = (this.salary*10)/100;
            return raiseIt;
        }

        if (workYear > 19){
            raiseIt = (this.salary*15)/100;
            return raiseIt;
        }
        return raiseIt;
    }

    public String toString(){
    double totalSalary = this.salary - tax() + bonus() + raiseSalary();
    return "Adı: " + this.name +
            "\nMaaşı: " + this.salary +
            "\nÇalışma Saati: " + this.workHours +
            "\nBaşlangıç Yılı: " + this.hireYear +
            "\nVergi: " + tax() +
            "\nBonus: " + bonus() +
            "\nMaaş Artışı: " + raiseSalary() +
            "\nVergiler ve Bonuslar ile birlikte maaş: " + (this.salary - tax() + bonus()) +
            "\nToplam Maaş: " + totalSalary;

    }

}
