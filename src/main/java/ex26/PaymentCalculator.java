package ex26;

public class PaymentCalculator {
    public static int calculateMonths(double balance, double apr, double payment){
        double dailyRate = apr/365;
        double months = (-(1/30.0)*Math.log(1+balance/payment * (1-(Math.pow(1+dailyRate,30))))
                / Math.log(1+dailyRate));
        months = Math.ceil(months);
        return (int) months;
    }
}
