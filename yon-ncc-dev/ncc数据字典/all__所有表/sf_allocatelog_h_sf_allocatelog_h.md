# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11479.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocatelog_h | pk_allocatelog_h | pk_allocatelog_h | char(20) | √ |
| 2 | accbalance_p | accbalance_p | accbalance_p | number(28, 8) |
| 3 | allocatebillno | allocatebillno | allocatebillno | varchar2(50) |
| 4 | bankname_p | bankname_p | bankname_p | varchar2(20) |  |  | '~' |
| 5 | memo | memo | memo | varchar2(272) |
| 6 | pk_allocaterule_h | pk_allocaterule_h | pk_allocaterule_h | varchar2(50) |
| 7 | pk_allocate_h | pk_allocate_h | pk_allocate_h | varchar2(50) |
| 8 | pk_bankacc_p | pk_bankacc_p | pk_bankacc_p | varchar2(20) |  |  | '~' |
| 9 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | rulecode | rulecode | rulecode | varchar2(50) |
| 14 | rulename | rulename | rulename | varchar2(50) |
| 15 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 16 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 17 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 18 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 19 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |