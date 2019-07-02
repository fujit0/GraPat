#!/bin/bash

docker run --rm -t -u 1000 -v $PWD:/home/app -w /home/app maven:3-jdk-8 mvn clean install
