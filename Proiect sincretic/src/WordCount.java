import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args)  throws FileNotFoundException {
		while (true) {
	        System.out.println("Introduceti numele fisierului: ");
	        Scanner input=new Scanner (System.in);
	        String fileName= input.nextLine();
	        FileReader wordReader;
	        File file = new File("text.txt");
	        try {
	            wordReader=new FileReader(fileName);
	            BufferedReader reader=new BufferedReader(wordReader);
	            String numaratorCuvinte;
	            int nrCuvinte=0;
	            float medie=0;
	            float litere=0;
	            int vocale = 0;
	            int consoane=0;

	            
	            
	            
	            while((numaratorCuvinte=reader.readLine()) !=null) {
	                String []words=numaratorCuvinte.split(" ");

	                for(int i=0;i<words.length;i++)
	                {
	                    nrCuvinte++;
	                    
	                }
	            }
	            
	            wordReader=new FileReader(fileName);
	            BufferedReader reader1=new BufferedReader(wordReader);
	            
	                while((numaratorCuvinte=reader1.readLine()) !=null) {
	                	
	                String []charWords=numaratorCuvinte.split("");
	                
	                for (int j=0;j<charWords.length-nrCuvinte+1;j++) {
	                    litere++;
	                    char ch = numaratorCuvinte.charAt(j);
	                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                        vocale++;
	                      }
	                }
	                medie=(float)(litere/nrCuvinte);


	            }
	                
	                
		            
		                while((numaratorCuvinte=reader1.readLine()) !=null) {
		                	
		                String []charWords=numaratorCuvinte.split(" ");
		                
		                for (int j=0;j<charWords.length;j++) {
		                    
		                    char ch = numaratorCuvinte.charAt(j);
		                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                        vocale++;
		                      }
		                    
		                    else if((ch >= 'a' && ch <= 'z')) {
		                        consoane++;
		                      }
		                }
		                


		            }





	                
	           
	            System.out.println("Total caractere: "+ litere); 
	            System.out.println("Total vocale: "+ vocale); 
	            System.out.println("Total consoane: "+ consoane); 
	            System.out.println("Total cuvinte: "+ nrCuvinte);
	            System.out.println("Media lungimii cuvantului: "+ medie);
	            
	            }
	        
	        	catch (FileNotFoundException ex) {
	            System.out.println("Fisierul nu a fost gasit");
	            System.out.println("Exemplu de fisier valid: /Users/Marcus/Documents/text.txt");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        }

	}

}
