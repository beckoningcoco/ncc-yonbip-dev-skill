# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6832.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_business | pk_business | pk_business | char(20) | √ |
| 2 | pk_entity | pk_entity | pk_entity | varchar2(36) |  |  | '~' |
| 3 | pk_rule | pk_rule | pk_rule | varchar2(20) |  |  | '~' |
| 4 | restorder | restorder | restorder | number(38, 0) |
| 5 | value_type | value_type | value_type | number(38, 0) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |