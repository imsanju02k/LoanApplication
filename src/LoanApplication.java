import java.util.Scanner;

class Loan{
    String nameOfCandidate;
    String resAddress;
    int age;
    String aadharNumber;
    String phoneNumber;
    String gender;
    int monthlyIncome;

    void name(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the candidate");
        nameOfCandidate=sc.nextLine();
    }
    void address(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Residence Address ");
        resAddress=sc.nextLine();
    }
    void age(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age ");
        age=sc.nextInt();
    }
   void aadhar(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your aadhar number ");
        aadharNumber=sc.next().substring(8,12);
        System.out.println("aadhar number is valid " );
    }
    void phoneNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Mobile Number ");
        phoneNumber=sc.next();
        System.out.println("Number is valid");
    }
    void genderIdentify(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Gender");
        gender=sc.next();
    }
    void monthIncome(){

            Scanner sc = new Scanner(System.in);
            System.out.println("Pleas enter your Monthly Income and To check the Loan Eligibility ");
            monthlyIncome = sc.nextInt();

            if (monthlyIncome <=5000) {
                System.out.println("Sorry your Monthly Income is to low we cant give the loan for you ");

            } else {
                System.out.println("Yeah! Thank you for all the details to provide to check your loan process........ your eligible for this loan  ");
            }
        System.out.println();

    }

}
class HomeLoan extends Loan{

   public void homeEmi(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the required Loan amount need to you ");
       double principalAmount=sc.nextInt();
       double rateOfInterest=8.40;
       System.out.println(" Enter the time in terms of months i.e 6,9,12,24,36.. ");
       double time=sc.nextInt();
       rateOfInterest=rateOfInterest/(12*100);
       time=time*12;
       double emi=(principalAmount*rateOfInterest*Math.pow(1+rateOfInterest,time))/(Math.pow(1+rateOfInterest,time)-1);
       System.out.println("Your Loan Amount is " + principalAmount + " and the emi per month is  " +emi);
       System.out.println(" 🤝🤝🤝🤝🤝🤝🤝🤝🤝 Thank You for visiting iNeuron Bank 🤝🤝🤝🤝🤝🤝🤝🤝🤝");
    }
}
class CarLoan extends Loan{

   public void carEmi(){
       Scanner cr=new Scanner(System.in);
       System.out.println("Enter the required Loan amount need to you ");
       double principalAmount=cr.nextInt();
       double rateOfInterest=7.50;
       System.out.println(" Enter the time in terms of months i.e 6,9,12,24,36..");
       double time=cr.nextInt();
       rateOfInterest=rateOfInterest/(12*100);
       time=time*12;
       double emi=(principalAmount*rateOfInterest*Math.pow(1+rateOfInterest,time))/(Math.pow(1+rateOfInterest,time)-1);
       System.out.println("Your Loan Amount is " + principalAmount + " and the emi per month is  " +emi);
       System.out.println(" 🤝🤝🤝🤝🤝🤝🤝🤝🤝 Thank You for visiting iNeuron Bank 🤝🤝🤝🤝🤝🤝🤝🤝🤝");

    }
}
class PersonalLoan extends Loan{
    public void personalEmi(){
        Scanner p=new Scanner(System.in);
        System.out.println("Enter the required Loan amount need to you ");
        double principalAmount=p.nextInt();
        double rateOfInterest=16.5;
        System.out.println(" Enter the time in terms of months i.e 6,9,12,24,36.. ");
        double time=p.nextInt();
        rateOfInterest=rateOfInterest/(12*100);
        time=time*12;
        double emi=(principalAmount*rateOfInterest*Math.pow(1+rateOfInterest,time))/(Math.pow(1+rateOfInterest,time)-1);
        System.out.println("Your Loan Amount is " + principalAmount + " and the emi per month is  " +emi);
        System.out.println(" 🤝🤝🤝🤝🤝🤝🤝🤝🤝 Thank You for visiting iNeuron Bank 🤝🤝🤝🤝🤝🤝🤝🤝🤝");
    }

}
class EducationLoan extends Loan{
    public void educationEmi(){
        Scanner ed=new Scanner(System.in);
        System.out.println("Enter the required Loan amount need to you ");
        double principalAmount=ed.nextInt();
        double rateOfInterest=6.85;
        System.out.println(" Enter the time in terms of months i.e 6,9,12,24,36.. ");
        double time=ed.nextInt();
        rateOfInterest=rateOfInterest/(12*100);
        time=time*12;
        double emi=(principalAmount*rateOfInterest*Math.pow(1+rateOfInterest,time))/(Math.pow(1+rateOfInterest,time)-1);
        System.out.println("Your Loan Amount is " + principalAmount + " and the emi per month is  " +emi);
        System.out.println(" 🤝🤝🤝🤝🤝🤝🤝🤝🤝 Thank You for visiting iNeuron Bank 🤝🤝🤝🤝🤝🤝🤝🤝🤝");
    }

}

public class LoanApplication {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("***************************************** 🏦💸 WELCOME TO iNEURON BANK BANGALORE  🏦💸 ************************************");
        System.out.println();
       {
            Loan obj=new Loan();
            obj.name();
            obj.address();
            obj.age();
            obj.aadhar();
            obj.phoneNum();
            obj.genderIdentify();
            obj.monthIncome();
        }
        System.out.println();
        HomeLoan hl=new HomeLoan();
        CarLoan cl=new CarLoan();
        PersonalLoan pl=new PersonalLoan();
        EducationLoan el=new EducationLoan();
        System.out.println("💰💰💰💰💰💰💰💰💰 Please enter your loan required options are like 💰💰💰💰💰💰💰💰💰");
        System.out.println("1=HomeLoan 🏠 || 2=CarLoan 🚗  || 3=PersonalLoan 👨  || 4=EducationLoan 📚 ");
        System.out.println("💸💲💸💸💲💸💸💲💸💸💲💸💸💲💸💸💲💸💸💲💸💸💲💸💸💲💸💸💲💸💸💲💸💸💲💸💸💲💸");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num==1){
            hl.homeEmi();
        }
        else if (num==2){
            cl.carEmi();
        }
        else if(num==3){
             pl.personalEmi();
        }
        else if(num==4){
            el.educationEmi();
        }
        else {
            System.out.println("pls enter the valid options please try again !!!");
        }

    }
}
