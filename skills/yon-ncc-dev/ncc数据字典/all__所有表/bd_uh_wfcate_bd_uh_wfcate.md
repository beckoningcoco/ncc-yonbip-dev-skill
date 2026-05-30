# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7257.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wfcate | pk_wfcate | pk_wfcate | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billno | billno | billno | varchar2(50) |
| 8 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 9 | billversionpk | billversionpk | billversionpk | varchar2(50) |
| 10 | busitype | busitype | busitype | varchar2(50) |
| 11 | code | code | code | varchar2(50) |
| 12 | emendenum | emendenum | emendenum | number(38, 0) |
| 13 | flag_sys | flag_sys | flag_sys | char(1) |
| 14 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 15 | maketime | maketime | maketime | char(19) |
| 16 | name | name | name | varchar2(50) |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 20 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 21 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 22 | transtype | transtype | transtype | varchar2(50) |
| 23 | transtypepk | transtypepk | transtypepk | varchar2(20) |  |  | '~' |
| 24 | creationtime | creationtime | creationtime | char(19) |
| 25 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |