-- Author : Abdalla Mohamed
select sum(city.population) 
from city 
join COUNTRY on CITY.CountryCode = COUNTRY.Code
WHERE COUNTRY.continent = 'Asia';