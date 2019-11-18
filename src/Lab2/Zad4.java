package Lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Zad4 {
	public Map<String, Double> designateMinAvgMax(ArrayList<Double> listOfNums) {
		if(listOfNums != null && !listOfNums.isEmpty()) {
			Map<String, Double> mapOfResults = new HashMap<>();
			mapOfResults.put("max", Collections.max(listOfNums));
			mapOfResults.put("min", Collections.min(listOfNums));
			double sumOfNums = 0d;
			for(Double num : listOfNums) {
				sumOfNums+=num;
			}
			mapOfResults.put("avg", sumOfNums/listOfNums.size());
			return mapOfResults;
		} else {
			return null;
		}
		
	}
}
