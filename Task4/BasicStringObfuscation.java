
public class BasicStringObfuscation {

	public static void main(String[] var0) {
		System.out.println(xor("aRa2lPT6A6gIqm4RE"));
	}

	private static String xor(String param1) {
		char[] pcVar1;
		char[] pcVar2;
		int iVar3;
		String objectRef;

		pcVar2 = param1.toCharArray();
		pcVar1 = new char[pcVar2.length];
		iVar3 = 0;
		while (true) {
			if (pcVar1.length <= iVar3)
				break;
			pcVar1[iVar3] = (char) (pcVar2[iVar3] ^ (short) (iVar3 % 3));
			iVar3 = iVar3 + 1;
		}
		objectRef = new String(pcVar1);
		return objectRef;
	}

}
 
