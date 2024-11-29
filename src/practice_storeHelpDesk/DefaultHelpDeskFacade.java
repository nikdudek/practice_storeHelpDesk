package practice_storeHelpDesk;

import java.util.PriorityQueue;

public class DefaultHelpDeskFacade implements HelpDeskFacade {
	

	private static final int INITIAL_QUEUE_CAPACITY = 10;
	private static PriorityQueue<SupportTicket> supportTickets;

	{
		supportTickets = new PriorityQueue<SupportTicket>(INITIAL_QUEUE_CAPACITY, new CustomSupportTicketsComparator());
	}
	
	@Override
	public void addNewSupportTicket(SupportTicket supportTicket) {
		supportTickets.offer(supportTicket);
	}

	@Override
	public SupportTicket getNextSupportTicket() {
		return supportTickets.poll();
	}

	@Override
	public int getNumberOfTickets() {
		return supportTickets.size();
	}

}
