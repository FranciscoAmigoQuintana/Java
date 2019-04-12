#!/bin/bash

fecha1=`date +%d"/"%m"/"%G`
fecha2=`date +"hoy es el dia "%d" del mes "%m" del año "%G`
codigo=$1

if [[ $# != 1 ]]&&[[ $# != 0 ]]; then
	echo "solo se admite un parametro"
	exit 1
elif [[ $codigo == "-s" ]] || [[ $codigo == "--short" ]]; then
	echo $fecha1
elif [[ $codigo == "-l" ]] || [[ $codigo == "--long" ]]; then
	echo $fecha2
elif [ $# == 0 ]; then
	cal
else
	echo "Opción incorrecta, solo se acepta el parámetro −c o −l"
	exit 1
fi
