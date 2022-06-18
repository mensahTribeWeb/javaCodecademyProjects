package ControlsAndConditionals.Projects;

public class CarLoan {
    int carLoan;
    int loanLength;
    int interestRate;
    int downPayment;

    public CarLoan(int carLoan, int loanLength, int interestRate, int downPayment) {
        if (loanLength <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan.");
        }
        this.carLoan = 10000;
        this.loanLength = 3;
        this.interestRate = 5;
        this.downPayment = 2000;
    }

    public static void main(String[] args) {



    }
}
