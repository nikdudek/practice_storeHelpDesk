package practice_storeHelpDesk;

import java.util.PriorityQueue;
import java.util.Queue;

public class DefaultHelpDeskFacade implements HelpDeskFacade {
	
	private Queue<SupportTicket> supportTickets;

	{
		supportTickets = new PriorityQueue<>(new CustomSupportTicketsComparator());
	}
	
	@Override
	public void addNewSupportTicket(SupportTicket supportTicket) {
		if (supportTicket == null) {
			return;
		}
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
