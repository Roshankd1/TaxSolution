import java.math.BigDecimal;

public class RoundingUpToTwoDecimal {

	@SuppressWarnings("deprecation")
	public static double round(Double d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Double.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
         return bd.doubleValue();
        
    }
	public static double customRound(double num) {
	    return Math.round(num * 20) / 20.0;
	}
}
