
public interface testinterface
{
	public static void calc()
	{
		System.out.println("hoge");
	}

	default void calcDefault()
	{
		System.out.println("hogehoge2");
	}

}
