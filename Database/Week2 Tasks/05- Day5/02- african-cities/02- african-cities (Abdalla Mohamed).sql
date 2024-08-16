-- Author : Abdalla Mohamed
select  city.name 
from city 
join COUNTRY on CITY.CountryCode = COUNTRY.Code
WHERE COUNTRY.continent = 'Africa';