#!/bin/bash

nombredirectorio=$1
if test -d "$nombredirectorio"; then
	echo "ingrese un nombre para el fichero ya existente"
	read nombrenuevo
	rm $nombredirectorio
elif test ! -d "$nombredirectorio"; then
	mkdir $nombredirectorio
fi
 
