--moataz Dahy
select COUNTRY.Continent, floor(avg(CITY.Population)) as round
from CITY
inner join COUNTRY 
on CITY.CountryCode = COUNTRY.Code
group by COUNTRY.Continent ;