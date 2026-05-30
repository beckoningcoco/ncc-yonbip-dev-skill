# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7267.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ruleitem | pk_ruleitem | pk_ruleitem | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | mdcolumnid | mdcolumnid | mdcolumnid | varchar2(36) | √ |  | '~' |
| 4 | mdcolumnname | mdcolumnname | mdcolumnname | varchar2(50) |
| 5 | pk_rule | pk_rule | pk_rule | char(20) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |