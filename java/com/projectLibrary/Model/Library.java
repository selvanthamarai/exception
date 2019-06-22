package com.projectLibrary.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="book")
public class Library {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		public Long getId() {
		return id;
	}
	@Override
		public String toString() {
			return "Library [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + ", bookPrice="
					+ bookPrice + "]";
		}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
		private String bookName;
		private String authorName;
		private double bookPrice;
	}	
