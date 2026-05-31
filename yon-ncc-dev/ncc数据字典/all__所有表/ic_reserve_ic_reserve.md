# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9125.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reserve | pk_reserve | pk_reserve | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | bsysflag | bsysflag | bsysflag | char(1) |
| 4 | casscustid | casscustid | casscustid | varchar2(20) |  |  | '~' |
| 5 | cbizid | cbizid | cbizid | varchar2(20) |  |  | '~' |
| 6 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |  |  | '~' |
| 7 | clocationid | clocationid | clocationid | varchar2(20) |  |  | '~' |
| 8 | cmaterialoid | cmaterialoid | cmaterialoid | varchar2(20) |  |  | '~' |
| 9 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 10 | cproductorid | cproductorid | cproductorid | varchar2(20) |  |  | '~' |
| 11 | cprojectid | cprojectid | cprojectid | varchar2(20) |  |  | '~' |
| 12 | creqbillbid | creqbillbid | creqbillbid | varchar2(20) |
| 13 | creqbillid | creqbillid | creqbillid | varchar2(20) |
| 14 | creqbillrowno | creqbillrowno | creqbillrowno | varchar2(40) |
| 15 | creqbilltype | creqbilltype | creqbilltype | varchar2(50) |
| 16 | creqtranstype | creqtranstype | creqtranstype | varchar2(20) |
| 17 | csourcebillbid | csourcebillbid | csourcebillbid | varchar2(20) |
| 18 | csourcebillid | csourcebillid | csourcebillid | varchar2(20) |
| 19 | csourcetype | csourcetype | csourcetype | varchar2(20) |
| 20 | ctplcustomerid | ctplcustomerid | ctplcustomerid | varchar2(20) |  |  | '~' |
| 21 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 22 | cvendorid | cvendorid | cvendorid | varchar2(20) |  |  | '~' |
| 23 | cwarehouseid | cwarehouseid | cwarehouseid | varchar2(20) |  |  | '~' |
| 24 | dreqdate | dreqdate | dreqdate | varchar2(19) |
| 25 | freservetype | freservetype | freservetype | number(38, 0) |
| 26 | fresstate | fresstate | fresstate | number(38, 0) |
| 27 | nreqnum | nreqnum | nreqnum | number(28, 8) |
| 28 | ntaloutnum | ntaloutnum | ntaloutnum | number(28, 8) |
| 29 | ntalrsinnum | ntalrsinnum | ntalrsinnum | number(28, 8) |
| 30 | ntalrsnum | ntalrsnum | ntalrsnum | number(28, 8) |
| 31 | ntalrsoutnum | ntalrsoutnum | ntalrsoutnum | number(28, 8) |
| 32 | pk_batchcode | pk_batchcode | pk_batchcode | varchar2(20) |  |  | '~' |
| 33 | pk_group | pk_group | pk_group | char(20) | √ |
| 34 | pk_org | pk_org | pk_org | char(20) | √ |
| 35 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 36 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |  |  | '~' |
| 37 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 38 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |  |  | '~' |
| 39 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 40 | vbatchcode | vbatchcode | vbatchcode | varchar2(40) |
| 41 | vhashcode | vhashcode | vhashcode | varchar2(100) |
| 42 | vreqbillcode | vreqbillcode | vreqbillcode | varchar2(40) |
| 43 | vrescode | vrescode | vrescode | varchar2(40) |
| 44 | vfree1 | vfree1 | vfree1 | varchar2(101) |
| 45 | vfree2 | vfree2 | vfree2 | varchar2(101) |
| 46 | vfree3 | vfree3 | vfree3 | varchar2(101) |
| 47 | vfree4 | vfree4 | vfree4 | varchar2(101) |
| 48 | vfree5 | vfree5 | vfree5 | varchar2(101) |
| 49 | vfree6 | vfree6 | vfree6 | varchar2(101) |
| 50 | vfree7 | vfree7 | vfree7 | varchar2(101) |
| 51 | vfree8 | vfree8 | vfree8 | varchar2(101) |
| 52 | vfree9 | vfree9 | vfree9 | varchar2(101) |
| 53 | vfree10 | vfree10 | vfree10 | varchar2(101) |
| 54 | creationtime | creationtime | creationtime | char(19) |
| 55 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 56 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 57 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 58 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 59 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |