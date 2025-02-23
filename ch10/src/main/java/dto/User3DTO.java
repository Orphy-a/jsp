package dto;

public class User3DTO {
	
	private String uid;
	private String name;
	private String hp;
	private String pos;
	private String rdate;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	@Override
	public String toString() {
		return "User3DTO [uid=" + uid + ", name=" + name + ", hp=" + hp + ", pos=" + pos + ", rdate=" + rdate + "]";
	}
	
	
	
}
