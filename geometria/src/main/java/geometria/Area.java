package geometria;

public class Area {

	public static void main(String[] args) {


}
	
	//return area 
	public static int Triangolo(int base, int altezza) {
		return (base*altezza)/2;
	}
	
	//return area quadrato
	public static  int quadrato(int lato) {
		return lato*lato;
	}
	
	//return area rombo
		public static int rombo (int diagM, int diagmin) {
			return (diagM*diagmin)/2;
		}
}