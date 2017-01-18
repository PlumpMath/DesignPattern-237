package Factory;

public class MutiSendFactory {
	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender proddecySms(){
		return new SmsSender();
	}
}
