package practice_storeHelpDesk;

public enum RequestType {
	
	//HIGH PRIO
	ORDER_IS_NOT_RECEIVED(Priority.HIGH),
	CAN_NOT_COMPLETE_PURCHASE(Priority.HIGH),
	ACCOUNT_IS_HACKED(Priority.HIGH),
	
	//MEDIUM PRIO
	COOPERATION(Priority.MEDIUM),
	ACCOUNT_IS_BLOCKED(Priority.MEDIUM),
	CAN_NOT_LOGIN(Priority.MEDIUM),
	
	//LOW PRIO
	CHANGE_ACCOUNT_DETAILS(Priority.LOW),
	OTHER(Priority.LOW);
	
	private Priority priority;

	RequestType(Priority priority) {
		this.priority = priority;
	}
	
	public Priority getPriority() {
		return this.priority;
	}
}
