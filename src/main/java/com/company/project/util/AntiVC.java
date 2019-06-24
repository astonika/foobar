package com.company.project.util;
import org.xvolks.jnative.JNative;
import org.xvolks.jnative.Type;
import org.xvolks.jnative.pointers.Pointer;
import org.xvolks.jnative.pointers.memory.MemoryBlockFactory;

public class AntiVC {

	private static final String AntiVCDLL = "D:\\Test\\CheckCodeTest\\AntiVC.dll";
	private static final String LoadCdsFromFile = "LoadCdsFromFile";
	private static final String LoadCdsFromBuffer = "LoadCdsFromBuffer";
	private static final String GetVarPtr = "GetVarPtr";
	private static final String GetVcodeFromFile = "GetVcodeFromFile";
	private static final String GetVcodeFromBuffer = "GetVcodeFromBuffer";
	private static final String GetVcodeFromHWND = "GetVcodeFromHWND ";
	private static final String GetVcodeFromIECache = "GetVcodeFromIECache";
	private static final String GetVcodeFromHBitmap = "GetVcodeFromHBitmap";
	private static final String FreeAllCdsFile = "FreeAllCdsFile";
	private static final String SetTimeOut = "SetTimeOut";
//	private static final String SetCdsOption = "SetCdsOption";
//	private static final String Calculator = "Calculator ";
//	private static final String UseUnicodeString = "UseUnicodeString";
	private static final String FilePath = "D:\\Test\\CheckCodeTest\\B901.cds";
	private static final String Password = "02lv5d5,mb56ah";
	private String vcode;

	public String getVcode() {
		return vcode;
	}

	public void setVcode(String vcode) {
		this.vcode = vcode;
	}

	public void initMethod() throws Exception {
//		System.out.println(loadCdsFromFile(FilePath, Password));
		loadCdsFromFile(FilePath, Password);
	}

	public Integer loadCdsFromFile(String filePath, String password)
			throws Exception {
		JNative jnative = new JNative(AntiVCDLL, LoadCdsFromFile);
		jnative.setRetVal(Type.INT);
		int i = 0;
		jnative.setParameter(i++, filePath);
		jnative.setParameter(i++, password);
		jnative.invoke();
		return jnative.getRetValAsInt();
	}

	@Deprecated
	public Integer loadCdsFromBuffer(Integer fileBuffer, Integer fileBufLen,
			String password) throws Exception {
		JNative jnative = new JNative(AntiVCDLL, LoadCdsFromBuffer);
		jnative.setRetVal(Type.INT);
		int i = 0;
		jnative.setParameter(i++, fileBuffer);
		jnative.setParameter(i++, fileBufLen);
		jnative.setParameter(i++, password);
		jnative.invoke();
		return jnative.getRetValAsInt();
	}

	public Boolean getVcodeFromFile(Integer cdsFileIndex, String filePath)
			throws Exception {
		JNative jnative = new JNative(AntiVCDLL, GetVcodeFromFile);
		Pointer strP = new Pointer(MemoryBlockFactory.createMemoryBlock(4 * 10));
		jnative.setRetVal(Type.INT);
		int i = 0;
		jnative.setParameter(i++, cdsFileIndex);
		jnative.setParameter(i++, filePath);
		jnative.setParameter(i++, strP);
		jnative.invoke();
//		System.out.println(jnative.getRetVal());
		this.vcode = strP.getAsString();
		// return strP.getAsString();
		return jnative.getRetValAsInt() == 1;
	}

	@Deprecated
	public Boolean getVcodeFromBuffer(Integer cdsFileIndex, Integer imgBuffer,
			Integer imgBufLen) throws Exception {
		JNative jnative = new JNative(AntiVCDLL, GetVcodeFromBuffer);
		Pointer strP = new Pointer(MemoryBlockFactory.createMemoryBlock(4 * 10));
		jnative.setRetVal(Type.INT);
		int i = 0;
		jnative.setParameter(i++, cdsFileIndex);
		jnative.setParameter(i++, imgBuffer);
		jnative.setParameter(i++, imgBufLen);
		jnative.setParameter(i++, strP);
		jnative.invoke();
		System.out.println(jnative.getRetVal());
		this.vcode = strP.getAsString();
		// return strP.getAsString();
		return jnative.getRetValAsInt() == 1;
	}

	@Deprecated
	public Boolean getVcodeFromHWND(Integer cdsFileIndex, Integer hwnd,
			Integer lpRect, Integer debugMode) throws Exception {
		JNative jnative = new JNative(AntiVCDLL, GetVcodeFromHWND);
		Pointer strP = new Pointer(MemoryBlockFactory.createMemoryBlock(4 * 10));
		jnative.setRetVal(Type.INT);
		int i = 0;
		jnative.setParameter(i++, cdsFileIndex);
		jnative.setParameter(i++, hwnd);
		jnative.setParameter(i++, lpRect);
		jnative.setParameter(i++, strP);
		jnative.setParameter(i++, debugMode);
		jnative.invoke();
		System.out.println(jnative.getRetVal());
		this.vcode = strP.getAsString();
		// return strP.getAsString();
		return jnative.getRetValAsInt() == 1;
	}

