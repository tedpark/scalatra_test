package com.example.app

import org.scalatra._
import scalate.ScalateSupport

import org.scalatra.json._

import org.json4s._
import org.json4s.JsonDSL._


class MyScalatraServlet extends SclatraStack with JacksonJsonSupport {

  implicit val jsonFormats = DefaultFormats

  get("/") {
    val productJson =


      ("label" -> "Foo bar") ~
      ("fairTrade" -> true) ~
      ("tags" -> List("bio", "chocolate"))

    productJson


  }

}
