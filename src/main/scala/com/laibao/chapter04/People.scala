package com.laibao.chapter04

import scala.beans.BeanProperty

/**
  * @author laibao wang
  */
class People(@BeanProperty var firstName:String, @BeanProperty var lastName:String) {
    @BeanProperty var position:String = _

    def this(firstName:String,lastName:String,position:String) {
        this(firstName,lastName)
        this.position = position
    }

    override def toString: String = {
        "firstName:"+firstName+"lastName:"+lastName+"holds position"+position
    }

    def getPersonName():String = firstName+lastName
}
