package example

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame
import org.scalatest._
import com.github.mrpowers.spark.fast.tests.DataFrameComparer

//TODO Put in seperate file
trait SessionFixture {
  
  def sparkSession : SparkSession = {
    val session = SparkSession
      .builder()
      .appName("spark_test")
      .master("local[2]")
      .config("spark.ui.enabled", "false")
      .getOrCreate()
    session
  }
}


class SparkySpec extends FlatSpec with DataFrameComparer with SessionFixture {

  val spark = sparkSession

  "Our test dataframe" should "be the same dataframe as defined in our Spark job" in {
    import spark.implicits._

    val values = List(List("1", "One") ,List("2", "Two") ,List("3", "Three"),List("4","4")).map(x =>(x(0), x(1)))
    val expectedDF = values.toDF

    val actualDF = Sparky.startSparkJobAndGetDataFrame
    assertSmallDataFrameEquality(actualDF, expectedDF)
  }
}
