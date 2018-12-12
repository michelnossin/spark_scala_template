#!/bin/sh

./bin/spark-submit \
    --class org.apache.spark.examples.SparkPi \
    --master local[2]
