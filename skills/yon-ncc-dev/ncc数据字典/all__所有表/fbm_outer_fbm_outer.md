# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8206.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_outer | pk_outer | pk_outer | char(20) | √ |
| 2 | outerbilltype | outerbilltype | outerbilltype | varchar2(30) |
| 3 | outerdjdl | outerdjdl | outerdjdl | varchar2(30) |
| 4 | outerstatus | outerstatus | outerstatus | varchar2(50) |
| 5 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |  |  | '~' |
| 6 | pk_busibill | pk_busibill | pk_busibill | char(20) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 10 | pk_outerbill_b | pk_outerbill_b | pk_outerbill_b | char(20) |
| 11 | pk_outerbill_h | pk_outerbill_h | pk_outerbill_h | char(20) |
| 12 | pk_register | pk_register | pk_register | char(20) |
| 13 | pk_settle_b | pk_settle_b | pk_settle_b | varchar2(20) |
| 14 | pk_settle_h | pk_settle_h | pk_settle_h | varchar2(20) |
| 15 | pk_supplier | pk_supplier | pk_supplier | varchar2(50) |
| 16 | usesystem | usesystem | usesystem | varchar2(50) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |