package adapter;

public class Adapter implements Targetable{
	
	Source source;
	public Adapter(Source source) {
		this.source=source;
	}
	
	@Override
	public void newmethod() {
		source.method(); 	
	}

}
