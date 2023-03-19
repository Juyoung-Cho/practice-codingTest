package level0.sample;
//순서쌍의 개수
import java.util.stream.IntStream;
class Solution {
	    public int solution(int n) {
	        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
	    }
	}
public class OrderedPairEx {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(10));

	}

}
