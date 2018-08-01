#!/bin/bash

echo "Ficheros ordenados"
echo
find $HOME -type f -size +0 -ls | awk '{print $11}' | sort
echo





