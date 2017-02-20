
public class Triangle {

	public static void main(String[] args) {
		
		checkTriangleType(5,3,8);

	}

	private static void checkTriangleType(int i, int j, int k) {
		//to be triangle any 2 sides must be greater than 3rd side
		if(i+j>k && i+k>j && j+k>i){
			if(i==j && j==k & k==i){
				System.out.println("Equilateral"); // 3 all sides same
			}else if(i==j  || j==k || k==i){
				System.out.println("Isoceles"); // any 2 sides same
			}else{
				System.out.println("Scalene"); // all sides are different
			}
		}else{
			System.out.println("Not traingle"); 
		}		
	}
}
