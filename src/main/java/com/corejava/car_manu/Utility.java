package com.corejava.car_manu;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Utility extends FileReaderImpl{

	public void addData() throws IOException
	{
		SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyy");
		String dt = new Date();
		
		List<CarHeader> h = new ArrayList<>();
		List<CarContent> c = new ArrayList<>();
		
		h.add(new CarHeader(dt, "FrontShieldGlass", 1234, "2022020YCarSheild001212121", 123));
		
		c.add(new CarContent("FrontShieldGlass1", "123454",form.parse(dt), "12022020Yeild001212121", "y", "red",(float) 123.0));
		c.add(new CarContent("FrontShieldGlass2", "12345458", dt, "12022020YCarSheild00112121", "y", "red",(float) 123.0));
		c.add(new CarContent("FrontShieldGlass3", "12345458909876", dt, "12022020YCarSheild01212121", "y", "red",(float) 123.0));
		c.add(new CarContent("FrontShieldGlass4", "123454890987654545", dt, "1222020YCSheild001212121", "y", "red",(float) 123.0));
		c.add(new CarContent("FrontShieldGlass5", "12345458904545", dt, "12022020YCarSheild01212121", "y", "red",(float) 123.0));
		c.add(new CarContent("FrontShieldGlass6", "12345458909876545", dt, "120220YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new CarContent("FrontShieldGlass7", "1234545890987654545", dt, "12022020YCarShld001212121", "y", "red",(float) 123.0));
		c.add(new CarContent("FrontShieldGlass8", "1234540987654545", dt, "120220200YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new CarContent("FrontShieldGlass9", "12345890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new CarContent("FrontShieldGlass10", "12345458909854545", dt, "120220YCarSheild0012121", "y", "red",(float) 123.0));
		c.add(new CarContent("FrontShieldGlass11", "1234540987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
	
		writeFile(h , c);
	
	}
	
}
