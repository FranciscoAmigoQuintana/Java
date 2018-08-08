#!/bin/bash

#entra en el directorio resultados
cd resultados

#crea archivos sin los "-" en las fechas
for i in $(cat lista.txt)
do
	cat $i | sed -e 's/-/;/g' > Listasinmenos$i
done

#crea archivos con año, mes, humedad y temperatura
for j in $(cat lista.txt)
do
	cat Listasinmenos$j | cut -f 1,2,7,8 -d ";"  > ListaValoresUtiles$j
done

#crea los directorios
a=2009

for x in `seq 1 6`
do
	suma=$(expr $x + $a)
	mkdir $suma
done


anio1=$(cat verdadero2Panguilemodetalle2010-2011.csv | awk -F ";" '{print $1}')
anio2=$(cat verdadero2Panguilemodetalle2011-2012.csv | awk -F ";" '{print $1}')
anio3=$(cat verdadero2Panguilemodetalle2012-2013.csv | awk -F ";" '{print $1}')
anio4=$(cat verdadero2Panguilemodetalle2013-2014.csv | awk -F ";" '{print $1}')
anio5=$(cat verdadero2Panguilemodetalle2014-2015a.csv | awk -F ";" '{print $1}')
anio6=$(cat verdadero2Panguilemodetalle2014-2015b.csv | awk -F ";" '{print $1}')


mes1=$(cat verdadero2Panguilemodetalle2010-2011.csv | awk -F ";" '{print $2}')
mes2=$(cat verdadero2Panguilemodetalle2011-2012.csv | awk -F ";" '{print $2}')
mes3=$(cat verdadero2Panguilemodetalle2012-2013.csv | awk -F ";" '{print $2}')
mes4=$(cat verdadero2Panguilemodetalle2013-2014.csv | awk -F ";" '{print $2}')
mes5=$(cat verdadero2Panguilemodetalle2014-2015a.csv | awk -F ";" '{print $2}')
mes6=$(cat verdadero2Panguilemodetalle2014-2015b.csv | awk -F ";" '{print $2}')

contador=0

#sacar el promedio de cada año, por meses
for i in $anio1
do
	if [ $i -eq 2010 ]
	then
		for j in $mes1
		do
			((contador++))
			if [ $j -eq 01 ]
			then
				echo $j
			fi
			
			if [ $j -eq 02 ]
			then
				echo $j
			fi
			
			if [ $j -eq 03 ]
			then
				echo $j
			fi
			
			if [ $j -eq 04 ]
			then
				echo $j
			fi
			
			if [ $j -eq 05 ]
			then
				echo $j
			fi
			
			if [ $j -eq 06 ]
			then
				echo $j
			fi
			
			if [ $j -eq 07 ]
			then
				echo $j
			fi
			
			if [ $j -eq 08 ]
			then
				echo $j
			fi
			
			if [ $j -eq 09 ]
			then
				echo $j
			fi
			
			if [ $j -eq 10 ]
			then
				echo $j
			fi
			
			if [ $j -eq 11 ]
			then
				echo $j
			fi
			
			if [ $j -eq 12 ]
			then
				echo $j
			fi
		done
	fi
done

echo $contador
