package weektwo;

public class ConditionsAndLoops {

	public static void main(String[] args) {
		
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 3.29;
		double moneyInWallet = 10.00;
		int thirstLevel = 7;
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket; // if hot; has money are true
		boolean willGoSwimming = isHotOutside && !isWeekday; // if hot; IS NOT a weekday are true
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && isWeekday; // if hot; has money; a weekday are true
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= 2 * costOfMilk; // if hot; thirst level is greater than 3; money in wallet is greater than 2 times the cost of milk is true
		
	}
}