package in.himtech.orm.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Chapter {

	private Integer number;
	private String name;
	private String content;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Chapter [number=" + number + ", name=" + name + ", content=" + content + "]";
	}

}
