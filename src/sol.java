import java.util.Scanner;
import java.lang.Math;

public class sol {
	public static void main(String[] args) {
		try {
		//��ȡ����	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ˮ�����ٶȣ�m/s��");
		double v1 = scan.nextDouble();

		System.out.println("������С���ھ�ˮ�е��ٶȣ�m/s��");
		double v2 = scan.nextDouble();
		
		System.out.println("������ӵĿ��");
		double d = scan.nextDouble();
		
		scan.close();
		//��������ˮ�Ķ���
		water water = new water(v1);
		ship ship = new ship(v2);
		//���ݴ�����ϣ���ʼ����
		//����ʱ�����
		double t = d / ship.v();
		System.out.println("С������̹���ʱ��Ϊ"+t+"s");
		//����·�����
		if(ship.v() > water.v()) {
			
			double angle = Math.acos(water.v() / ship.v());
			System.out.println("С�������·������ʱ����ͷ���ϺӰ��н�Ϊ"+angle+"�У�����г�Ϊ"+d+"m");
			
		}else if (ship.v() < water.v()) {
			
			double angle = Math.acos(ship.v() / water.v());
			double s = (water.v() * d ) / ship.v();
			System.out.println("С�������·������ʱ����ͷ���ϺӰ��н�Ϊ"+angle+"�У�����г�Ϊ"+s+"m");
			
		}else if (ship.v() == water.v()) {
			System.out.println("�����·������");
		}
		
		}catch(Exception e) {//�׳������쳣
			System.out.println("����������������");
		}
	}
}
