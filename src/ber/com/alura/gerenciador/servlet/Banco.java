package ber.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequancial = 1; 
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		empresa.setId(chaveSequancial++);
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Caelum");
		empresa1.setId(chaveSequancial++);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("PicPay");
		empresa2.setId(chaveSequancial++);
		lista.add(empresa);
		lista.add(empresa1);
		lista.add(empresa2);
		
	}

	public void adiciona(Empresa empresa) {
		// TODO Auto-generated method stub
		empresa.setId(Banco.chaveSequancial++);
		Banco.lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
		
	}
	
	public void removeEmpresa(Integer id) { 

	    Iterator<Empresa> it = lista.iterator();

	    while(it.hasNext()) { 
	        Empresa emp = it.next();

	        if(emp.getId() == id ) {
	            it.remove();
	        }
	    }
	}

}
