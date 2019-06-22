import org.xvolks.jnative.JNative;
import org.xvolks.jnative.Type;
import org.xvolks.jnative.pointers.Pointer;
import org.xvolks.jnative.pointers.memory.MemoryBlockFactory;

public class Test {
	public static void main(String[] args) throws Exception {
		System.setProperty("jnative.debug", "true");
		JNative jnative = new JNative("D:\\Test\\CheckCodeTest\\AntiVC.dll", "LoadCdsFromFile");
		jnative.setRetVal(Type.INT);
		int i = 0;
		jnative.setParameter(i++, Type.STRING, "D:\\Test\\CheckCodeTest\\B901.cds");
		jnative.setParameter(i++, Type.STRING, "02lv5d5,mb56ah");
		jnative.invoke();
		System.out.println(jnative.getRetVal());

		jnative = new JNative("D:\\Test\\CheckCodeTest\\AntiVC.dll", "GetVcodeFromFile");
		Pointer strP = new Pointer(MemoryBlockFactory.createMemoryBlock(4 * 10));
		jnative.setRetVal(Type.INT);
		i = 0;
		jnative.setParameter(i++, 1);
		jnative.setParameter(i++, Type.STRING, "D:\\Test\\CheckCodeTest\\1.jpg");
		jnative.setParameter(i++, strP);
		jnative.invoke();
		System.out.println(jnative.getRetVal());
		System.out.println(strP.getAsString());
	}

}
