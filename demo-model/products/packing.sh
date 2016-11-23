#!/bin/bash

set -eu

mkdir -p target
MOD_FOLDER="target/org.ecuadorjug.model.products"
JAR_NAME=products@1.0-SNAPSHOT.jar

echo "Creating module products as a jar"
jar --create --file target/$JAR_NAME \
	--module-version 1.0-SNAPSHOT -C $MOD_FOLDER/ .



tree $MOD_FOLDER

echo
echo "Printing module description for products"
jar --print-module-descriptor --file=target/$JAR_NAME


