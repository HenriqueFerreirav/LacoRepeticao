package Lacos;

import java.util.Scanner;

public class While {
	
	public  static  void  principal ( String [] args ) {
		
		int  idade , gênero , categoria , qtdBack = 0 , qtdMFront = 0 , qtdHMobile40 = 0 , qtdMFullStack30 = 0 ;
		String  op = "S" ;
		
		Scanner  leia = novo  Scanner ( System . in );
		while ( op . equals ( "S" ))
		
		{
			
			Sistema . fora . println ( "\nEntre com a sua idade: " );
			idade = leia . proximoInt ();
			Sistema . fora . println ( "\nEntre com o seu genero: " );
			Sistema . fora . println ( "\n1- Masculino\t 2- Feminino\t 3-Outros" );
			genero = leia . proximoInt ();	
			Sistema . fora . println ( "\nEntre com sua categoria: " );
			Sistema . fora . println ( "\n1- Backend\t 2- Frontend\t 3- Mobile\t 4- FullStack" );
			categoria = leia . proximoInt ();
			
		
			
			se ( categoria == 1 )
			{
				qtdVoltar ++;
			}
			else  if ( genero == 2 && categoria == 2 )
			{
				qtdMFront ++;
			}
			else  if ( genero == 1 && categoria == 3 && idade > 40 )
			{
				qtdHMobile40 ++;
			}
			else  if ( genero == 2 && categoria == 4 && idade < 30 )
			{
				qtdMFullStack30 ++;
			}
			
			Sistema . fora . println ( "\nDeseja cadastrar um novo colaboradore: (S-Sim e N-Não)?" );
			op = leia . proximaLinha ();
		}
		
		Sistema . fora . printf ( "\nTemos: " + qtdBack + " pessoas desenvolvedores Backend" );
		Sistema . fora . printf ( "\nTemos: " + qtdMFront + " mulheres desenvolvedoras FrontEnd" );
		Sistema . fora . printf ( "\nTemos: " + qtdHMobile40 + " homens desenvolvedores Mobile maiores de 40 anos" );
		Sistema . fora . printf ( "\nTemos: " + qtdMFullStack30 + " mulheres desenvolvedoras FullStack menores de 30 anos" );
		

	}


}
