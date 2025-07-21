package my.rest.app

grails.rest.Resource(uri = '/books', formats = ['json', 'xml'])
class Book {
    String title
    String author

    static constraints = {
        title blank: false
        author blank: false
    }
}