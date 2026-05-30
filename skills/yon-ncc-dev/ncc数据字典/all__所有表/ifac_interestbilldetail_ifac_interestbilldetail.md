# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9207.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | pk_detail | pk_detail | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | begindate | begindate | begindate | char(19) |
| 4 | billdetail | billdetail | billdetail | char(20) | √ |
| 5 | enddate | enddate | enddate | char(19) |
| 6 | glcamount | glcamount | glcamount | number(28, 8) |
| 7 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 8 | glcrate | glcrate | glcrate | number(15, 8) |
| 9 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 10 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 11 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 12 | interest | interest | interest | number(28, 8) |
| 13 | interestinterval | interestinterval | interestinterval | number(38, 0) |
| 14 | interestmode | interestmode | interestmode | varchar2(50) |
| 15 | mrate | mrate | mrate | number(15, 8) |
| 16 | olcamount | olcamount | olcamount | number(28, 8) |
| 17 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 18 | olcrate | olcrate | olcrate | number(15, 8) |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | pk_ratecode | pk_ratecode | pk_ratecode | varchar2(20) |  |  | '~' |
| 23 | rate | rate | rate | number(15, 8) |
| 24 | summary | summary | summary | number(38, 0) |
| 25 | yrate | yrate | yrate | number(15, 8) |
| 26 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 27 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 28 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 29 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 30 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 31 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 32 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 33 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 34 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 35 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 36 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 37 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |