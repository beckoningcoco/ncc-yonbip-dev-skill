# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11840.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | imagecode | imagecode | imagecode | varchar2(254) |
| 3 | name | name | name | varchar2(150) |
| 4 | pk_org | pk_org | pk_org | varchar2(50) |
| 5 | searchcondition | searchcondition | searchcondition | clob |
| 6 | showorder | showorder | showorder | number(38, 0) |
| 7 | templatecode | templatecode | templatecode | varchar2(254) |
| 8 | type | type | type | number(38, 0) |  |  | 1 |
| 9 | url | url | url | varchar2(2048) |
| 10 | usercode | usercode | usercode | varchar2(50) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |