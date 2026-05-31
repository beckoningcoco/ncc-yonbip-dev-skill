# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7418.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportback | pk_reportback | pk_reportback | char(20) | √ |
| 2 | accassidname | accassidname | accassidname | varchar2(2000) |
| 3 | accbookmount | accbookmount | accbookmount | number(28, 8) |
| 4 | accdirect | accdirect | accdirect | number(38, 0) |
| 5 | accglobmount | accglobmount | accglobmount | number(28, 8) |
| 6 | accgroupmount | accgroupmount | accgroupmount | number(28, 8) |
| 7 | accoriamount | accoriamount | accoriamount | number(28, 8) |
| 8 | alloctype | alloctype | alloctype | varchar2(50) |
| 9 | driveritem | driveritem | driveritem | varchar2(50) |
| 10 | driverrate | driverrate | driverrate | varchar2(50) |
| 11 | execdate | execdate | execdate | char(19) |
| 12 | note | note | note | varchar2(400) |
| 13 | period | period | period | varchar2(50) |
| 14 | pk_accassid | pk_accassid | pk_accassid | varchar2(50) |
| 15 | pk_accbook | pk_accbook | pk_accbook | varchar2(50) |
| 16 | pk_acccurr | pk_acccurr | pk_acccurr | varchar2(50) |
| 17 | pk_accentity | pk_accentity | pk_accentity | varchar2(50) |
| 18 | pk_accorg | pk_accorg | pk_accorg | varchar2(50) |
| 19 | pk_accperiod | pk_accperiod | pk_accperiod | varchar2(50) |
| 20 | pk_accruleorg | pk_accruleorg | pk_accruleorg | varchar2(50) |
| 21 | pk_accsetofbook | pk_accsetofbook | pk_accsetofbook | varchar2(50) |
| 22 | pk_accvoucher | pk_accvoucher | pk_accvoucher | varchar2(50) |
| 23 | pk_allocruleset | pk_allocruleset | pk_allocruleset | varchar2(50) |
| 24 | pk_driver | pk_driver | pk_driver | varchar2(50) |
| 25 | pk_rowno | pk_rowno | pk_rowno | varchar2(50) |
| 26 | pk_rulegroup | pk_rulegroup | pk_rulegroup | varchar2(50) |
| 27 | pk_rulesection | pk_rulesection | pk_rulesection | varchar2(50) |
| 28 | pk_sendaccbook | pk_sendaccbook | pk_sendaccbook | varchar2(50) |
| 29 | pk_sendassid | pk_sendassid | pk_sendassid | varchar2(50) |
| 30 | pk_sendcurr | pk_sendcurr | pk_sendcurr | varchar2(50) |
| 31 | pk_sendentity | pk_sendentity | pk_sendentity | varchar2(50) |
| 32 | pk_sendorg | pk_sendorg | pk_sendorg | varchar2(50) |
| 33 | pk_sendruleorg | pk_sendruleorg | pk_sendruleorg | varchar2(50) |
| 34 | pk_sendsetofbook | pk_sendsetofbook | pk_sendsetofbook | varchar2(50) |
| 35 | pk_sendvoucher | pk_sendvoucher | pk_sendvoucher | varchar2(50) |
| 36 | sendassidname | sendassidname | sendassidname | varchar2(2000) |
| 37 | sendbookmount | sendbookmount | sendbookmount | number(28, 8) |
| 38 | senddirect | senddirect | senddirect | number(38, 0) |
| 39 | sendglobmount | sendglobmount | sendglobmount | number(28, 8) |
| 40 | sendgroupmount | sendgroupmount | sendgroupmount | number(28, 8) |
| 41 | sendoriamount | sendoriamount | sendoriamount | number(28, 8) |
| 42 | type | type | type | number(38, 0) |
| 43 | year | year | year | varchar2(50) |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |