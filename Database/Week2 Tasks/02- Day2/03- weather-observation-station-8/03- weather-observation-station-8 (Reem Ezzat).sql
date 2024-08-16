-- Author Reem Ezzat 

SELECT DISTINCT CITY FROM STATION WHERE
LOWER (CITY) LIKE '[aeiou]%[aeiou]'  ;