package singletonDemo;

public class singletonDp {
	
	//defining a singleton class means class with single object/instance of class at any given time
	// For singleton we need to make constructor of class as private
	// need to do "lazy initialization" - we should have public static method in class with return type of object of this class
	
	private static singletonDp cls_var = null;
	private String str;
	
	// declaring private constructor of class
	private singletonDp() {
		str="using singleton design pattern";
	}
	
	
	// Doing lazy initialization
	
	public static singletonDp getInstance() {
		
		if (cls_var == null) {
			cls_var= new singletonDp();
		}
		return cls_var;
	}

	public static void main(String[] args) {
		
		singletonDp ins_var1= singletonDp.getInstance();
		singletonDp ins_var2= singletonDp.getInstance();
		singletonDp ins_var3= singletonDp.getInstance();
		
		ins_var1.str= (ins_var1.str).toUpperCase();
		System.out.println(ins_var1.str);
		System.out.println(ins_var2.str);
		System.out.println(ins_var3.str);
		
		ins_var3.str= (ins_var3.str).toLowerCase();
		
		System.out.println(ins_var1.str);
		System.out.println(ins_var2.str);
		System.out.println(ins_var3.str);
	}

}
