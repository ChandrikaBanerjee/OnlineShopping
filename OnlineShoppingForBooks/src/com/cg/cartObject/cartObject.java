package com.cg.cartObject;

import com.cg.pojo.Books;

public class cartObject {
	private Books bookcart;
	private int number;
	public cartObject(Books bookcart, int number) {
		super();
		this.bookcart = bookcart;
		this.number = number;
	}
	/**
	 * @return the bookcart
	 */
	public Books getBookcart() {
		return bookcart;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "cartObject [bookcart=" + bookcart + ", number=" + number + "]";
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param bookcart the bookcart to set
	 */
	public void setBookcart(Books bookcart) {
		this.bookcart = bookcart;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

}
