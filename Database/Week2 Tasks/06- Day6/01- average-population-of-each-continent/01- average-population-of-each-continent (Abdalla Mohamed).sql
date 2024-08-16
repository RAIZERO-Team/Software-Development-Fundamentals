select COUNTRY.Continent,floor(avg(CITY.POPULATION))
from  CITY 
join COUNTRY on CITY.CountryCode = COUNTRY.Code
GROUP BY COUNTRY.CONTINENT;
