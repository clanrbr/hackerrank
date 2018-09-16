select ROUND(LAT_N,4)
from STATION
group by LAT_N asc, LONG_W
having LAT_N > 38.778
limit 1