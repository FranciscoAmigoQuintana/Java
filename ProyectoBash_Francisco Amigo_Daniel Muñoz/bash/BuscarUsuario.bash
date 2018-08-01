#!/bin/bash

echo
cd /home/francisco
cat /etc/passwd | awk -F':' '{print $1}' | grep -i ^$1
echo


