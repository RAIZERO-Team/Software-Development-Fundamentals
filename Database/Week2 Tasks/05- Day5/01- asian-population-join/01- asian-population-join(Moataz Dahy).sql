-- Moataz Dahy --

select sum(CITY.Population)
from CITY
inner join COUNTRY on CITY.CountryCode = COUNTRY.Code
where COUNTRY.Continent = 'Asia';
