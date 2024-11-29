package practice_storeHelpDesk;

import java.util.Comparator;

public class CustomSupportTicketsComparator implements Comparator<SupportTicket> {

	@Override
	public int compare(SupportTicket o1, SupportTicket o2) {
		if (o1 == null || o2 == null || o1.getPriority() == null || o2.getPriority() == null) {
			return 0;
		}
		int result = o1.getPriority().getPriorityValue() > o2.getPriority().getPriorityValue() ? 1 : (o1.getPriority().getPriorityValue() < o2.getPriority().getPriorityValue() ? -1 : (o1.getSequentialNumber() > o2.getSequentialNumber() ? 1 : -1));
		return result;
	}

}
