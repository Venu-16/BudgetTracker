import java.util.ArrayList;
public class budgetTracker {
    private ArrayList<Double> Expences;
    private ArrayList<Double> Income;
    private double Balance;
    public budgetTracker() {
        Expences = new ArrayList<>();
        Income = new ArrayList<>();
        Balance = 0.0;

    }
    public void addExpense(double expense){
        Expences.add(expense);
        Balance -= expense;
    }
    public void addIncome(double incom){
        Income.add(incom);
        Balance += incom ;

    }
    public double getBalance(){
        return Balance;
    }
    public void printExpense(){
        for (int i = 0; i < Expences.size(); i++) {
            System.out.println("Expense " + (i+1) + ": " + Expences.get(i));
    }
}
    public void printIncome(){
        for (int i = 0; i < Income.size(); i++) {
            System.out.println("Income " + (i+1) + ": " + Income.get(i));
    }
    }
}
