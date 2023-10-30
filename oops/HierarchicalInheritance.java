package com.oops;

class ABC {
	public void print_ABC() {
		System.out.println("Cooking");
	}
}

class XYZ extends ABC {
	public void print_XYZ() {
		System.out.println("Emerging Technology");
	}
}

class PQR extends ABC {
	public void print_PQR() {
		System.out.println("IoT");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		PQR d = new PQR();
		d.print_ABC();
		XYZ f = new XYZ();
		f.print_XYZ();
	}
}
