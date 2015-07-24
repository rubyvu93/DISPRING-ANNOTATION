package testbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import writer.IWriter;

//@Service
@Component
public class MySpringBeanWithDependency {
	private IWriter writer;

	@Autowired
	public void setWriter(IWriter writer) {
		this.writer = writer;
	}

	public void run() {
		String s = "MMMMM";
		writer.writer(s);
	}
}
