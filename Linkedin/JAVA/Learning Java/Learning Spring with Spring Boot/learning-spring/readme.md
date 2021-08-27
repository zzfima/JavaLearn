PostgreSQL 
1. Install
2. Environment Variables -> Path -> New -> C:\Program Files\PostgreSQL\13\bin
3. For checking in cmd put: psql --version
4. In application.properties:
   1. DB name: dev
   2. user name: postgres
   3. password: sa
5. According to 4, configure PostgreSQL:
   1. Open SQL shell
   2. CREATE DATABASE dev;
   3. \l [to get a list of all databases]
   4. \c dev [To connect to a Database use PostgreSQL]
   5. \dt [show tables]
6. Create tables:
   1. create schema and fill tables:
   2. psql -U postgres -d dev -h localhost -f schema.sql
   3. psql -U postgres -d dev -h localhost -f data.sql