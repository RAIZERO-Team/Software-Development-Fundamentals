-- Author :Abdalla Mohamed
select city, LENGTH(city) from STATION 
order by LENGTH(city) ASC ,city limit 1;

select city, LENGTH(city) from STATION 
order by LENGTH(city) DESC ,city limit 1;