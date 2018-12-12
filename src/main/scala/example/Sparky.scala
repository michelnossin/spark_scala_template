package example

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame

object Sparky {
  def main(args: Array[String]): Unit = {
    startSparkJobAndGetDataFrame()
  }

  def startSparkJobAndGetDataFrame() : DataFrame = {
    val spark = SparkSession
      .builder()
      .appName("spark_test")
      .master("local[2]")
      .config("spark.ui.enabled", "false")
      .getOrCreate()

    // For implicit conversions like converting RDDs to DataFrames
    import spark.implicits._

    val values = List(List("1", "One") ,List("2", "Two") ,List("3", "Three"),List("4","4")).map(x =>(x(0), x(1)))
    val df = values.toDF
    df.show(2)
    return df

  }
}
