# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6804.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dateslottime | pk_dateslottime | pk_dateslottime | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | name | name | name | varchar2(50) |
| 4 | pk_dateslot | pk_dateslot | pk_dateslot | char(20) | √ |
| 5 | pk_group | pk_group | pk_group | varchar2(50) |
| 6 | pk_org | pk_org | pk_org | varchar2(50) |
| 7 | rowno | rowno | rowno | varchar2(50) |
| 8 | time_begin | time_begin | time_begin | char(8) |
| 9 | time_end | time_end | time_end | char(8) |
| 10 | valid_day_begin | valid_day_begin | valid_day_begin | number(38, 0) |
| 11 | valid_day_end | valid_day_end | valid_day_end | number(38, 0) |
| 12 | valid_month_begin | valid_month_begin | valid_month_begin | number(38, 0) |
| 13 | valid_month_end | valid_month_end | valid_month_end | number(38, 0) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |