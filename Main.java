public class Main {
    public static void main(String[] args) {
        Empleyee empleyee1=new Empleyee("Ali",5000,46,2000);
        empleyee1.yazdir();
        double taxAmount =empleyee1.tox(empleyee1.salary);
        double bonusAmount =empleyee1.bonus(empleyee1.workHours);
        System.out.println("Vergi: " + taxAmount );
        System.out.println("Bonus: " + bonusAmount);
        double total=empleyee1.salary-taxAmount+bonusAmount;
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + total);

    }
}