import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AdvancedStringObfuscation {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class zero = Class.forName("0");

		Method main = zero.getMethod("main", String[].class);
		main.invoke(null, (Object) new String[] { "" });

		Class one = Class.forName("1");

		Method one_a = one.getMethod("a", int.class, int.class);
		String ps_var1 = (String) one_a.invoke(one, 1, 0x5f);

		Method zero_c = zero.getMethod("c", String.class);

		String password = (String) zero_c.invoke(zero, ps_var1);

		System.out.println("Password " + password);
	}

}
 
