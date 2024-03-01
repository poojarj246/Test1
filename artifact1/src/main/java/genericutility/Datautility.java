package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Datautility {
public String readdatafromproperty(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/actitimedata1.properties");
	Properties obj = new Properties();
	obj.load(fis);
	String data = obj.getProperty(key);
	return data;
}
}
