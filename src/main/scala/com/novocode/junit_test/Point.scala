package com.novocode.junit_test

case class Point(x: Int, y: Int) {
  def distance: Double = math.sqrt(x*x + y*y)
}
