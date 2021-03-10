package day02homework;

import java.lang.reflect.Method;

public class HomeWork01 {
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		String str = "test01.Test";
		try {
			Class<?> test = Class.forName(str);
			Object obj = test.newInstance();
			
			Method m =test.getDeclaredMethod("print");
			m.setAccessible(true);
			m.invoke(obj);
		
			
		} catch (Exception e) {
		}
	}
	 //reflection

	//newIntance()<<이거다 
	//http://blog.naver.com/PostView.nhn?blogId=since201109&logNo=150153835171
}



/*
 * 네이버에서 안 배운 tag
 * <script> 
 * <style>
 * <iframe>
 * <address>
 */
