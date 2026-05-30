# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8115.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depgather | pk_depgather | pk_depgather | char(20) | √ |
| 2 | accyear | accyear | accyear | char(4) |
| 3 | bill_date | bill_date | bill_date | char(19) |
| 4 | bill_maker | bill_maker | bill_maker | varchar2(20) |
| 5 | gather_type | gather_type | gather_type | number(38, 0) |  |  | 0 |
| 6 | period | period | period | char(2) |
| 7 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |
| 8 | pk_currency | pk_currency | pk_currency | varchar2(20) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 12 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 13 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 14 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 15 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |