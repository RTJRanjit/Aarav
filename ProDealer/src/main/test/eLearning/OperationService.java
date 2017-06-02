package eLearning;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.formula.functions.Subtotal;
import org.junit.Test;



public class OperationService {

	OperationsServiceImpl op=new OperationsServiceImpl();
	
	@Test
	public void testcalculateTotalTime() {

 
		List<AdminInsertModel> timeModel = new ArrayList<AdminInsertModel>();

		AdminInsertModel a1 = new AdminInsertModel();

		List<SubTopic> subtopicList = new ArrayList<SubTopic>();

		SubTopic s1 = new SubTopic("1", "s1", "v1", "st1", "01:00:00");
		SubTopic s2 = new SubTopic("2", "s1", "v1", "st1", "01:00:00");
		SubTopic s3 = new SubTopic("3", "s1", "v1", "st1", "01:00:00");
		SubTopic s4 = new SubTopic("4", "s1", "v1", "st1", "01:00:00");
		SubTopic s5 = new SubTopic("5", "s1", "v1", "st1", "01:04:00");
		SubTopic s6 = new SubTopic("6", "s1", "v1", "st1", "01:02:00");

		subtopicList.add(s1);
		subtopicList.add(s2);
		subtopicList.add(s3);
		subtopicList.add(s4);
		subtopicList.add(s5);
		subtopicList.add(s6);
		a1.setSubTopic(subtopicList);
		timeModel.add(a1);
		
        System.out.println(op.calculateTotalTime(timeModel));
		assertEquals("06:06:00", op.calculateTotalTime(timeModel));
		

		
		
	}

}
