package in.himtech.orm.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private Date publishDate;
	
	private String author;
	
	@ElementCollection
	@JoinTable(name="BOOK_CHAPTER", joinColumns=@JoinColumn(name="BOOK_CHAP_ID"))
	private Set<Chapter> chapters = new HashSet<>();

	public Set<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(Set<Chapter> chapters) {
		this.chapters = chapters;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", publishDate=" + publishDate + ", author=" + author
				+ ", chapters=" + chapters + "]";
	}
}
