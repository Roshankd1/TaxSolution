
public  class TaxValues {

	private final static double BASIC_TAX=10;
	private final static double PERCENTAGE=100;
	private final static double IMPORT_TAX=15;
	private final static double TAX_ON_EXEMPTION_IMPORTED_GOODS=5;
	
	public double  basicTax() {
		return BASIC_TAX/PERCENTAGE;

	}
	public double taxOnImportGoods() {
		return IMPORT_TAX/PERCENTAGE;


	}
	public double taxOnExemptionImportGoods() {
		return 	 TAX_ON_EXEMPTION_IMPORTED_GOODS/PERCENTAGE;
		
	}
	
	public double costIncTax(double productPrice, double taxOnProduct) {
		
		double costIncTax  =productPrice+(productPrice*taxOnProduct);
		return RoundingUpToTwoDecimal.round(costIncTax, 2);
	}
	public double salesTaxOnProduct(double productPrice,double taxOnProduct) {
		double salesTax=productPrice*taxOnProduct;
		return RoundingUpToTwoDecimal.round(salesTax, 2);
	}
	
	
}
