package org.knoldus

import org.apache.log4j.Logger

object Calculator extends App {
  val log = Logger.getLogger(this.getClass)
  val NUMBER1 = 12
  val NUMBER2 = 5
  val operations = new MathOperations
  log.info(s"Addition : ${operations.add(NUMBER1,NUMBER2)}")
  log.info(s"Subtraction : ${operations.sub(NUMBER1,NUMBER2)}")
  log.info(s"Multiplication : ${operations.mul(NUMBER1,NUMBER2)}")
}
