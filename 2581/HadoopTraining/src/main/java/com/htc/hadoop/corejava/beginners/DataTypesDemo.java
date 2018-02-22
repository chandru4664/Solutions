package com.htc.hadoop.corejava.beginners;

public class DataTypesDemo {

	private byte byteVar = 123;
	private short shortVar = 1234;
	private char charVar = 'V';
	private boolean booleanVar = true;
	private int intVar = 12345;
	private long longVar = 123456L;
	private float floatVar = 123.45f;
	private double doubleVar = 12345.67;

	public static void main(String[] args) {
		DataTypesDemo demo = new DataTypesDemo();
		System.out.println(demo.toString());

	}

	@Override
	public String toString() {
		return "DataTypesDemo [byteVar=" + byteVar + ", shortVar=" + shortVar + ", charVar=" + charVar + ", booleanVar="
				+ booleanVar + ", intVar=" + intVar + ", longVar=" + longVar + ", floatVar=" + floatVar + ", doubleVar="
				+ doubleVar + "]";
	}

}
