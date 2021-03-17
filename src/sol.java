import java.util.Scanner;
import java.lang.Math;
//注意：输出角度为弧度制
public class sol {
	public static void main(String[] args) {
		try {
		//获取数据	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入水流的速度（m/s）");
		double v1 = scan.nextDouble();

		System.out.println("请输入小船在净水中的速度（m/s）");
		double v2 = scan.nextDouble();
		
		System.out.println("请输入河的宽度");
		double d = scan.nextDouble();
		
		scan.close();
		//创建船和水的对象
		water water = new water(v1);
		ship ship = new ship(v2);
		//数据处理完毕，开始解题
		//过河时间最短
		double t = d / ship.v();
		System.out.println("小船的最短过河时间为"+t+"s");
		//过河路程最短
		if(ship.v() > water.v()) {
			
			double angle = Math.acos(water.v() / ship.v());
			System.out.println("小船有最短路径过河时，船头于上河岸夹角为"+angle+"π，最短行程为"+d+"m");
			
		}else if (ship.v() < water.v()) {
			
			double angle = Math.acos(ship.v() / water.v());
			double s = (water.v() * d ) / ship.v();
			System.out.println("小船有最短路径过河时，船头于上河岸夹角为"+angle+"π，最短行程为"+s+"m");
			
		}else if (ship.v() == water.v()) {
			System.out.println("无最短路径过河");
		}
		
		}catch(Exception e) {//抛出输入异常
			System.out.println("发生错误，请检查输入");
		}
	}
}
