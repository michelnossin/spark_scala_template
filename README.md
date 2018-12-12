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
