import java.util.Scanner;

public class HomeLonaEmi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the required loan amount ");
        double loanAmount=sc.nextFloat();
        double rateOfIntrest=20;
        rateOfIntrest=rateOfIntrest/(12*100);
        System.out.println("enter the time to pay in terms of months like 2 year=>24 month ");
        int time=sc.nextInt();
        time=time*12;
        double emi=(loanAmount*rateOfIntrest*Math.pow(1+rateOfIntrest,time))/(Math.pow(1+rateOfIntrest,time)-1);
        System.out.println("EMI per month is " +emi);


    }
}
