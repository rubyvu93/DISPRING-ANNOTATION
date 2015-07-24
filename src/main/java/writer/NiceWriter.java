package writer;

import org.springframework.stereotype.Component;

//@Service
@Component
public class NiceWriter implements IWriter{
	public void writer (String s){
	    System.out.println("NNNNN " + s);
	  }
}
