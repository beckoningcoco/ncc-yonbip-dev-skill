# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10997.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_timeconfig | pk_timeconfig | pk_timeconfig | char(20) | √ |
| 2 | effibegindate | effibegindate | effibegindate | char(19) |
| 3 | effibegintime | effibegintime | effibegintime | char(8) |
| 4 | effienddate | effienddate | effienddate | char(19) |
| 5 | effiendtime | effiendtime | effiendtime | char(8) |
| 6 | endtime | endtime | endtime | char(8) |
| 7 | executeday | executeday | executeday | varchar2(80) |
| 8 | executeinterval | executeinterval | executeinterval | number(38, 0) |
| 9 | executetime | executetime | executetime | char(8) |
| 10 | exeintervalunit | exeintervalunit | exeintervalunit | number(38, 0) |
| 11 | frequencytype | frequencytype | frequencytype | number(38, 0) |
| 12 | intervaltime | intervaltime | intervaltime | number(38, 0) |
| 13 | isruncycledaily | isruncycledaily | isruncycledaily | char(1) |
| 14 | pk_reference | pk_reference | pk_reference | char(20) |  |  | '~' |
| 15 | starttime | starttime | starttime | char(8) |
| 16 | timezone | timezone | timezone | varchar2(16) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |