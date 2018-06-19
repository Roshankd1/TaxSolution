
public  class OutputOne {

	static TaxValues tax=new TaxValues();

	private static double costOfMusicCd=Constants.MUSIC_CD_COST;
	private static double costOfTwoBook=Constants.ONE_BOOK_COST*2;
	private static double costOfChocolateBar=Constants.CHOCOLATE_BAR_COST;
	private static double musicTax=tax.basicTax();
	
	public static double costOfMusicCdIncSalesTax() {
		final double totalSalesTax=tax.costIncTax(costOfMusicCd, musicTax);
		return RoundingUpToTwoDecimal.round(totalSalesTax, 2);
			
	}
	public static double salesTaxForMusicCD() {
		final double salesTax=tax.salesTaxOnProduct(costOfMusicCd,musicTax);
		return RoundingUpToTwoDecimal.round(salesTax, 2);
		
	}
	
	public static double totalForInputOne() {
		
		final double total= costOfTwoBook+costOfMusicCdIncSalesTax()+costOfChocolateBar;
		return RoundingUpToTwoDecimal.round(total, 2);
	}
	
	public static void showOutputOne() {
	System.out.println(Constants.OUTPUT_ONE);
	System.out.println(Constants.TWO_BOOKS+costOfTwoBook);
	System.out.println(Constants.MUSIC_CD+costOfMusicCdIncSalesTax());
	System.out.println(Constants.CHOCOLATE_BAR+costOfChocolateBar);
	System.out.println(Constants.SALES_TAXES+salesTaxForMusicCD());
	System.out.println(Constants.TOTAL+totalForInputOne());
	System.out.print("\n");
	}



}
