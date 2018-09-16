select ROUND(LONG_W,4)
from station
group by lat_n asc, long_w
having lat_n > 38.778
limit 1