# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6802.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dateslot | pk_dateslot | pk_dateslot | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billno | billno | billno | varchar2(50) |
| 8 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 9 | billversionpk | billversionpk | billversionpk | varchar2(50) |
| 10 | busitype | busitype | busitype | varchar2(50) |
| 11 | code_dateslot | code_dateslot | code_dateslot | varchar2(30) |
| 12 | dateslotdes | dateslotdes | dateslotdes | varchar2(256) |
| 13 | dt_dateslottype | dt_dateslottype | dt_dateslottype | varchar2(50) |
| 14 | emendenum | emendenum | emendenum | number(38, 0) |
| 15 | flag_active | flag_active | flag_active | char(1) |
| 16 | flag_day | flag_day | flag_day | char(1) |
| 17 | flag_night | flag_night | flag_night | char(1) |
| 18 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 19 | maketime | maketime | maketime | char(19) |
| 20 | name_dateslot | name_dateslot | name_dateslot | varchar2(50) |
| 21 | pk_dateslottype | pk_dateslottype | pk_dateslottype | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | sortno | sortno | sortno | number(38, 0) |
| 26 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 27 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 28 | time_begin | time_begin | time_begin | char(8) |
| 29 | time_end | time_end | time_end | char(8) |
| 30 | transtype | transtype | transtype | varchar2(50) |
| 31 | transtypepk | transtypepk | transtypepk | varchar2(20) |  |  | '~' |
| 32 | def1 | def1 | def1 | varchar2(101) |
| 33 | def2 | def2 | def2 | varchar2(101) |
| 34 | def3 | def3 | def3 | varchar2(101) |
| 35 | def4 | def4 | def4 | varchar2(101) |
| 36 | def5 | def5 | def5 | varchar2(101) |
| 37 | def6 | def6 | def6 | varchar2(101) |
| 38 | def7 | def7 | def7 | varchar2(101) |
| 39 | def8 | def8 | def8 | varchar2(101) |
| 40 | def9 | def9 | def9 | varchar2(101) |
| 41 | def10 | def10 | def10 | varchar2(101) |
| 42 | def11 | def11 | def11 | varchar2(101) |
| 43 | def12 | def12 | def12 | varchar2(101) |
| 44 | def13 | def13 | def13 | varchar2(101) |
| 45 | def14 | def14 | def14 | varchar2(101) |
| 46 | def15 | def15 | def15 | varchar2(101) |
| 47 | def16 | def16 | def16 | varchar2(101) |
| 48 | def17 | def17 | def17 | varchar2(101) |
| 49 | def18 | def18 | def18 | varchar2(101) |
| 50 | def19 | def19 | def19 | varchar2(101) |
| 51 | def20 | def20 | def20 | varchar2(101) |
| 52 | creationtime | creationtime | creationtime | char(19) |
| 53 | creator | creator | creator | varchar2(20) |
| 54 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 55 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 56 | modifier | modifier | modifier | varchar2(20) |
| 57 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |