import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	private Map<Integer,Integer> memoize;
	public Fibonacci(){
		memoize = new HashMap<>();
		memoize.put(0, 0);
		memoize.put(1, 1);
	}
	
	public int solve(int num){
		if(memoize.containsKey(num)){return memoize.get(num);}
		else{
			memoize.put(num-1, solve(num-1));
			memoize.put(num-2, solve(num-2));
			int solution = memoize.get(num-1) + memoize.get(num-2);
			memoize.put(num, solution);
			return solution;
		}
	}
}
