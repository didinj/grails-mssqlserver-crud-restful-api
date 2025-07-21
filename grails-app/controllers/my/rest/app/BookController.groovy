package my.rest.app

import grails.rest.RestfulController

class BookController extends RestfulController<Book> {
    static responseFormats = ['json', 'xml']
    BookController() { super(Book) }
}