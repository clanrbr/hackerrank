SELECT DISTINCT CITY FROM STATION WHERE SUBSTRING(CITY,length(CITY),1) NOT IN ('A','E','I','O','U') AND SUBSTRING(CITY,1,1) NOT IN ('A','E','I','O','U')