	@Deprecated
	public Boolean getVcodeFromIECache(Integer cdsFileIndex, String imgURL)
			throws Exception {
		JNative jnative = new JNative(AntiVCDLL, GetVcodeFromIECache);
		Pointer strP = new Pointer(MemoryBlockFactory.createMemoryBlock(4 * 10));
		jnative.setRetVal(Type.INT);
		int i = 0;
		jnative.setParameter(i++, cdsFileIndex);
		jnative.setParameter(i++, imgURL);
		jnative.setParameter(i++, strP);
		jnative.invoke();
		System.out.println(jnative.getRetVal());
		this.vcode = strP.getAsString();
		// return strP.getAsString();
		return jnative.getRetValAsInt() == 1;
	}

	@Deprecated
	public Boolean getVcodeFromHBitmap(Integer cdsFileIndex, Integer hbitmap)
			throws Exception {
		JNative jnative = new JNative(AntiVCDLL, GetVcodeFromHBitmap);
		Pointer strP = new Pointer(MemoryBlockFactory.createMemoryBlock(4 * 10));
		jnative.setRetVal(Type.INT);
		int i = 0;
		jnative.setParameter(i++, cdsFileIndex);
		jnative.setParameter(i++, hbitmap);
		jnative.setParameter(i++, strP);
		jnative.invoke();
		System.out.println(jnative.getRetVal());
		this.vcode = strP.getAsString();
		// return strP.getAsString();
		return jnative.getRetValAsInt() == 1;
	}

	@Deprecated
	public void freeAllCdsFile() throws Exception {
		JNative jnative = new JNative(AntiVCDLL, FreeAllCdsFile);
		jnative.setRetVal(Type.VOID);
		jnative.invoke();
		System.out.println(jnative.getRetVal());
	}

	@Deprecated
	public Boolean setTimeOut(Integer cdsFileIndex, Integer timeOut)
			throws Exception {
		JNative jnative = new JNative(AntiVCDLL, SetTimeOut);
		jnative.setRetVal(Type.INT);
		int i = 0;
		jnative.setParameter(i++, cdsFileIndex);
		jnative.setParameter(i++, timeOut);
		jnative.invoke();
		System.out.println(jnative.getRetVal());
		return jnative.getRetValAsInt() == 1;

	}

//	public Boolean setCdsOption(Integer cdsFileIndex, Integer optionIndex,
//			Integer optionValue) throws Exception {
//		JNative jnative = new JNative(AntiVCDLL, SetCdsOption);
//		jnative.setRetVal(Type.INT);
//		int i = 0;
//		jnative.setParameter(i++, cdsFileIndex);
//		jnative.setParameter(i++, optionIndex);
//		jnative.setParameter(i++, optionValue);
//		jnative.invoke();
//		System.out.println(jnative.getRetVal());
//		return jnative.getRetValAsInt() == 1;
//	}
//
//	public Boolean calculator(String expression) throws Exception {
//		JNative jnative = new JNative(AntiVCDLL, Calculator);
//		Pointer strP = new Pointer(MemoryBlockFactory.createMemoryBlock(4 * 10));
//		jnative.setRetVal(Type.INT);
//		int i = 0;
//		jnative.setParameter(i++, expression);
//		jnative.setParameter(i++, strP);
//		jnative.invoke();
//		System.out.println(jnative.getRetVal());
//		this.vcode = strP.getAsString();
//		return jnative.getRetValAsInt() == 1;
//	}
//
//	public void useUnicodeString(Boolean unicodeString) throws Exception {
//		JNative jnative = new JNative(AntiVCDLL, UseUnicodeString);
//		jnative.setRetVal(Type.VOID);
//		int i = 0;
//		jnative.setParameter(i++, unicodeString ? 1 : 0);
//		jnative.invoke();
//	}

	public void destory() throws Exception {
		freeAllCdsFile();
	}

	public static void main(String[] args) throws Exception {
		AntiVC antiVC = new AntiVC();
		antiVC.initMethod();
		System.out.println(antiVC.getVcodeFromIECache(1, "http://60.213.30.214:8805/Ajax/ValidCodeImg.ashx"));;
//		System.out.println(antiVC.getVcodeFromFile(1,
//				"D:\\Test\\CheckCodeTest\\1.jpg"));
		System.out.println(" ============================= "
				+ antiVC.getVcode());
//		System.out.println(antiVC.calculator("6-3"));;
		antiVC.destory();
//		antiVC.useUnicodeString(true);
	}

}
