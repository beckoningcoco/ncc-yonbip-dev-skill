# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9211.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_memberjournal | pk_memberjournal | pk_memberjournal | varchar2(50) | √ |
| 2 | billdate | billdate | billdate | char(19) |
| 3 | bill_type | bill_type | bill_type | varchar2(50) |
| 4 | businessvariety | businessvariety | businessvariety | varchar2(20) |  |  | '~' |
| 5 | depositamount | depositamount | depositamount | number(28, 8) |
| 6 | depositcode | depositcode | depositcode | varchar2(20) |  |  | '~' |
| 7 | deposittype | deposittype | deposittype | varchar2(50) |
| 8 | glcdepositamount | glcdepositamount | glcdepositamount | number(28, 8) |
| 9 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 10 | glcrate | glcrate | glcrate | number(28, 8) |
| 11 | glcredepositmnt | glcredepositmnt | glcredepositmnt | number(28, 8) |
| 12 | glcwithdrawmnt | glcwithdrawmnt | glcwithdrawmnt | number(28, 8) |
| 13 | gllcdepositamount | gllcdepositamount | gllcdepositamount | number(28, 8) |
| 14 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 15 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 16 | gllcredepositmnt | gllcredepositmnt | gllcredepositmnt | number(28, 8) |
| 17 | gllcwithdrawmnt | gllcwithdrawmnt | gllcwithdrawmnt | number(28, 8) |
| 18 | interest | interest | interest | number(28, 8) |
| 19 | olcdepositamount | olcdepositamount | olcdepositamount | number(28, 8) |
| 20 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 21 | olcrate | olcrate | olcrate | number(28, 8) |
| 22 | olcredepositmnt | olcredepositmnt | olcredepositmnt | number(28, 8) |
| 23 | olcwithdrawmnt | olcwithdrawmnt | olcwithdrawmnt | number(28, 8) |
| 24 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 25 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 26 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 27 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 28 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 29 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 30 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 31 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 32 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 33 | pk_sourcebill | pk_sourcebill | pk_sourcebill | varchar2(20) |
| 34 | redepositamount | redepositamount | redepositamount | number(28, 8) |
| 35 | redepositmode | redepositmode | redepositmode | varchar2(50) |
| 36 | summary | summary | summary | varchar2(50) |
| 37 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 38 | withdrawamount | withdrawamount | withdrawamount | number(28, 8) |
| 39 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 40 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 41 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 42 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 43 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 44 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 45 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 46 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 47 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 48 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 49 | creationtime | creationtime | creationtime | char(19) |
| 50 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 51 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 52 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 53 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 54 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |