package listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

// WAS 실행/종료를 감시하는 리스너
public class MyContextListener implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// WAS가 시작될 떄
		System.out.println("MyContextListener contextInitialized...");
		
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		System.out.println("MyContextListener contextDestroyed");
	
	}
	
	
}
