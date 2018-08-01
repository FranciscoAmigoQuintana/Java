#!/bin/bash

echo "Directorios ordenados"
echo
find $HOME -type d -size +0 -ls | awk '{print $11}' | sort
echo


