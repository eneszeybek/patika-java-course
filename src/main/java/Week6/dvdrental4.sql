SELECT DISTINCT replacement_cost
FROM film
ORDER BY replacement_cost;
SELECT COUNT(DISTINCT replacement_cost) AS farkli_sayi
FROM film;
SELECT COUNT(*) AS toplam
FROM film
WHERE title LIKE 'T%'
  AND rating = 'G';
  SELECT COUNT(*) AS toplam
FROM country
WHERE LENGTH(country) = 5;
SELECT COUNT(*) AS toplam
FROM city
WHERE city ILIKE '%r';
