#!/bin/bash

echo "Archivos que superan 1024 kBytes"
echo
find $HOME -type f -size +1024k -ls | awk '{print $2,"kBytes |   ",$11}' | sort -n -r
echo