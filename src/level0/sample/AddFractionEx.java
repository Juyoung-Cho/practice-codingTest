package level0.sample;
//분수의 덧셈을 기약분수로 나타내기.
public class AddFractionEx {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {numer1*denom2+denom1*numer2,denom1*denom2};
        int a = answer[0];
        int b = answer[1];
        
        for(int i = a -1; i>1; i--){
            if(a % i == 0 && b % i ==0){
                a/=i;
                b/=i;
            }
        }
        int[] result = {a,b};
        return result;
    }
	public static void main(String[] args) {
		AddFractionEx s = new AddFractionEx();
		int[] result = s.solution(12,5,14,7);
		System.out.println("분자 : "+result[0]);
		System.out.println("분모 : "+result[1]);
		
		    
		}

	

}
