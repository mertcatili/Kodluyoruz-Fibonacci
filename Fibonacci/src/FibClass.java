
public class FibClass {

	public static void main(String[] args) {
		int sayi=10, birinci=0, ikinci=1;
        int ucuncu=birinci+ikinci;
        System.out.print(birinci+ " "+ikinci+ " ");
            while(sayi>0){
            System.out.print(ucuncu+ " "); 
            sayi--;        
            birinci=ikinci;
            ikinci=ucuncu;      
            ucuncu=birinci+ikinci; 
	}

}
}
