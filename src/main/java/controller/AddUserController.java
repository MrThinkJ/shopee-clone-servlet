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


@WebServlet("/add_user")
public class AddUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddUserController() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/add_user.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = (String) request.getParameter("id");
		String fullName = (String)request.getParameter("fullName");
		String age = (String)request.getParameter("age");
		String gender = (String)request.getParameter("gender");
		String address = (String)request.getParameter("address");
		String destination = "./users";
		if (id.equals("") && fullName.equals("") && age.equals("") && gender.equals("") && address.equals("")
			|| id.equals("") || age.equals(""))
		{
			response.sendRedirect(destination);
			return;
		}
		else
		{
			User user = new User();
			user.setId(Integer.parseInt(id));
			user.setFullName(fullName);
			user.setAge(Integer.parseInt(age));
			user.setGender(gender);
			user.setAddress(address);
			UserService.addUser(user);
			response.sendRedirect(destination);
		}
	}

}
