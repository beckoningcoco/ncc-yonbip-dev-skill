# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7188.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pd_pf | pk_pd_pf | pk_pd_pf | char(20) | √ |
| 2 | approvenote | approvenote | approvenote | varchar2(50) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approvetime | approvetime | approvetime | char(19) |
| 5 | billno | billno | billno | varchar2(50) |
| 6 | billstatus | billstatus | billstatus | number(38, 0) |
| 7 | code | code | code | varchar2(50) |
| 8 | dataoriginflag | dataoriginflag | dataoriginflag | varchar2(50) |
| 9 | memo | memo | memo | varchar2(50) |
| 10 | name | name | name | varchar2(50) |
| 11 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | pk_pd | pk_pd | pk_pd | varchar2(50) |
| 16 | pk_targetorg | pk_targetorg | pk_targetorg | varchar2(20) |  |  | '~' |
| 17 | proposer | proposer | proposer | varchar2(20) |  |  | '~' |
| 18 | proposetime | proposetime | proposetime | char(19) |
| 19 | targetorg | targetorg | targetorg | varchar2(20) |  |  | '~' |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |