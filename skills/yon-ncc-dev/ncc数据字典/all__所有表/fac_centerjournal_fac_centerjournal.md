# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8061.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_centerjournal | pk_centerjournal | pk_centerjournal | char(20) | √ |
| 2 | billdate | billdate | billdate | char(19) |
| 3 | bill_type | bill_type | bill_type | varchar2(50) |
| 4 | businessvariety | businessvariety | businessvariety | varchar2(20) |  |  | '~' |
| 5 | depositamount | depositamount | depositamount | number(28, 8) |
| 6 | depositcode | depositcode | depositcode | varchar2(20) |  |  | '~' |
| 7 | depositdate | depositdate | depositdate | char(19) |
| 8 | depositmode | depositmode | depositmode | varchar2(50) |
| 9 | deposittype | deposittype | deposittype | varchar2(50) |
| 10 | enddate | enddate | enddate | char(19) |
| 11 | glcdepositamount | glcdepositamount | glcdepositamount | number(28, 8) |
| 12 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 13 | glcrate | glcrate | glcrate | number(28, 8) |
| 14 | glcredepositmnt | glcredepositmnt | glcredepositmnt | number(28, 8) |
| 15 | glcwithdrawmnt | glcwithdrawmnt | glcwithdrawmnt | number(28, 8) |
| 16 | gllcdepositamount | gllcdepositamount | gllcdepositamount | number(28, 8) |
| 17 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 18 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 19 | gllcredepositmnt | gllcredepositmnt | gllcredepositmnt | number(28, 8) |
| 20 | gllcwithdrawmnt | gllcwithdrawmnt | gllcwithdrawmnt | number(28, 8) |
| 21 | interest | interest | interest | number(28, 8) |
| 22 | interestmode | interestmode | interestmode | varchar2(50) |
| 23 | mrate | mrate | mrate | number(28, 8) |
| 24 | olcdepositamount | olcdepositamount | olcdepositamount | number(28, 8) |
| 25 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 26 | olcrate | olcrate | olcrate | number(28, 8) |
| 27 | olcredepositmnt | olcredepositmnt | olcredepositmnt | number(28, 8) |
| 28 | olcwithdrawmnt | olcwithdrawmnt | olcwithdrawmnt | number(28, 8) |
| 29 | pk_billcode | pk_billcode | pk_billcode | varchar2(50) |
| 30 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 31 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 32 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 33 | pk_depositbank | pk_depositbank | pk_depositbank | varchar2(20) |  |  | '~' |
| 34 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 35 | pk_interestacc | pk_interestacc | pk_interestacc | varchar2(20) |  |  | '~' |
| 36 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 37 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 38 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 39 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 40 | pk_sourcebill | pk_sourcebill | pk_sourcebill | char(20) |
| 41 | rate | rate | rate | number(28, 8) |
| 42 | ratename | ratename | ratename | varchar2(50) |
| 43 | redepositamount | redepositamount | redepositamount | number(28, 8) |
| 44 | redepositmode | redepositmode | redepositmode | varchar2(50) |
| 45 | summary | summary | summary | varchar2(50) |
| 46 | withdrawamount | withdrawamount | withdrawamount | number(28, 8) |
| 47 | yrate | yrate | yrate | number(28, 8) |
| 48 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 49 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 50 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 51 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 52 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 53 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 54 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 55 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 56 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 57 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 58 | creationtime | creationtime | creationtime | char(19) |
| 59 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 60 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 61 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 62 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 63 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |