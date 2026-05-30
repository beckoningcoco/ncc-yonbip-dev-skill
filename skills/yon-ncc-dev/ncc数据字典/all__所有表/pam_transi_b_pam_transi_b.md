# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10462.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transi_b | pk_transi_b | pk_transi_b | char(20) | √ |
| 2 | pk_group | pk_group | pk_group | varchar2(20) |
| 3 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 4 | pk_status_before | pk_status_before | pk_status_before | varchar2(20) |  |  | '~' |
| 5 | pk_transi | pk_transi | pk_transi | char(20) | √ |
| 6 | rule_code | rule_code | rule_code | varchar2(30) |
| 7 | rule_name | rule_name | rule_name | varchar2(80) |
| 8 | rule_value | rule_value | rule_value | varchar2(20) |  |  | '~' |
| 9 | def1 | def1 | def1 | varchar2(101) |
| 10 | def2 | def2 | def2 | varchar2(101) |
| 11 | def3 | def3 | def3 | varchar2(101) |
| 12 | def4 | def4 | def4 | varchar2(101) |
| 13 | def5 | def5 | def5 | varchar2(101) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |