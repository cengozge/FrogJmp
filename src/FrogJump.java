
public class FrogJump {

	public static void main(String[] args) {
		System.out.println(solution(0, 61, 30));
	}

	public static int solution(int X, int Y, int D) {
		
		int modD = (Y-X) % D;
		return modD == 0 ? (Y-X)/D : (Y-X)/D + 1;
		
	}

}
