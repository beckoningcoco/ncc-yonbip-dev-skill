# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8859.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mid_hosp_settle | pk_mid_hosp_settle | pk_mid_hosp_settle | char(20) | √ |
| 2 | block | block | block | char(19) |  |  | 'N' |
| 3 | bread | bread | bread | char(19) |  |  | 'N' |
| 4 | dbusdate | dbusdate | dbusdate | char(10) |
| 5 | iread_time | iread_time | iread_time | number(38, 0) |  |  | 0 |
| 6 | nmny | nmny | nmny | number(20, 8) |
| 7 | syscode | syscode | syscode | varchar2(30) |
| 8 | vchargetypecode | vchargetypecode | vchargetypecode | varchar2(30) |
| 9 | vchargetypename | vchargetypename | vchargetypename | varchar2(50) |
| 10 | vcust | vcust | vcust | varchar2(50) |
| 11 | vincomeclass | vincomeclass | vincomeclass | varchar2(30) |
| 12 | vincometyoe | vincometyoe | vincometyoe | varchar2(30) |
| 13 | vnote | vnote | vnote | varchar2(500) |
| 14 | vpayorgtype | vpayorgtype | vpayorgtype | varchar2(50) |
| 15 | vpaywaycode | vpaywaycode | vpaywaycode | varchar2(30) |
| 16 | vpaywayname | vpaywayname | vpaywayname | varchar2(50) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |