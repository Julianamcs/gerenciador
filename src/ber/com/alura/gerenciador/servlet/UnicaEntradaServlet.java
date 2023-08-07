package ber.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ber.com.alura.gerenciador.acao.AlteraEmpresa;
import ber.com.alura.gerenciador.acao.ListaEmpresas;
import ber.com.alura.gerenciador.acao.MostraEmpresa;
import ber.com.alura.gerenciador.acao.NovaEmpresa;
import ber.com.alura.gerenciador.acao.RemoveEmpresas;

/**
 * Servlet implementation class UnicaEntradaServlet
 */
@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String parmAcao = request.getParameter("acao");
		
		if(parmAcao.equals("ListaEmpresas")) {
			
			ListaEmpresas acao = new ListaEmpresas(); 
			acao.executa(request, response);
			
		}else if(parmAcao.equals("RemoveEmpresa")) {
			
			RemoveEmpresas acao = new RemoveEmpresas(); 
			acao.executa(request, response);
			
		}else if(parmAcao.equals("MostraEmpresa")) {
			
			MostraEmpresa acao = new MostraEmpresa(); 
			acao.executa(request, response);
		}else if(parmAcao.equals("AlteraEmpresa")) {
			
			AlteraEmpresa acao = new AlteraEmpresa(); 
			acao.executa(request, response);
		}else if(parmAcao.equals("NovaEmpresa")) {
			
			NovaEmpresa acao = new NovaEmpresa(); 
			acao.executa(request, response);
		}
	}

}
