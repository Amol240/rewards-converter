public class RewardValue {

    public double cash;
    public int miles;
    public static final double milesToCashATRate = 0.0035;

    public RewardValue(double cash){
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue(){
        return miles * milesToCashATRate;
    }

    public int getMilesValue(){
        return (int) ( cash / milesToCashATRate);
    }



}
