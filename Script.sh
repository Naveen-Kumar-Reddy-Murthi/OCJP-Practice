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






#!/bin/bash

# set the source directory
source_dir="/path/to/source/directory"

# set the destination directory
destination_dir="/path/to/destination/directory"

# loop through all files in the source directory
for file in "$source_dir"/*; do
  # check if the file is a regular file
  if [ -f "$file" ]; then
    # move the file to the destination directory
    mv "$file" "$destination_dir"
  fi
done












# Set the S3 bucket name
BUCKET_NAME='my-bucket'

# Set the prefix for the files you want to download
FILE_PREFIX='prefix'

# Get the current date in the format YYYY-MM-DD
CURRENT_DATE=$(date +%Y-%m-%d)

# Get the credentials
# AWS_ACCESS_KEY_ID=<YOUR_ACCESS_KEY>
# AWS_SECRET_ACCESS_KEY=<YOUR_SECRET_KEY>

# Use the curl command to list all objects in the bucket with the specified prefix
for key in $(curl -s -H "Authorization: AWS ${AWS_ACCESS_KEY_ID}:${AWS_SECRET_ACCESS_KEY}" https://s3.amazonaws.com/$BUCKET_NAME?prefix=$FILE_PREFIX | grep -o '<Key>.*</Key>' | awk -F'[<>]' '{print $3}'); do
  # Use the curl command to download each file
  curl -s -H "Authorization: AWS ${AWS_ACCESS_KEY_ID}:${AWS_SECRET_ACCESS_KEY}" https://s3.amazonaws.com/$BUCKET_NAME/$key -o "$key"
done
import com.jcraft.jsch.*;

public class ExecuteCommand {
    public static void main(String[] args) {
        try {
            JSch jsch = new JSch();
            Session session = jsch.getSession("user", "host", 22);
            session.setPassword("password");
            session.setConfig("StrictHostKeyChecking", "no");
            session.connect();
            
            ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
            channelExec.setCommand("your command here");
            
            channelExec.connect();
            InputStream inputStream = channelExec.getInputStream();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            channelExec.disconnect();
            session.disconnect();
        } catch (JSchException | IOException e) {
            e.printStackTrace();
        }
    }
}


import com.jcraft.jsch.*;

public class ExecuteCommand {
    public static void main(String[] args) {
        try {
            JSch jsch = new JSch();
            Session session = jsch.getSession("user", "host", 22);
            session.setPassword("password");
            session.setConfig("StrictHostKeyChecking", "no");
            session.connect();
            
            ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
            channelExec.setCommand("./script.sh [parameter1] [parameter2] [parameter3]");
            
            InputStream stdout = channelExec.getInputStream();
            InputStream stderr = channelExec.getErrStream();
            
            channelExec.connect();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(stdout));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("stdout: " + line);
            }
            
            reader = new BufferedReader(new InputStreamReader(stderr));
            while ((line = reader.readLine()) != null) {
                System.err.println("stderr: " + line);
            }
            
            channelExec.disconnect();
            session.disconnect();
        } catch (JSchException | IOException e) {
            e.printStackTrace();
        }
    }
}


#!/bin/bash

# Set the path to the directory you want to search for files
directory="/path/to/directory"

# Check if the date parameter is provided
if [ -z "$1" ]; then
  echo "Please provide a date in the YYYY-MM-DD format."
  exit 1
fi

# Use find command to list all files modified or added on the specified date
files=$(find "$directory" -type f -newermt "$1" ! -newermt "$(date -d "$1 + 1 day" +%F)")

# Check if any files are found
if [ -z "$files" ]; then
  echo "No files found for the specified date."
  exit 0
fi

# Iterate over each file in the list
for file in $files; do
  # Print the full path of the file
  echo "Deleting $file"
  
  # Delete the file
  rm "$file"
done


#!/bin/bash

# Check if all three parameters are provided
if [ $# -lt 3 ]; then
  echo "Usage: $0 <date> <directory> <prefix>"
  exit 1
fi

# Set the path to the directory you want to search for files
directory="$2"

# Check if the directory exists
if [ ! -d "$directory" ]; then
  echo "Directory $directory not found."
  exit 1
fi

# Check if the date parameter is provided in the YYYY-MM-DD format
if ! date -d "$1" >/dev/null 2>&1; then
  echo "Please provide a date in the YYYY-MM-DD format."
  exit 1
fi

# Use find command to list all files modified or added on the specified date
files=$(find "$directory" -type f -newermt "$1" ! -newermt "$(date -d "$1 + 1 day" +%F)" -name "$3*")

# Check if any files are found
if [ -z "$files" ]; then
  echo "No files found for the specified date and prefix."
  exit 0
fi

# Iterate over each file in the list
for file in $files; do
  # Print the full path of the file
  echo "Deleting $file"

  # Delete the file
  rm "$file"
done

########


#!/bin/bash

# Define an array of directories and prefixes to check
dirs_and_prefixes=(
    "/path/to/dir1 prefix1"
    "/path/to/dir2 prefix2"
    "/path/to/dir3 prefix3"
)

# Set the number of days to go back
days_back=2

# Get the current date in the YYYY-MM-DD format
current_date=$(date +%F)

# Iterate over each directory and prefix in the array
for dir_and_prefix in "${dirs_and_prefixes[@]}"; do
    # Split the directory and prefix using a space as the delimiter
    IFS=" " read -r directory prefix <<< "$dir_and_prefix"

    # Check if the directory exists
    if [ ! -d "$directory" ]; then
        echo "Directory $directory not found."
        continue
    fi

    # Use find command to list all files modified or added on or before the specified date
    files=$(find "$directory" -type f -mtime +"$days_back" -name "$prefix*")

    # Check if any files are found
    if [ -z "$files" ]; then
        echo "No files found for $prefix in $directory that are $days_back or more days old."
        continue
    fi

    # Iterate over each file in the list
    for file in $files; do
        # Print the full path of the file
        echo "Deleting $file"

        # Delete the file
        rm "$file"
    done
done

