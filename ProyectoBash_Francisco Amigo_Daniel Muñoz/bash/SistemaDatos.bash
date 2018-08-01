#!/bin/bash

clear

echo "informacion"
echo
echo "hola, $USER"
echo
echo "La fecha es `date +%D` y la hora es `date +%H:%M:%S`"
echo
echo "El sistema es `uname -s`"
echo
echo "Estado de la CPU total"
echo "`vmstat |awk '{sum += $12} {sum += $13} {sum += $14} {sum += $15} {sum += $16} {sum +=$17} END {print sum}'`"
echo
echo "Memoria del computador"
echo "`free -m`"
echo
echo "Estado de los discos"
echo "`df -h | awk '{print $3, "       " $4}'`"
echo
echo "visualizar usuario y tiempo actual de login"
who | awk '{print $1, "sistema iniciado desde las ",$4}'
echo
echo "cantidad de archivos en la home"
ls -1 /etc | wc -l
echo
echo "total"
df -hm | awk '{print $2}' | awk '{sum += $1} END {print sum, "mBytes"}'
echo



