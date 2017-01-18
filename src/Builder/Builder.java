package Builder;

import java.util.ArrayList;
import java.util.List;

import Factory.MailSender;
import Factory.Sender;
import Factory.SmsSender;
/**
 * ������ģʽ�ṩ���Ǵ����������ģʽ��
 * ��������ģʽ���ǽ����ֲ�Ʒ�����������й��������������϶���
 * ��ν���϶������ָĳ������в�ͬ�����ԣ�
 * ��ʵ������ģʽ����ǰ����󹤳�ģʽ������Test��������õ���
 * @author neuly
 *
 */
public class Builder {
	private List<Sender> list = new ArrayList<Sender>();  
    
    public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new MailSender());  
        }  
    }  
      
    public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new SmsSender());  
        }  
    }  
}  
