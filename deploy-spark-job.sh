#!/bin/sh

/usr/spark-2.3.1/bin/spark-submit --class example.Sparky --master local[2] /tmp/Sparky-assembly-0.1.0-SNAPSHOT.jar
