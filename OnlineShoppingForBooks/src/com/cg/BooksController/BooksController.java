package com.cg.BooksController;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.BooksService.BooksServiceImpl;
import com.cg.pojo.Books;

/**
 * Servlet implementation class BooksController
 */
@WebServlet("*.app")
public class BooksController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BooksServiceImpl service=new BooksServiceImpl();
		String action = request.getServletPath();
		HttpSession session = request.getSession();
		System.out.println(action);
		
		switch(action)
		{
		 case "/viewall.app":
			 Collection<Books> books = service.viewAllBooks();
			 System.out.println(books);
			 session.setAttribute("books", books);
			
			 response.sendRedirect("viewAll.jsp");
			 break;
			
		case "/addtocart.app":
			
			service.addToCart(Integer.parseInt(request.getParameter("bookID")));
			session.setAttribute("no", service.getNumberOfCart());
			System.out.println(service.getTotalPrice()+"printig price---------------");	
			session.setAttribute("price", service.getTotalPrice());
			
			session.setAttribute("booksAll", 	service.viewAllAddedBooks());
			response.sendRedirect("cart.jsp");
			break;
			
case "/removecart.app":
			
			service.removeFromCart(Integer.parseInt(request.getParameter("bookID")));
			session.setAttribute("no", service.getNumberOfCart());	
			//session.setAttribute("rbooks", 	service.viewAllAddedBooks());
			
			session.setAttribute("price", service.getTotalPrice());
			response.sendRedirect("cart.jsp");
			break;
			default:
				break;
		}
		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
