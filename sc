#!/bin/bash

cd ~/apps/sc-im/src || exit 1

if [ $# -gt 0 ]; then
    file="$1"

    [[ "$file" != *.sc ]] && file="${file}.sc"

    if [ -f "$OLDPWD/$file" ]; then
        file="$OLDPWD/$file"
    fi

    ./sc-im "$file"
else
    ./sc-im
fi
