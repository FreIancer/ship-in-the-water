
public class Water {

	public double velocity;
	
	public Water() {
		this.velocity = 0;
	}
	
	/**
	 * 函数功能：无参时默认水流速度为零
	 * 参数说明：velocity 水流速度
	 * 注意事项：无
	 * 函数返回：无
	 */
	public Water(double m) {
		this.velocity = m;
	}
	
	/**
	 * 函数功能：有参时将设置水流速度
	 * 参数说明：velocity 水流速度
	 * 注意事项：无
	 * 函数返回：无
	 */
	public double v() {	 
		return this.velocity;
	}
	
	/**
	 * 函数功能：获取水流速度
	 * 参数说明：velocity 水流速度
	 * 注意事项： 无
	 * 函数返回：双精度浮点数 水流速度
	 */
}
