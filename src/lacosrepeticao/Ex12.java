package lacosrepeticao;

public class Ex12
{
	public static void main(String[] args) {
	    float paisA = 80000;
	    float paisB = 200000;
	    int anos = 0;
	    
	    do {
	        paisA *= 1.03;
	        paisB *= 1.015;
	        anos++;
	    } while (paisA < paisB);
	    
	    System.out.println(anos);
	    
	}
}