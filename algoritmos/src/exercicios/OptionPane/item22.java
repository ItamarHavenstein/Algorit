package exercicios.OptionPane;
/*22) Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas. Necessitará de 2 for.
01
02 02  
03 03 03  
04 04 04 04  
05 05 05 05 05  
06 06 06 06 06 06  
07 07 07 07 07 07 07  
08 08 08 08 08 08 08 08  
09 09 09 09 09 09 09 09 09  
10 10 10 10 10 10 10 10 10 10  
11 11 11 11 11 11 11 11 11 11 11*/

import javax.swing.JOptionPane;

public class item22 {

	public static void main(String[] args) {
		
		int N_linhas = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas:"));
		
		 for(int i = 1; i <= N_linhas; i++) {
			 for(int j = 1; j <= i; j++) { 
			 if(i<10){
			    	 System.out.print(" 0"+i);
			 } else{
				 System.out.print(" " +i);
			 }}
			 		System.out.println(); 
			  }
		  }
	}


