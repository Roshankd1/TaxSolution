
public class OutputThree {

static TaxValues tax=new TaxValues();
	
	private static final double costOfBtPerfImp=Constants.IMPORTED_BT_PERFUME_COST;
	private static final double costOfPerfume=Constants.BT_PERFUME_COST;
	private static final double costOfPills=Constants.HEADACHE_PILLS_COST;
	private static final double costOfThreeChocolateBoxImp=Constants.IMPORTED_CHOCLATES_BOX_COST*3;
	
	private static final double chocTaxImp=tax.taxOnExemptionImportGoods();
	private static final double perfTax=tax.basicTax();
	private static final double perfTaxImp=tax.taxOnImportGoods();

	public static double costOfPerfImpIncSalesTax() {		
		double perfImpCostIncTax=tax.costIncTax(costOfBtPerfImp, perfTaxImp);
		return RoundingUpToTwoDecimal.round(perfImpCostIncTax,2);
		
	}
	
	public static double costOfPerfIncSalesTax() {		
		double perfCostIncTax=tax.costIncTax(costOfPerfume, perfTax);
		return RoundingUpToTwoDecimal.round(perfCostIncTax,2);
	}
	
	public static double costOfChocImpIncSalesTax() {		
		double chocImpCostIncTax=tax.costIncTax(costOfThreeChocolateBoxImp, chocTaxImp);
		return RoundingUpToTwoDecimal.customRound(chocImpCostIncTax);
	}
	
	public static double salesTaxForImportedChocAndPerfs() {
		final double salesTaxImpChoc=tax.salesTaxOnProduct(costOfThreeChocolateBoxImp,chocTaxImp);
		final double salesTaxPerf=tax.salesTaxOnProduct(costOfPerfume,perfTax);
		final double salesTaxImpPerf=tax.salesTaxOnProduct(costOfBtPerfImp,perfTaxImp);
		
		final double total=salesTaxImpChoc+salesTaxPerf+salesTaxImpPerf;
		
		return RoundingUpToTwoDecimal.customRound(total);	
	}
	
	public static double totalForInputThree() {
		final double total=costOfPerfImpIncSalesTax()+costOfPerfIncSalesTax()+costOfChocImpIncSalesTax()+costOfPills;
		return RoundingUpToTwoDecimal.round(total, 2);
		 
	}

	public static void showOutputThree() {
		System.out.println(Constants.OUTPUT_THREE);
		System.out.println(Constants.IMPORTED_BT_PERFUME+costOfPerfImpIncSalesTax());
		System.out.println(Constants.BT_PERFUME+costOfPerfIncSalesTax());
		System.out.println(Constants.HEADACHE_PILLS+costOfPills);
		System.out.println(Constants.IMPORTED_CHOCLATES_BOXES_THREE+costOfChocImpIncSalesTax());
		System.out.println(Constants.SALES_TAXES+salesTaxForImportedChocAndPerfs());
		System.out.println(Constants.TOTAL+totalForInputThree());
	}

}
