package ber.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	//static {
		//Empresa empresa = new Empresa();
		//empresa.setNome("Alura");
		///Empresa empresa1 = new Empresa();
		///empresa1.setNome("Caelum");
		//Empresa empresa2 = new Empresa();
		//empresa2.setNome("PicPay");
		//lista.add(empresa);
		//lista.add(empresa1);
		//lista.add(empresa2);
		
	//}

	public void adiciona(Empresa empresa) {
		// TODO Auto-generated method stub
		lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
		
	}

}
