package TrabMod3;

import java.io.File;

public class TesteFile {

		public static void main(String[] args) {
			
			File f = new File("C:\\Users\\Pctator\\Desktop\\Facul");
			
			if(f.isDirectory()) {
				
				String [] arquivos = f.list();
				
				for(int i=0; i< arquivos.length; i++) {
					System.out.println(arquivos[i]);
				}
			}
		}
}
