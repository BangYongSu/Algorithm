SELECT count(*)
from USER_INFO
where joined between to_date('2021/01/01', 'yyyy/mm/dd') and to_date('2021.12.31', 'yyyy/mm/dd') 
and age between 20 and 29