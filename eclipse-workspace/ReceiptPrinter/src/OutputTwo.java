
public  class OutputTwo {
	
	static TaxValues tax=new TaxValues();
	
	private static final double costOfChocolate=Constants.IMPORTED_BOX_CHOCOLATES_COST;
	private static final double costOfPerfume=Constants.IMPORTED_BTL_PERFUME_COST;
	private static final double chocTax=tax.taxOnExemptionImportGoods();
	private static final double perfTax=tax.taxOnImportGoods();

	public static double costOfPerfIncSalesTax() {		
		double perfCostIncTax=tax.costIncTax(costOfPerfume, perfTax);
		return RoundingUpToTwoDecimal.customRound(perfCostIncTax);
		
	}
	
	public static double costOfChocIncSalesTax() {		
		double chocCostIncTax=tax.costIncTax(costOfChocolate, chocTax);
		return RoundingUpToTwoDecimal.customRound(chocCostIncTax);
	}
	
	public static double salesTaxForImportedChocAndPerf() {
		final double salesTaxChoc=tax.salesTaxOnProduct(costOfChocolate,chocTax);
		final double salesTaxPerf=tax.salesTaxOnProduct(costOfPerfume,perfTax);
		final double total=salesTaxChoc+salesTaxPerf;
		
		return RoundingUpToTwoDecimal.customRound(total);	
	}
	
	public static double totalForInputTwo() {
		final double total=costOfPerfIncSalesTax()+costOfChocIncSalesTax();
		return RoundingUpToTwoDecimal.round(total, 2);
		 
	}

	public static void showOutputTwo() {
		System.out.println(Constants.OUTPUT_TWO);
		System.out.println(Constants.IMPORTED_BOX_CHOCOLATES+costOfChocIncSalesTax());
		System.out.println(Constants.IMPORTED_BTL_PERFUME+costOfPerfIncSalesTax());
		System.out.println(Constants.SALES_TAXES+salesTaxForImportedChocAndPerf());
		System.out.println(Constants.TOTAL+totalForInputTwo());	
		System.out.print("\n");
	}

}
