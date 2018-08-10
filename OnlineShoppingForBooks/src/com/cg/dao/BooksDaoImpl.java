package com.cg.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.cartObject.cartObject;
import com.cg.pojo.Books;

public class BooksDaoImpl {
	private static Map<Integer, Books> bookMap = new HashMap<>();
	private static Map<Integer, cartObject> addtocart = new HashMap<>();
	private static Books book1 = new Books(1, "ABC", 50.00, "Tragedy");
	private static Books book2 = new Books(2, "DEF", 60.00, "Comic");
	private static Books book3 = new Books(3, "GHI", 70.00, "Detective");
	private static Books book4 = new Books(4, "JKL", 80.00, "Suspense");

	static {

		bookMap.put(1, book1);
		bookMap.put(2, book2);
		bookMap.put(3, book3);
		bookMap.put(4, book4);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.dao.BooksDAO#viewAllBooks()
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.dao.BooksDAO#viewAllBooks()
	 */

	public Collection<Books> viewAllBooks() {
		return bookMap.values();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.dao.BooksDAO#deleteBook(int)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.dao.BooksDAO#deleteBook(int)
	 */
	public void deleteBook(int bookID) {
		bookMap.remove(bookID);
	}

	public int getCollectionSize(Collection<Books> bookMap) {
		return bookMap.size();

	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.dao.BooksDAO#addToCart(com.cg.pojo.Books)
	 */

//		public void addToCart(Books books)
//		{
//			
//			addtocart.put(books.getBookID(),books);
//		}

	public void addToCart(int i) {
		if (addtocart.get(i) == null) {
			Books book = bookMap.get(i);

			cartObject cartObject = new cartObject(book, 1);
			addtocart.put(i, cartObject);
			System.out.println(addtocart.put(i, cartObject));
		} else {
			cartObject cartObject1 = addtocart.get(i);
			cartObject1.setNumber(cartObject1.getNumber() + 1);
			addtocart.put(i, cartObject1);

		}

	}

	public void removeFromCart(int i) {
		if (addtocart.get(i) != null) {
			cartObject cartObject1 = addtocart.get(i);

			if (cartObject1.getNumber() > 1) {
				cartObject1.setNumber(cartObject1.getNumber() - 1);

				addtocart.replace(i, cartObject1);
				

			} else {
				addtocart.remove(i);
				
			}
		}

	}

	public Collection<cartObject> viewAllAddedBooks() {
		return addtocart.values();
	}

	public int getNumberOfCart() {
		int sum = 0;
		for (cartObject cartObject : addtocart.values()) {

			sum += cartObject.getNumber();
		}
		System.out.println(sum);
		
		return sum;
		
	}
	public double getTotalPrice()
	{
		double totalPrice=0.0;
		for(cartObject cartObject: addtocart.values())
		{
			totalPrice+=(cartObject.getNumber())*(cartObject.getBookcart().getBookPrice());
		}
		return totalPrice;
	}

}
