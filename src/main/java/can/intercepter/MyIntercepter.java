package can.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyIntercepter implements HandlerInterceptor{
	
	//��������ķ���֮ǰִ��
	//�������true,��ִ����һ��������������false��ִ����һ��������
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("----------����ǰ----------");
		return true;
	}
	
	//��������ķ���֮��ִ��
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("----------�����----------");
		
	}
	
	//��DispatcherServlet�����ִ�У���������
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
