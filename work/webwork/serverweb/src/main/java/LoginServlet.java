import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import member.MemberDAO;
import member.MemberDAOImpl;
import member.MemberDTO;

@WebServlet(name="login",urlPatterns = { "/member/mvc/login"})
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// 1. 요청정보 추출
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		// 2. 비지니스 메소드 호출
		MemberDAO dao = new MemberDAOImpl();
		MemberDTO user = dao.login(id,pass);
		System.out.println(user); 
		
		// 3. 데이터 공유
		request.setAttribute("loginUser", user);
		
		// 4. 요청 재지정(응답페이지로 이동)
		RequestDispatcher rd = request.getRequestDispatcher("/member_mvc/loginResult.jsp");
		rd.forward(request,response);
	}

}
