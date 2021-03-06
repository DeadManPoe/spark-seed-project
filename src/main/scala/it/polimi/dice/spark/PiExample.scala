package it.polimi.dice.spark

import org.apache.spark.{SparkConf, SparkContext}

object PiExample {

  def main(args:Array[String]) : Unit = {
    val conf = new SparkConf(true).
      setAppName("Spark PiScala")
    val sc = new SparkContext(conf)
    val NUM_SAMPLES = 10000
    val count = sc.parallelize(1 to NUM_SAMPLES).map{i =>
      val x = Math.random()
      val y = Math.random()
      if (x*x + y*y < 1) 1 else 0
      }.reduce(_ + _)
      println("Pi is roughly " + 4.0 * count / NUM_SAMPLES)
  }
}
