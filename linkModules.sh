#!/bin/bash

set -eu

MODS_DIR=mods
MOD_NAME=demo-jigsaw.jmod

mkdir -p $MODS_DIR

echo "Removing any existing demo-jigsaw.jmod"
rm -f $MODS_DIR/$MOD_NAME

echo
echo "Creating a module ($MOD_NAME) from multiple modules / packages / classes with jlink."
jmod create --class-path demo-client/target/classes:demo-model/person/target/classes:demo-model/products/target/classes:demo-service/target/classes:demo-service-impl/target/classes:demo-service-spi/target/classes $MODS_DIR/$MOD_NAME

echo
echo "Enlisting the contents of the module ($MOD_NAME)."
jmod list $MODS_DIR/$MOD_NAME
