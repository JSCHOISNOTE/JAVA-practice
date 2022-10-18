package a;

import d.D;

public class F extends D {
	private int field2 = 5;
	
	public F(){
		
	}
	
	public void print() {
		System.out.printf("field1: %d, field2 : %d%n",super.field1, this.field2);
	}

}
