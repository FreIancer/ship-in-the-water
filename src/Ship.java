
public class Ship {

	public double velocity;

	public Ship() {
		this.velocity = 0;
	}

	/**
	 * �������ܣ��޲�ʱĬ�ϴ��ھ�ˮ�е��ٶ�Ϊ�� 
	 * ����˵����velocity ���ھ�ˮ�е��ٶ� 
	 * ע������� 
	 * �������أ���
	 */
	public Ship(double m) {
		this.velocity = m;
	}

	/**
	 * �������ܣ��в�ʱ���ô��ھ�ˮ�е��ٶ�
	 * ����˵����velocity ���ھ�ˮ�е��ٶ� 
	 * ע������� 
	 * �������أ���
	 */
	public double v() {
		return this.velocity;
	}
	/**
	 * �������ܣ���ȡ���ھ�ˮ�е��ٶ�
	 * ����˵����velocity ���ھ�ˮ�е��ٶ� 
	 * ע������� 
	 * �������أ�˫���ȸ����� ���ھ�ˮ�е��ٶ�
	 */
}
