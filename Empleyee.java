public class Empleyee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Empleyee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tox( double salary){
         if(this.salary>=1000){
            return salary*0.03;
        }
        else{
            return 0;
        }

    }
    public int  bonus( int workHours){
        if(this. workHours>40){
            int extraHours=(this. workHours-40);
            return extraHours*30;
        }
        else{
            return 0;
        }
    }
    public int raiseSalary(int hireYear) {
        double zam;
        if(2021-(this.hireYear)<10){
            zam=(this.salary)*0.05;
            System.out .println("Zam:"+zam);
        }
        else if(2021-(this.hireYear)<20 && 2021-(this.hireYear)>9){
             zam=(this.salary)*0.1;
            System.out .println("Zam:"+zam);
        }
        else if(2021-(this.hireYear)>19){
             zam=(this.salary)*0.15;
            System.out .println("Zam:"+zam);
        }
        return 0;
    }
    public void yazdir() {
        System.out.println("Adı:"+this.name);
        System.out.println("Maaş:"+this.salary);
        System.out.println("Çalışma Saati:"+this.workHours);
        System.out.println("Başlangıç Yılı:"+this.hireYear);

    }
}
