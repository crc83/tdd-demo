package org.sbelei.demo;

public class MyBean {

	public Object getAttr1() {
		return "attr1value";
	}

	public Object getAttr2() {
		return "attr2value";
	}

	@Override
	public String toString() {
		return "MyBean [getAttr1()=" + getAttr1() + ", getAttr2()=" + getAttr2() + "]";
	}
	


}
