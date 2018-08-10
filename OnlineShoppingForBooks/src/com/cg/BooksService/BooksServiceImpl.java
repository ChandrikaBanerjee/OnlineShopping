package com.cg.BooksService;

import java.util.Collection;
import java.util.Map;

import com.cg.cartObject.cartObject;
import com.cg.dao.BooksDaoImpl;
import com.cg.pojo.Books;

public class BooksServiceImpl{
	BooksDaoImpl booksdao=new BooksDaoImpl() ;
	

public Collection<Books> viewAllBooks() {
	return booksdao.viewAllBooks();
}


public void deleteBook(int bookID) {
	booksdao.deleteBook(bookID);;
	
}


public int getCollectionSize(Collection<Books> bookMap) {
	return	booksdao.getCollectionSize(bookMap);
}
public void addToCart(int i)
{
	booksdao.addToCart(i);
}
public Collection<cartObject> viewAllAddedBooks()
{
return	booksdao.viewAllAddedBooks();
}
public void removeFromCart(int i) {
	booksdao.removeFromCart(i);
}
public int getNumberOfCart()
{
	return booksdao.getNumberOfCart();
}
public double getTotalPrice()
{
	return booksdao.getTotalPrice();
	}
}