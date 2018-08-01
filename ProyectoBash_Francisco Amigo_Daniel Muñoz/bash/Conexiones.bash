#!/bin/bash

clear

contadorconexiones=0
for archivo in $(last | awk '{print $5}')
do
    ((contadorconexiones ++))
done

echo "numero de conexiones"
echo $contadorconexiones
echo
echo "tiempo de conexiones"
echo

