#!/bin/bash

echo
awk 'BEGIN {print "Usuario UID Shell\n-------"} $3 >= 500 {print $1, $3, $7 | "sort -r"}' FS=":" /etc/passwd
echo
