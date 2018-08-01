#!/bin/bash

echo "procesos que ocupan mas memoria"
echo
ps aux | awk '{print $2,$4,$11}' | sort -k2r | head -n 4
echo
echo "procesos que ocupan mas cpu"
echo
ps aux | awk '{print $2,$3,$11}' | sort -k2r | head -n 4
echo
