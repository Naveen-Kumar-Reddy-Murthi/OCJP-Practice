#!/bin/bash

# set the source directory
source_dir="/path/to/source/directory"

# set the destination node name
destination_node="destination_node_name"

# loop through all files in the source directory
for file in "$source_dir"/*; do
  # check if the file is a regular file
  if [ -f "$file" ]; then
    # send the file to the destination node
    ndmsend -n "$destination_node" -s "$file" -d "${file##*/}"
    # check if the file was sent successfully
    if [ $? -eq 0 ]; then
      # delete the file
      rm "$file"
    fi
  fi
done
