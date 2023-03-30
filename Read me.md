export PATH=$PATH:/opt/cdunix/ndm/bin
NDMAPICFG=/opt/cdunix/ndm/efg/cliapi/ndmapi.cfg 
export NDMAPICEG
FILE_NAME=S1
SOURCE_DIR=/GPNP/apps/paybill/ondemand-reports/
DESTINATION_DIR=/gindexer/
SOURCE_PATH=${SOURCE_DIR}/${FILE_NAME}
DEST_PATH=${DESTINATION_DIR}/${FILE_NAME}
DEST_NODE="A01SODCDI"
set -v
ndmcli_output=$(ndmcli -x << EOJ
submit gpnpid process snode ${DEST_NODE}
step1 copy from
(file=${SOURCE_PATH}
pnode
sysopts="datatype=binary:")
to
(file=${DEST_PATH}
sysopts="datatype=binary:")
pend
EOJ)

# Extract the process ID from the ndmcli output
process_id=$(echo "${ndmcli_output}" | awk '/Process ID/{print $NF}')

# Check the status of the process using the process ID
ndmastat_output=$(ndmastat -i ${process_id})

# Print the process status
echo "Process status: ${ndmastat_output}"
