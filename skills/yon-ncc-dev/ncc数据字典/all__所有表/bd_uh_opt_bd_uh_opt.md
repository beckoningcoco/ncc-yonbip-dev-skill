# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7176.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_opt | pk_opt | pk_opt | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billno | billno | billno | varchar2(50) |
| 8 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 9 | billversionpk | billversionpk | billversionpk | varchar2(50) |
| 10 | busitype | busitype | busitype | varchar2(50) |
| 11 | code | code | code | varchar2(30) |
| 12 | code_fa | code_fa | code_fa | varchar2(30) |
| 13 | dt_opttype | dt_opttype | dt_opttype | varchar2(50) |
| 14 | emendenum | emendenum | emendenum | number(38, 0) |
| 15 | flag_ocupy | flag_ocupy | flag_ocupy | char(1) |
| 16 | flag_stop | flag_stop | flag_stop | char(1) |
| 17 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 18 | maketime | maketime | maketime | char(19) |
| 19 | mnecode | mnecode | mnecode | varchar2(30) |
| 20 | name | name | name | varchar2(50) |
| 21 | name_place | name_place | name_place | varchar2(50) |
| 22 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_opttype | pk_opttype | pk_opttype | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 27 | pk_pati | pk_pati | pk_pati | varchar2(50) |
| 28 | pk_place | pk_place | pk_place | varchar2(20) |  |  | '~' |
| 29 | rowno | rowno | rowno | varchar2(50) |
| 30 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 31 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 32 | transtype | transtype | transtype | varchar2(50) |
| 33 | transtypepk | transtypepk | transtypepk | varchar2(20) |  |  | '~' |
| 34 | creationtime | creationtime | creationtime | char(19) |
| 35 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 36 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 37 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 38 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 39 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |