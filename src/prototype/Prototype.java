package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable,Serializable{
	
	private static final long serialVersionUID =1L;
	/**
	 * ǳ����
	 */
	public Object clone() throws CloneNotSupportedException{
		Prototype prototype=(Prototype) super.clone();
		return prototype;
	}
	
	public Object deepClone() throws IOException,ClassNotFoundException{
		/* д��������*/
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos= new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		/*����������*/
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois= new ObjectInputStream(bis);
		Object obj= ois.readObject();
		return obj;
		
	}
	
}
