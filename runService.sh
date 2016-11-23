#!/bin/bash

set -eu

echo
echo "Running 'DemoClient'"
echo

MODS_DIR=mods
JAR_NAME=demo-client-1.0.jar;
echo
echo "Creating module org.ecuadorjug.client as a jar"
echo
jar --create --file demo-client/target/$JAR_NAME \
	--main-class=org.ecuadorjug.client.DemoClient -C demo-client/target/classes .

mkdir -p mods

cp demo-client/target/demo-client-1.0.jar  $MODS_DIR
cp demo-model/person/target/person-1.0-SNAPSHOT.jar  $MODS_DIR
cp demo-model/products/target/products-1.0-SNAPSHOT.jar  $MODS_DIR
cp demo-service/target/demo-service-1.0-SNAPSHOT.jar  $MODS_DIR
cp demo-service-impl/target/demo-service-impl-1.0-SNAPSHOT.jar  $MODS_DIR
cp demo-service-spi/target/demo-service-spi-1.0-SNAPSHOT.jar  $MODS_DIR


echo
java --module-path $MODS_DIR --module org.ecuadorjug.client

