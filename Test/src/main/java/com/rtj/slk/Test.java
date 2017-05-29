/*package com.rtj.slk;

import com.ibm.watson.developer_cloud.visual_recognition.v3;
import com.ibm.watson.developer_cloud.visual_recognition.v2_beta.VisualRecognition;

public class Test   {

	public static void main(String[] args) {
	    VisualRecognition service = new VisualRecognition(VisualRecognition.VERSION_DATE_2015_12_02);
	    service.setApiKey("");

	    System.out.println("Detect faces");
	    detectFaces = new detectFaces.Builder()
	        .images(new File("src/test/resources/visual_recognition/car.png"))
	        .build();
	    detectFaces result = service.classify(options).execute();
	    System.out.println(result);
	}
}
*/