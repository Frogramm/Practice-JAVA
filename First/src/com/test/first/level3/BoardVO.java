package com.test.first.level3;

public class BoardVO { //메소드를통해넣거나, 생성자를통해 넣는다.
	private String title;
	private String content;
	private int writeId;
	//상수는 퍼블릭 변수는X
	public BoardVO() { //기본생성자가 생성될때는 생성자가 없을때 생성
		
	}
	
	public BoardVO(String title, String content, int writeId) {
		super();
		this.title = title; //전역변수명과 지역변수명이 같아서 this.을 붙인다.
		this.content = content;
		this.writeId = writeId;
	}
	//setter (값주입 메소드)
	//setter => 무조건 void 형 (입력만 시키기 때문)
	//getter (값빼는 메소드)
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle(){
		return title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent(){
		return content; //this.붙여도 된다.
	}
	
	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}
	
	public int getWriteId(){
		return writeId;
	}
	
	
	
}
