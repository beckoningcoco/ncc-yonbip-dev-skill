# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12403.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bllog | pk_bllog | pk_bllog | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | date_pay | date_pay | date_pay | char(19) |
| 4 | dt_paymode | dt_paymode | dt_paymode | varchar2(50) |
| 5 | eu_direct | eu_direct | eu_direct | number(38, 0) |
| 6 | inputstr | inputstr | inputstr | varchar2(500) |
| 7 | name_psn | name_psn | name_psn | varchar2(500) |
| 8 | outstr | outstr | outstr | varchar2(500) |
| 9 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 12 | pk_paymode | pk_paymode | pk_paymode | varchar2(20) |
| 13 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 14 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 15 | pk_st | pk_st | pk_st | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |