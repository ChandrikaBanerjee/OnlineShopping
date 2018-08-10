package com.cg.pojo;

public class Books {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	private int bookID;
	private String bookName;
	private double bookPrice;
	private String summary;
	/**
	 * @return the bookID
	 */
	public int getBookID() {
		return bookID;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @return the price
	 */
	public double getBookPrice() {
		return bookPrice;
	}
	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}
	public Books(int bookID, String bookName, double bookPrice, String summary) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.summary = summary;
	}
	@Override
	public String toString() {
		return "Books [bookID=" + bookID + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", summary=" + summary + "]";
	}


}
