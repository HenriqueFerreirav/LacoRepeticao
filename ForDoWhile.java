package Lacos;

import java.util.Scanner;

public class ForDoWhile {
	
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
	{
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
	{
	/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado.
	 * Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos.
	 * Veja o exemplo abaixo:
	 * Exercício 5
	 */ 
		
		Scanner  leia = novo  Scanner ( System . in );
		int  numero , soma = 0 ;
	 
		Sistema.of.println ( "Digite um número: " );	 
	 
		 Faz 
         {
         numero = leia . proximoInt ();
             se ( número > 0 )
             {
                 soma = numero + soma ;
             }
         }
		 enquanto ( número != 0 );
		 Sistema . fora . println ( "\nA soma dos números digitados foi: " + soma );
	}
}
