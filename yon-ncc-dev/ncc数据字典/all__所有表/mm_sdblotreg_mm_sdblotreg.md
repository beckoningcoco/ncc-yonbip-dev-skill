# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9971.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lotreg | pk_lotreg | pk_lotreg | varchar2(60) | √ |
| 2 | batchcode | batchcode | batchcode | varchar2(40) |
| 3 | cdemandkey | cdemandkey | cdemandkey | varchar2(60) |
| 4 | cmaterialid | cmaterialid | cmaterialid | varchar2(50) |
| 5 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(50) |
| 6 | csupplykey | csupplykey | csupplykey | varchar2(60) |
| 7 | dcalcts | dcalcts | dcalcts | char(19) |
| 8 | dmatchdate | dmatchdate | dmatchdate | char(19) |
| 9 | icalcsort | icalcsort | icalcsort | number(38, 0) |
| 10 | ilogretsort | ilogretsort | ilogretsort | number(38, 0) |
| 11 | nlotregnum | nlotregnum | nlotregnum | number(28, 8) |
| 12 | nreservationnum | nreservationnum | nreservationnum | number(28, 8) |
| 13 | pk_batchcode | pk_batchcode | pk_batchcode | varchar2(20) |
| 14 | pk_group | pk_group | pk_group | varchar2(50) |
| 15 | pk_org | pk_org | pk_org | varchar2(50) |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(50) |
| 17 | tlotregtime | tlotregtime | tlotregtime | char(19) |
| 18 | vbacklog | vbacklog | vbacklog | varchar2(50) |
| 19 | vupdatelog | vupdatelog | vupdatelog | varchar2(50) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |