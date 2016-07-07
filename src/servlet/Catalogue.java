package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Catalogue
 */
@WebServlet("/Catalogue")
public class Catalogue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Catalogue() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");//type de retour text en html
		
		RequestDispatcher dispatch = request.getRequestDispatcher("afficheCatalogue.jsp");//renvoie cette vue
		
		dispatch.forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");//type de retour text en html
		
		//EJBRenvoieCatalogue stub = getEJBRenvoieCatalogue();
		
		//ArrayList<Article> catalogue = stub.getCatlogue();
		
		
		RequestDispatcher dispatch = request.getRequestDispatcher("afficheCatalogue.jsp");//renvoie cette vue
		
		System.out.println("oui");
		dispatch.forward(request, response);
		
		
		
	}
	
	/*EJBREnvoieCatalogue getEJBRenvoieCatalogue()
	 * */

}
