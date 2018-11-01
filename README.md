
Log
-----------
<u>Simulating a data source</u>

ncat utility is used to feed a sample log one line at a time over a given port. Spark Streaming connects to that

<code>

cd src\main\resources
ncat -kl 9999 < log\access_log.txt
</code>