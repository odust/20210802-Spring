package com.study.spring.case01;
public class Husband {
	private String name;
	private Wife wife;

	public Husband() {}
	public Husband(String name, Wife wife) {this.name = name; this.wife = wife;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Wife getWife() {return wife;}
	public void setWife(Wife wife) {this.wife = wife;}
	/**以下的toString()若同時存在於Husband與Wife裏面,會變成相互依賴,無限遞迴,記憶體溢出,拋出StackOverflowError
	但若僅存在於其中一個則不妨
	所以當專案龐大/複雜時,不要亂覆寫toString(),或者覆寫toString()時要小心別造成相互依賴*/
//	@Override
//	public String toString() {
//		return "Husband [name=" + name + ", wife=" + wife + "]";
//	}
}
