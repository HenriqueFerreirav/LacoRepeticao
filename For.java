package Lacos;

import java.util.Scanner;

public class For {
	public  static  void  principal ( String [] args ) {
		Scanner  leia = novo  Scanner ( System . in );
		
		int  num , somaPar = 0 , somaImpar = 0 , x ;
		
		
		para ( x = 1 ; x <= 10 ; x ++)
		{
			Sistema . fora . println ( "\nDigite com um numero: " );
			num = leia . proximoInt ();
			se ( num % 2 == 0 )
			{
				somaPar ++; // somaPar = somaPar + 1
			}
			outro
			
				{
					somaImpar ++;
				}
		
			}
			Sistema . fora . printf ( "\nTemos: " + somaPar + " números pares..." );
			Sistema . fora . printf ( "\nTemos: " + somaImpar + " numeros completos..." );
	
	}			
			
}
