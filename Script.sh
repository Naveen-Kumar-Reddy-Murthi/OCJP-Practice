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






