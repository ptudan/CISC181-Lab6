import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Eliminator {
	public ArrayList<Integer> vals1 = new ArrayList<Integer>();
	public LinkedList<Integer> vals2 = new LinkedList<Integer>();
	
	public Eliminator(){
		for(int i = 0; i<5000; i++){
			vals1.add(i);
			vals2.add(i);
		}
	}
	
	public void eliminate(List<Integer> list){
		int index = 0;
		long x = getTime();
		while(!list.isEmpty()){
			index += 31;
			if(index>=list.size()){
				index = index%list.size();
			}
			System.out.println("Removing: " + list.get(index));
			list.remove(index);
		}
		long y = getTime();
		System.out.println("It took " + Long.toString(y-x) + " milleseconds to calculate.");
	}
	
	private long getTime(){
		Date date = new Date();
		long x = date.getTime();
		return x;
	}
}
