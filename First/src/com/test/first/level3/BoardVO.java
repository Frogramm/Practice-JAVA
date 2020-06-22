package com.test.first.level3;

public class BoardVO {
	private String title;
	private String content;
	private int writeId;
	
	public BoardVO() {
		
	}
	
	public BoardVO(String title, String content, int writeId) {
		super();
		this.title = title;
		this.content = content;
		this.writeId = writeId;
	}
	//setter (값주입 메소드)
	//setter => 무조건 void 형 (입력만 시키기 때문)
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
		return content;
	}
	
	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}
	
	public int getWriteId(){
		return writeId;
	}
	
	
	
}
