# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8749.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_outside | pk_outside | pk_outside | char(20) | √ |
| 2 | approvenote | approvenote | approvenote | varchar2(600) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 5 | approvetime | approvetime | approvetime | char(19) |
| 6 | billno | billno | billno | varchar2(50) |
| 7 | billtype | billtype | billtype | varchar2(50) |
| 8 | dealreason | dealreason | dealreason | varchar2(100) |
| 9 | fileurllist | fileurllist | fileurllist | varchar2(2000) |
| 10 | lat | lat | lat | number(28, 8) |
| 11 | lng | lng | lng | number(28, 8) |
| 12 | outsideplace | outsideplace | outsideplace | varchar2(128) |
| 13 | outside_type | outside_type | outside_type | varchar2(50) |
| 14 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 18 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |  |  | '~' |
| 19 | remark | remark | remark | varchar2(600) |
| 20 | signdate | signdate | signdate | char(19) |
| 21 | sign_time | sign_time | sign_time | char(19) |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |