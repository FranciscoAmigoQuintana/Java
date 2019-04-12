#!/bin/bash
 
directorio=$1
if test ! -d "$directorio"; then
	echo "ingrese un nombre de directorio"
	exit 1
else
	ls -lSr | awk -F " " '{print $9}' | nl
fi
 
 
 
 
 
 
 
