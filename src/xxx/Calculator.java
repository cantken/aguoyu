package xxx;

//請設計三個類別Calculator.java，CalException.java與CalTest.java，在Calculator.java裡有個自訂
//方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。 CalTest.java執行後，使用者可
//以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：

//1. x與y同時為0，(產生自訂的CalException例外物件)
//2. y為負值，而導致x的y次方結果不為整數
//3. x與y皆正確情況下，會顯示運算後結

public class Calculator {
	private int value;
	int x = 0;
	int y = 0;
	double d = 0.0;

	public Calculator() {

	}

//	public Calculator(int x , int y) throws CalculatorException {
//		
//	}

	public int getvalue() {
		return value;
	}

	public void setx(int value) throws CubeException {
		if (x > 0) {
			this.x = x;
		} else {
			throw new CubeException("0的0次方沒有意義");
		}
	}

	public int getx() {
		return x;
	}
	
	public void sety(int value) throws CubeException {
		if (y > 0) {
			this.y = y;
		} else {
			throw new CubeException("0的0次方沒有意義");
		}
	}
	
	
	

	public int gety() {
		return y;
	}


	public double powerXY() {
		double d = Math.pow(x, y);
		return d;
	}

//	public void setvalue(int value) throws CalculatorException {
//		if (value > 0) {
//			this.value = value;
//		}else if (value = 0) {
//			throws new CalculatorException("0的0次方沒有意義!");
//		}else if (value < 0) {
//			throws new CalculatorException("次方為負值，結果回傳不為整數!");	
//		}else if (vaule != 0) {
//			throws new CalculatorException("輸入格式不正確!");
//		}

}