package it.sincrono.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.sincrono.model.Prodotti;
import it.sincrono.model.ProdottiImpl;
import it.sincrono.model.UtilityDatabase;

/**
 * Servlet implementation class CoopController
 */
@WebServlet("/CoopController")
public class CoopController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String operazione=request.getParameter("operazione");
		String username;
		String password;
		UtilityDatabase utility= new UtilityDatabase();
		
		
		switch (operazione){
		
			case "login":
				
				username=request.getParameter("username");
				password=request.getParameter("password");
				
				if(utility.loginTabella(username,password)){
					response.sendRedirect("view/formScelta.jsp");
				}
				else {
					response.sendRedirect("view/erroreLogin.html");
				}
				
				
				break;
			
			
			
			case "modifica":
				break;
		
			case "elimina":
				break;
				
			case "crea":
				break;
				
			case "visualizza":
				break;
		
		}
		

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		String tab=req.getParameter("tabella");
		String paginaDestinazione;
	
		
		//Switch che indirizza per la visualizzazione
		switch (tab) {
		
		//Visualizza tutti i prodotti e ritorna l'oggetto alla pagina JSP
		case "prodotti":
			
			paginaDestinazione="/view/controlProdotti.jsp";
			ProdottiImpl imp=new ProdottiImpl();
			RequestDispatcher rd=null;
					
			List<Prodotti> lista=imp.getAllProdotti();
			
			
			req.setAttribute("tutti", lista);
			rd=req.getRequestDispatcher(paginaDestinazione);
			rd.forward(req, resp);
		
			break;
	
		case "categorie":
			break;
			
		case "fornitori":
			break;
			
		}
		
		
		
		
		
	}
}