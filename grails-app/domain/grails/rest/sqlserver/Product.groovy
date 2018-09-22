package grails.rest.sqlserver

import grails.databinding.BindingFormat

class Product {

  String sku
  String prodName
  String prodDesc
  Double prodCost
  Double prodPrice
  @BindingFormat('dd/MM/yy HH:mm')
  Date prodCreated = new Date()
  @BindingFormat('dd/MM/yy HH:mm')
  Date prodModified

  static constraints = {
    sku maxSize: 8
    prodName maxSize: 50
    prodDesc maxSize: 255
    prodModified nullable: true
  }
}
