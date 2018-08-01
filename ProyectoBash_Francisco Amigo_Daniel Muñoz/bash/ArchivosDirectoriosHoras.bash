#!/bin/bash

echo "|°°°°°°°°°°°°°°°°°°°°archivos modificados de las ultimas 24 horas°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°"
find $HOME -mmin -1440 -type f
echo
echo "°°°°°°°°°°°°°°°°°Directorios modificados de las ultimas 24 horas°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°"
find $HOME -mmin -1440 -type d
echo

