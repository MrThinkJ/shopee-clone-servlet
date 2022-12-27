package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.UserService;


@WebServlet("/users")
public class UsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UsersController() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> users = UserService.getUsers();
		
		request.setAttribute("users", users);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/users.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String searchInput = request.getParameter("search");
		response.sendRedirect("./search?keyword=" + searchInput);
	}

}
