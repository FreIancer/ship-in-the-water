
public class Ship {

	public double velocity;

	public Ship() {
		this.velocity = 0;
	}

	/**
	 * 函数功能：无参时默认船在静水中的速度为零 
	 * 参数说明：velocity 船在净水中的速度 
	 * 注意事项：无 
	 * 函数返回：无
	 */
	public Ship(double m) {
		this.velocity = m;
	}

	/**
	 * 函数功能：有参时设置船在静水中的速度
	 * 参数说明：velocity 船在净水中的速度 
	 * 注意事项：无 
	 * 函数返回：无
	 */
	public double v() {
		return this.velocity;
	}
	/**
	 * 函数功能：获取船在净水中的速度
	 * 参数说明：velocity 船在净水中的速度 
	 * 注意事项：无 
	 * 函数返回：双精度浮点数 船在净水中的速度
	 */
}
