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
		
		System.out.println("������ӵĿ��(m)");
		double d = scan.nextDouble();
		
		scan.close();
		//��������ˮ�Ķ���
		water water = new water(v1);
		ship ship = new ship(v2);
		//���ݴ�����ϣ���ʼ����
		//����·�����
		if(ship.v() > water.v()) {
			
			double angle = Math.acos(water.v() / ship.v());
			/**
			 * �������ܣ��������ʱ���н��Ƕ�
			 * ����˵����ship.v() ���ھ�ˮ�е��ٶȣ���λ ��ÿ�룻water.v() ˮ���ٶȣ���λ ��ÿ��
			 * ע�������������ȷ��ǰ������ע������
			 * �������أ�˫���ȸ����� �н��Ƕ�
			 */
			double t_s = d / Math.sqrt(ship.v()*ship.v() - water.v()* water.v());
			/**
			 * �������ܣ�������ӵ�ʱ��
			 * ����˵����d �ӵĿ�ȣ���λ �ף�ship.v() ���ھ�ˮ�е��ٶȣ���λ ��ÿ�룻water.v() ˮ���ٶȣ���λ ��ÿ��
			 * ע�������������ȷ��ǰ������ע������
			 * �������أ�˫���ȸ����� ����ʱ��
			 */
			System.out.println("С�������·������ʱ�����з�����ˮ������ɽ�"+angle+"�У�����г�Ϊ"+d+"m������ʱ��Ϊ"+t_s+"s");
			
		}else if (ship.v() < water.v()) {
			
			double angle = Math.acos(ship.v() / water.v());
			/**
			 * �������ܣ��������ʱ���н��Ƕ�
			 * ����˵����ship.v()���ھ�ˮ�е��ٶȣ���λ ��ÿ�룻water.v()ˮ���ٶȣ���λ ��ÿ��
			 * ע�������������ȷ��ǰ������ע������
			 * �������أ�˫���ȸ����� �н��Ƕ�
			 */
			double s_s = (water.v() * d ) / ship.v();
			/**
			 * �������ܣ�������ӵ�����г�
			 * ����˵����ship.v()���ھ�ˮ�е��ٶȣ���λ ��ÿ�룻water.v()ˮ���ٶȣ���λ ��ÿ��
			 * ע�������������ȷ��ǰ������ע������
			 * �������أ�˫���ȸ����� �н��Ƕ�
			 */
			double t_s = (water.v() / ship.v())* d / Math.sqrt(water.v()* water.v() -ship.v()*ship.v());
			/**
			 * �������ܣ�������ӵ�ʱ��
			 * ����˵����d �ӵĿ�ȣ���λ �ף�ship.v() ���ھ�ˮ�е��ٶȣ���λ ��ÿ�룻water.v() ˮ���ٶȣ���λ ��ÿ��
			 * ע�������������ȷ��ǰ������ע������
			 * �������أ�˫���ȸ����� ����ʱ��
			 */
			System.out.println("С�������·������ʱ�����з�����ˮ������ɽ�"+angle+"�У�����г�Ϊ"+s_s+"m������ʱ��Ϊ"+t_s+"s");
			
		}else if (ship.v() == water.v()) {
			System.out.println("�����·������");
		}
		//����ʱ�����
		double t_t = d / ship.v();
		/**
		 * �������ܣ�����������ʱ��
		 * ����˵����d �ӵĿ�ȣ���λ �ף�ship.v() ���ھ�ˮ�е��ٶȣ���λ ��ÿ��
		 * ע�������������ȷ��ǰ������ע������
		 * �������أ�˫���ȸ����� �ɺ�ʱ��
		 */
		double s_t = t_t * water.v();
		/**
		 * �������ܣ����㵽��Ӱ���λ��
		 * ����˵����t:�ɺ�ʱ�䣬��λ �룻water.v()ˮ���ٶȣ���λ ��ÿ��
		 * ע�������������ȷ��ǰ������ע������
		 * �������أ�˫���ȸ����� ����λ��
		 */
		System.out.println("С������̹���ʱ��Ϊ"+t_t+"s�����з�����ˮ������ֱ������λ���Դ���ֱ���ӵ�λ��Ϊ�����ˮ������"+s_t+"m");
		
		
		}catch(Exception e) {//�׳������쳣
			System.out.println("����������������");
		}
	}
}
