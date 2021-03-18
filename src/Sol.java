import java.util.Scanner;
import java.lang.Math;

public class Sol {
	public static void main(String[] args) {
		try {
		//获取数据	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入水流的速度（m/s）");
		double v1 = scan.nextDouble();

		System.out.println("请输入小船在静水中的速度（m/s）");
		double v2 = scan.nextDouble();
		
		System.out.println("请输入河的宽度(m)");
		double d = scan.nextDouble();
		
		scan.close();
		//创建船和水的对象
		Water water = new Water(v1);
		Ship ship = new Ship(v2);
		//数据处理完毕，开始解题
		//过河路程最短
		if(ship.v() > water.v()) {
			
			double angle = Math.acos(water.v() / ship.v());
			
			double t_s = d / Math.sqrt(ship.v()*ship.v() - water.v()* water.v());
			
			System.out.println("小船有最短路径过河时，划行方向与水流方向成角"+angle+"π，最短行程为"+d+"m，过河时间为"+t_s+"s");
			
		}else if (ship.v() < water.v()) {
			
			double angle = Math.acos(ship.v() / water.v());
			
			double s_s = (water.v() * d ) / ship.v();
			
			double t_s = (water.v() / ship.v())* d / Math.sqrt(water.v()* water.v() -ship.v()*ship.v());
			
			System.out.println("小船有最短路径过河时，划行方向与水流方向成角"+angle+"π，最短行程为"+s_s+"m，过河时间为"+t_s+"s");
			
		}else if (ship.v() == water.v()) {
			System.out.println("无最短路径过河");
		}
		//过河时间最短
		double t_t = d / ship.v();
		
		double s_t = t_t * water.v();
		
		System.out.println("小船的最短过河时间为"+t_t+"s，划行方向与水流方向垂直，到达位置以船垂直过河的位置为起点沿水流方向"+s_t+"m");
		
		
		}catch(Exception e) {//抛出输入异常
			System.out.println("发生错误，请检查输入");
		}
	}
}
