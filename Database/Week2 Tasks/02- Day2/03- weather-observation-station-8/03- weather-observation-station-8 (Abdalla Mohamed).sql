-- Author :Abdalla Mohamed
select Distinct CITY
from STATION
where (CITY like 'A%'  or  CITY like 'E%' or CITY like 'I%'or CITY like'O%'or CITY like 'U%')
AND
(CITY like '%a'  or  CITY like '%e' or CITY like '%i'or CITY like'%o' or CITY like '%u');