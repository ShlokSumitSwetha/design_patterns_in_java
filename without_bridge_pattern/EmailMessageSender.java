package Complete_Design_Patterns.without_bridge_pattern;

public class EmailMessageSender extends EmailMessage{

	@Override
	public void send() {
		System.out.println("sending email");		
	}

	

}
