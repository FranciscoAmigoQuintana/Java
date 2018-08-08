#!/bin/bash

#crea directorio
mkdir resultados

#copia la lista.txt
cp lista.txt resultados/

#entra en resultados
cd resultados

#descarga los archivos
for line in $(cat lista.txt)
do
	wget https://srvbioinf1.utalca.cl/~fduran/data/$line
done
