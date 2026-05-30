# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6616.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dailydeposit | pk_dailydeposit | pk_dailydeposit | char(20) | √ |
| 2 | balance | balance | balance | number(28, 8) |
| 3 | billdate | billdate | billdate | char(10) |
| 4 | depositperiod | depositperiod | depositperiod | varchar2(50) |
| 5 | deposittype | deposittype | deposittype | varchar2(50) |
| 6 | glcbalance | glcbalance | glcbalance | number(28, 8) |
| 7 | glcinmoney | glcinmoney | glcinmoney | number(28, 8) |
| 8 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 9 | glcoutmoney | glcoutmoney | glcoutmoney | number(28, 8) |
| 10 | gllcbalance | gllcbalance | gllcbalance | number(28, 8) |
| 11 | gllcinmoney | gllcinmoney | gllcinmoney | number(28, 8) |
| 12 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 13 | gllcoutmoney | gllcoutmoney | gllcoutmoney | number(28, 8) |
| 14 | inmoney | inmoney | inmoney | number(28, 8) |
| 15 | interest | interest | interest | number(28, 8) |
| 16 | lastbalance | lastbalance | lastbalance | number(28, 8) |
| 17 | olcbalance | olcbalance | olcbalance | number(28, 8) |
| 18 | olcinmoney | olcinmoney | olcinmoney | number(28, 8) |
| 19 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 20 | olcoutmoney | olcoutmoney | olcoutmoney | number(28, 8) |
| 21 | outmoney | outmoney | outmoney | number(28, 8) |
| 22 | pk_bankaccbas | pk_bankaccbas | pk_bankaccbas | varchar2(20) |  |  | '~' |
| 23 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 24 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 25 | pk_depositbank | pk_depositbank | pk_depositbank | varchar2(20) |  |  | '~' |
| 26 | pk_depositorg | pk_depositorg | pk_depositorg | varchar2(20) |  |  | '~' |
| 27 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 28 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 29 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 30 | rate | rate | rate | varchar2(50) |
| 31 | def1 | def1 | def1 | varchar2(101) |
| 32 | def2 | def2 | def2 | varchar2(101) |
| 33 | def3 | def3 | def3 | varchar2(101) |
| 34 | def4 | def4 | def4 | varchar2(101) |
| 35 | def5 | def5 | def5 | varchar2(101) |
| 36 | def6 | def6 | def6 | varchar2(101) |
| 37 | def7 | def7 | def7 | varchar2(101) |
| 38 | def8 | def8 | def8 | varchar2(101) |
| 39 | def9 | def9 | def9 | varchar2(101) |
| 40 | def10 | def10 | def10 | varchar2(101) |
| 41 | def11 | def11 | def11 | varchar2(101) |
| 42 | def12 | def12 | def12 | varchar2(101) |
| 43 | def13 | def13 | def13 | varchar2(101) |
| 44 | def14 | def14 | def14 | varchar2(101) |
| 45 | def15 | def15 | def15 | varchar2(101) |
| 46 | def16 | def16 | def16 | varchar2(101) |
| 47 | def17 | def17 | def17 | varchar2(101) |
| 48 | def18 | def18 | def18 | varchar2(101) |
| 49 | def19 | def19 | def19 | varchar2(101) |
| 50 | def20 | def20 | def20 | varchar2(101) |
| 51 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 52 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |