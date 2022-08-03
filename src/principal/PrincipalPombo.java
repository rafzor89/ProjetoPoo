package principal;


import java.io.ObjectInputStream.GetField;
import java.security.KeyStore.TrustedCertificateEntry;
import java.util.ArrayList;

import entidade.Administrador;
import entidade.Pruu;
import entidade.Usuario;

public class PrincipalPombo {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Rafael", "rafa@gmail.com", "123.321.123-00");
		Usuario user2 = new Usuario("Guga", "weverton@gmail.com", "321.123.321-01");
		Administrador user3 = new Administrador("Pablo", "pablito@gmail.com", "357.753.357-02");
		
		Pruu p1 = new Pruu("Hoje tem jogo do Mengão!", user1);
		Pruu p2 = new Pruu("Time filho da p....", user1);
		Pruu p3 = new Pruu("Qual a boa do final de semana?", user2);
		Pruu p4 = new Pruu("Também vou ficar em casa.", user2);
		Pruu p5 = new Pruu("ADM ta on!!!", user3);
		Pruu p6 = new Pruu("Cuidado com seus post's!!!", user3);
		
		user1.cadastrarPruu(p1);
		user1.cadastrarPruu(p2);
		user2.cadastrarPruu(p3);
		user2.cadastrarPruu(p4);
		user3.cadastrarPruu(p5);
		user3.cadastrarPruu(p6);
		
		
		//Pablo dando like texto do Guga
		user1.darLike(p3);
		
		//Pablo bloquando primeiro texto Rafael
		user3.setBloaquear(p2);
		
		//Pruu's do Guga
		System.out.println("================================");
		System.out.println("Pruu's do Guga");
		System.out.println("================================");
		System.out.println(p3);
		System.out.println(p4);
		System.out.println("================================");
		
		
		//Todos os Pruu's
		System.out.println("================================");
		System.out.println("TODOS OS PRUU's");
		System.out.println("================================");
		for(int i = 0; i < 1; i++) {
			
			System.out.println(Usuario.getPruu());
			
			
		}
		
		
		
		
	}

}
