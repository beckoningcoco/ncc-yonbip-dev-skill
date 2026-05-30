# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6833.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_restraint | pk_restraint | pk_restraint | char(20) | √ |
| 2 | expression | expression | expression | blob |
| 3 | group_id | group_id | group_id | varchar2(50) |
| 4 | pk_business | pk_business | pk_business | varchar2(20) |  |  | '~' |
| 5 | pk_rule | pk_rule | pk_rule | varchar2(20) |  |  | '~' |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |