package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domaine.Article;
import domaine.ArticleService;

/**
 * Servlet implementation class Catalogue
 */

public class Catalogue extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ArticleService service;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Catalogue() {
	super();
	// TODO Auto-generated constructor stub
    }

    public void init() {

	service = new ArticleService();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	// response.getWriter().append("Served at:
	// ").append(request.getContextPath());

	Article[] catalog = service.getCatalog();

	request.setAttribute("list", catalog);

	RequestDispatcher dispatch = request.getRequestDispatcher("afficheCatalogue.jsp");// renvoie
											  // cette
											  // vue

	dispatch.forward(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    /*
     * public void doPost(HttpServletRequest request, HttpServletResponse
     * response) throws ServletException, IOException { doGet(request,
     * response); response.setContentType("text/html"); // type de retour text
     * en html
     * 
     * // EJBRenvoieCatalogue stub = getEJBRenvoieCatalogue(); // //
     * ArrayList<Article> catalogue = stub.getCatlogue();
     * 
     * Article[] catalog = service.getCatalog();
     * 
     * request.setAttribute("liste", catalog);
     * 
     * RequestDispatcher dispatch =
     * request.getRequestDispatcher("afficheCatalogue.jsp");// renvoie // cette
     * // vue
     * 
     * System.out.println("oui"); dispatch.forward(request, response);
     * 
     * }
     */

    /*
     * EJBREnvoieCatalogue getEJBRenvoieCatalogue()
     */

}
