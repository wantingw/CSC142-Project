package control;

import java.io.File;
import java.io.FileNotFoundException;
import control.Manager;


public class MissionControl {
	
	public static void main(String[] args) throws FileNotFoundException {
		String directory = 
							File.separator + "Users" + File.separator + "wantingwu" 
							+ File.separator + "Java II"+ File.separator + "java" 
							+ File.separator + "data";
		
		String fileLocation = 
							File.separator + "Users" + File.separator + "wantingwu" 
							+ File.separator + "Java II" + File.separator + "java"
							+ File.separator + "data" + File.separator + "spacex_dataset.csv";
		
		Manager missionManager	= new Manager();
		missionManager.read(fileLocation);
		missionManager.filterCustomer(directory, "NASA");
		missionManager.orderByPayload(directory);
		System.out.println();
	}

}
