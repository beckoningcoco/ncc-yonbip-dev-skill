# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8142.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | pk_log | pk_log | char(20) | √ |
| 2 | accyear | accyear | accyear | char(4) |
| 3 | bill_code | bill_code | bill_code | varchar2(30) |
| 4 | bill_status | bill_status | bill_status | number(38, 0) |
| 5 | bill_type | bill_type | bill_type | varchar2(10) |
| 6 | busi_date | busi_date | busi_date | char(19) |
| 7 | logid | logid | logid | number(38, 0) |
| 8 | log_type | log_type | log_type | number(38, 0) |
| 9 | period | period | period | char(2) |
| 10 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |
| 11 | pk_business | pk_business | pk_business | varchar2(20) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |
| 14 | redep_flag | redep_flag | redep_flag | char(1) |
| 15 | voucher_flag | voucher_flag | voucher_flag | char(1) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |