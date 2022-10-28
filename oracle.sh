docker run -d --name Oracle -p 1522:1521 -e ORACLE_PASSWORD=admin -v oracle-volume:/opt/oracle/oradata gvenzl/oracle-xe
