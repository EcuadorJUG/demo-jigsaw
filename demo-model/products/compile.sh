#!/bin/bash

set -eu

MOD_FOLDER="target/org.ecuadorjug.model.products"

echo "Creating folder $MOD_FOLDER, if it does not exists."
mkdir -p $MOD_FOLDER

echo "Compiling modules in $MOD_FOLDER"
javac --module-path target -d $MOD_FOLDER \
        src/main/java/module-info.java src/main/java/org/ecuadorjug/model/products/Account.java src/main/java/org/ecuadorjug/model/products/CreditCard.java src/main/java/org/ecuadorjug/model/products/Loan.java

tree -fl $MOD_FOLDER