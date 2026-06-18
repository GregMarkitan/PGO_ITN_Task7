public abstract class MembershipPlan implements Billable {
	private String planCode;
	private String clientName;
	private int months;
	private double baseMonthlyFee;
	private boolean autoRenew;

	public MembershipPlan(String planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew) {
		this.planCode = planCode;
		this.clientName = clientName;
		this.months = months;
		this.baseMonthlyFee = baseMonthlyFee;
		this.autoRenew = autoRenew;
}

