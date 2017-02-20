
public class Hired1 {

	public static void main(String[] args) {
		System.out.println(solution(4,17));

	}
	
	private static int solution(int a, int b){
		int count =0;
		for(int i=a;i<=b;i++){
			double num = Math.sqrt(i);
			if(num == Math.ceil(num)){
				count++;
			}
		}
		return count;
		
	}

}
//print p= q^2 no of perfect square
