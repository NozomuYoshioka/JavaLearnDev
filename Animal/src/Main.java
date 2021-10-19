

enum testEnum{
	hoge,foo ,bar;
}

public class Main implements testinterface {
	public static void main(String[] args)
	{
		testinterface.calc();
		Main main = new Main();
		main.calcDefault();

		main.test(testEnum.bar);
	}


	public void test(testEnum enm) {
		System.out.println(enm);
	}
}
