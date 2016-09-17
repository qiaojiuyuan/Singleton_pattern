/**
 * 皇帝类，只有一个
 * 此单例的好处是不用担心多线程并发问题
 * @author qiaojy
 *
 */
public class Emperor {

	//初始化一个皇帝类
	private static final Emperor emperor = new Emperor();
	
	//私有化构造方法
	private Emperor() {
		
	}
	
	public static Emperor getInstance() {
		return emperor;
	}
	
	public static void say() {
		System.out.println("我是皇帝某某某");
	}
}
