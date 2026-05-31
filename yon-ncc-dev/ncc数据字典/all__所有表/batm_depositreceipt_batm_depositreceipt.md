# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6623.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depositreceipt | pk_depositreceipt | pk_depositreceipt | char(20) | √ |
| 2 | billstate | billstate | billstate | varchar2(50) |
| 3 | depositamount | depositamount | depositamount | number(28, 8) |
| 4 | depositcode | depositcode | depositcode | varchar2(50) |
| 5 | depositdate | depositdate | depositdate | char(19) |
| 6 | depositinterval | depositinterval | depositinterval | number(38, 0) |
| 7 | deposittype | deposittype | deposittype | varchar2(50) |
| 8 | deposityrate | deposityrate | deposityrate | number(28, 8) |
| 9 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 10 | depostperiod | depostperiod | depostperiod | varchar2(50) |
| 11 | enddate | enddate | enddate | char(19) |
| 12 | glcdepositamount | glcdepositamount | glcdepositamount | number(28, 8) |
| 13 | gllcdepositamount | gllcdepositamount | gllcdepositamount | number(28, 8) |
| 14 | intervalunit | intervalunit | intervalunit | varchar2(50) |
| 15 | olcdepositamount | olcdepositamount | olcdepositamount | number(28, 8) |
| 16 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 17 | pk_daystype | pk_daystype | pk_daystype | number(38, 0) |
| 18 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 19 | pk_depositbank | pk_depositbank | pk_depositbank | varchar2(50) |
| 20 | pk_depositorg | pk_depositorg | pk_depositorg | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(50) |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(50) |
| 24 | def1 | def1 | def1 | varchar2(101) |
| 25 | def2 | def2 | def2 | varchar2(101) |
| 26 | def3 | def3 | def3 | varchar2(101) |
| 27 | def4 | def4 | def4 | varchar2(101) |
| 28 | def5 | def5 | def5 | varchar2(101) |
| 29 | def6 | def6 | def6 | varchar2(101) |
| 30 | def7 | def7 | def7 | varchar2(101) |
| 31 | def8 | def8 | def8 | varchar2(101) |
| 32 | def9 | def9 | def9 | varchar2(101) |
| 33 | def10 | def10 | def10 | varchar2(101) |
| 34 | def11 | def11 | def11 | varchar2(101) |
| 35 | def12 | def12 | def12 | varchar2(101) |
| 36 | def13 | def13 | def13 | varchar2(101) |
| 37 | def14 | def14 | def14 | varchar2(101) |
| 38 | def15 | def15 | def15 | varchar2(101) |
| 39 | def16 | def16 | def16 | varchar2(101) |
| 40 | def17 | def17 | def17 | varchar2(101) |
| 41 | def18 | def18 | def18 | varchar2(101) |
| 42 | def19 | def19 | def19 | varchar2(101) |
| 43 | def20 | def20 | def20 | varchar2(101) |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |