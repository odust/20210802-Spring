package com.study.spring.case01;
public class Wife {
	private String name;
	private Husband husband;

	public Wife() {}
	public Wife(String name, Husband husband) {this.name = name; this.husband = husband;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Husband getHusband() {return husband;}
	public void setHusband(Husband husband) {this.husband = husband;}
	/**以下的toString()若同時存在於Husband與Wife裏面,會變成相互依賴,無限遞迴,記憶體溢出,拋出StackOverflowError
	但若僅存在於其中一個則不妨
	所以當專案龐大/複雜時,不要亂覆寫toString(),或者覆寫toString()時要小心別造成相互依賴*/
//	@Override
//	public String toString() {
//		return "Wife [name=" + name + ", husband=" + husband + "]";
//	}
}
