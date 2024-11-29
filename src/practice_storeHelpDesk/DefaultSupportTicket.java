package practice_storeHelpDesk;

public class DefaultSupportTicket implements SupportTicket {
	
	private static int sequentialNumberCounter;
	private int sequentialNumber;
	private RequestType requestType;
	
	{
		sequentialNumber = ++sequentialNumberCounter;
	}
	
	public DefaultSupportTicket() {
//		this.sequentialNumber = ++sequentialNumberCounter;
	}
	
	public DefaultSupportTicket(RequestType requestType) {
		this.requestType = requestType;
	}

	@Override
	public Priority getPriority() {
		if (requestType == null) {
			return null;
		}
		return this.requestType.getPriority();
	}
	
	@Override
	public int getSequentialNumber() {
		return this.sequentialNumber;
	}

	@Override
	public RequestType getRequestType() {
		return requestType;
	}
	
}
