package Factory;

public class StaticMutiSendFactory {
	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender proddecySms(){
		return new SmsSender();
	}
}
