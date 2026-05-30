# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6621.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deposit | pk_deposit | pk_deposit | char(20) | √ |
| 2 | billdate | billdate | billdate | char(19) |
| 3 | depositamount | depositamount | depositamount | number(28, 8) |
| 4 | depositcode | depositcode | depositcode | varchar2(50) |
| 5 | depositdate | depositdate | depositdate | char(19) |
| 6 | depositmode | depositmode | depositmode | varchar2(50) |
| 7 | deposittype | deposittype | deposittype | varchar2(50) |
| 8 | deposityrate | deposityrate | deposityrate | varchar2(50) |
| 9 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 10 | enddate | enddate | enddate | char(19) |
| 11 | glcdepositamount | glcdepositamount | glcdepositamount | number(28, 8) |
| 12 | glcdepostbalmnt | glcdepostbalmnt | glcdepostbalmnt | number(28, 8) |
| 13 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 14 | glcwithdrawamount | glcwithdrawamount | glcwithdrawamount | number(28, 8) |
| 15 | gllcdepositamount | gllcdepositamount | gllcdepositamount | number(28, 8) |
| 16 | gllcdepostbalmnt | gllcdepostbalmnt | gllcdepostbalmnt | number(28, 8) |
| 17 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 18 | gllcwithdrawamount | gllcwithdrawamount | gllcwithdrawamount | number(28, 8) |
| 19 | interest | interest | interest | number(28, 8) |
| 20 | intervalunit | intervalunit | intervalunit | varchar2(50) |
| 21 | olcdepositamount | olcdepositamount | olcdepositamount | number(28, 8) |
| 22 | olcdepostbalmnt | olcdepostbalmnt | olcdepostbalmnt | number(28, 8) |
| 23 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 24 | olcwithdrawamount | olcwithdrawamount | olcwithdrawamount | number(28, 8) |
| 25 | pk_bank | pk_bank | pk_bank | varchar2(50) |
| 26 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 27 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(50) |
| 28 | pk_depositorg | pk_depositorg | pk_depositorg | varchar2(20) |  |  | '~' |
| 29 | pk_depostrate | pk_depostrate | pk_depostrate | varchar2(50) |
| 30 | pk_group | pk_group | pk_group | varchar2(50) |
| 31 | pk_org | pk_org | pk_org | varchar2(50) |
| 32 | pk_org_v | pk_org_v | pk_org_v | varchar2(50) |
| 33 | pk_sourcebill | pk_sourcebill | pk_sourcebill | varchar2(50) |
| 34 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 35 | withdrawamount | withdrawamount | withdrawamount | number(28, 8) |
| 36 | def1 | def1 | def1 | varchar2(101) |
| 37 | def2 | def2 | def2 | varchar2(101) |
| 38 | def3 | def3 | def3 | varchar2(101) |
| 39 | def4 | def4 | def4 | varchar2(101) |
| 40 | def5 | def5 | def5 | varchar2(101) |
| 41 | def6 | def6 | def6 | varchar2(101) |
| 42 | def7 | def7 | def7 | varchar2(101) |
| 43 | def8 | def8 | def8 | varchar2(101) |
| 44 | def9 | def9 | def9 | varchar2(101) |
| 45 | def10 | def10 | def10 | varchar2(101) |
| 46 | def11 | def11 | def11 | varchar2(101) |
| 47 | def12 | def12 | def12 | varchar2(101) |
| 48 | def13 | def13 | def13 | varchar2(101) |
| 49 | def14 | def14 | def14 | varchar2(101) |
| 50 | def15 | def15 | def15 | varchar2(101) |
| 51 | def16 | def16 | def16 | varchar2(101) |
| 52 | def17 | def17 | def17 | varchar2(101) |
| 53 | def18 | def18 | def18 | varchar2(101) |
| 54 | def19 | def19 | def19 | varchar2(101) |
| 55 | def20 | def20 | def20 | varchar2(101) |
| 56 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 57 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |