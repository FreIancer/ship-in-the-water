import java.util.Scanner;
import java.lang.Math;

public class Sol {
	public static void main(String[] args) {
		try {
		//��ȡ����	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ˮ�����ٶȣ�m/s��");
		double v1 = scan.nextDouble();

		System.out.println("������С���ھ�ˮ�е��ٶȣ�m/s��");
		double v2 = scan.nextDouble();
		
		System.out.println("������ӵĿ��(m)");
		double d = scan.nextDouble();
		
		scan.close();
		//��������ˮ�Ķ���
		Water water = new Water(v1);
		Ship ship = new Ship(v2);
		//���ݴ�����ϣ���ʼ����
		//����·�����
		if(ship.v() > water.v()) {
			
			double angle = Math.acos(water.v() / ship.v());
			
			double t_s = d / Math.sqrt(ship.v()*ship.v() - water.v()* water.v());
			
			System.out.println("С�������·������ʱ�����з�����ˮ������ɽ�"+angle+"�У�����г�Ϊ"+d+"m������ʱ��Ϊ"+t_s+"s");
			
		}else if (ship.v() < water.v()) {
			
			double angle = Math.acos(ship.v() / water.v());
			
			double s_s = (water.v() * d ) / ship.v();
			
			double t_s = (water.v() / ship.v())* d / Math.sqrt(water.v()* water.v() -ship.v()*ship.v());
			
			System.out.println("С�������·������ʱ�����з�����ˮ������ɽ�"+angle+"�У�����г�Ϊ"+s_s+"m������ʱ��Ϊ"+t_s+"s");
			
		}else if (ship.v() == water.v()) {
			System.out.println("�����·������");
		}
		//����ʱ�����
		double t_t = d / ship.v();
		
		double s_t = t_t * water.v();
		
		System.out.println("С������̹���ʱ��Ϊ"+t_t+"s�����з�����ˮ������ֱ������λ���Դ���ֱ���ӵ�λ��Ϊ�����ˮ������"+s_t+"m");
		
		
		}catch(Exception e) {//�׳������쳣
			System.out.println("����������������");
		}
	}
}
