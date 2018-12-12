# To create a simple Scala app

Using sbt 1.0 including the ensime plugin (only for SpaceMac users)
If you change build.sbt and use SpaceMacs (Ensime) execute sbt ensimeConfig .
```
sbt new sbt/scala-seed.g8

cd <your app>
<change your build.sbt and your application structure>

sbt ensimeConfig

sbt run
or
runMain example.Hello
```
# To create a simple Scala Spark app (without spark submit)

```
Just run the Spark.scala within Sbt.
runMain example.Sparky

If you want to create a spark submit job don't forget to add "provided" in the spark dependencies in build.sbt
```

# How to use Spark on Docker

```
Download some Spark image:
docker run --rm -it -p 4040:4040 gettyimages/spark /bin/bash

Within the container test Spark (this is Spark 2.3.1) with:
cd /usr/spark-2.3.1/bin 
./bin/run-example SparkPi 10
./spark-submit --class org.apache.spark.examples.SparkPi --master local[2] ../examples/jars/spark-examples_2.11-2.3.1.jar

Change build.sbt:
Added "provided" for all Spark dependencies

Create jar file (add the assembly plugin to sbt):
Sbt assembly

Check out:
target/scala-2.12/Sparky-assembly-0.1.0-SNAPSHOT.jar

Let's create a Dockerfile that uses this image, mounts our Scala project and runs the job
<checkout dockerfile_sparky>

Build the image:
docker build  -t sparky  -f /home/michel/git/spark_scala_template/dockerfile_sparky /home/michel/git/spark_scala_template/
<or just use SpaceMacs Docker mode>


```
