#!/bin/bash

git add .

#read input from user
echo "Enter you message: "
read message

git commit -"${message}"

git push --set-upstream origin main


