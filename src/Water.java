
public class Water {

	public double velocity;
	
	public Water() {
		this.velocity = 0;
	}
	
	/**
	 * �������ܣ��޲�ʱĬ��ˮ���ٶ�Ϊ��
	 * ����˵����velocity ˮ���ٶ�
	 * ע�������
	 * �������أ���
	 */
	public Water(double m) {
		this.velocity = m;
	}
	
	/**
	 * �������ܣ��в�ʱ������ˮ���ٶ�
	 * ����˵����velocity ˮ���ٶ�
	 * ע�������
	 * �������أ���
	 */
	public double v() {	 
		return this.velocity;
	}
	
	/**
	 * �������ܣ���ȡˮ���ٶ�
	 * ����˵����velocity ˮ���ٶ�
	 * ע����� ��
	 * �������أ�˫���ȸ����� ˮ���ٶ�
	 */
}
