# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11632.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule | pk_rule | pk_rule | char(20) | √ |
| 2 | ruleclass | ruleclass | ruleclass | varchar2(200) |  |  | '~' |
| 3 | rulecode | rulecode | rulecode | varchar2(20) |
| 4 | rulename | rulename | rulename | varchar2(200) |  |  | '~' |
| 5 | type | type | type | varchar2(20) |  |  | '~' |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |