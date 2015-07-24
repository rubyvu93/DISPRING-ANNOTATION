package writer;

import org.springframework.stereotype.Component;
@Component
//@Service
public class Writer implements IWriter{

	public void writer(String s) {
		System.out.println("wwwwww"+s);
		
	}

	

}
