package p11;


class Son extends AbstractClass{

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
}

public abstract class AbstractClass {
	public void test() {
		
	}
	
	public abstract void test2();

	public static void main(String[] args) {
		AbstractClass ab = new Son();
		ab.test();
		ab.test2();
	}
}
