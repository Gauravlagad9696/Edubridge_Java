package com.memory.management;

public class GarbageCollectionEx {
	public void finalize() {
		System.out.println("hello java..");
	}

	public static void main(String[] args) {
		GarbageCollectionEx a = new GarbageCollectionEx();
		GarbageCollectionEx b = new GarbageCollectionEx();

//		gc1 = null;
//		System.gc();
		a = b;
		a = null;
		System.gc();

	}

}
