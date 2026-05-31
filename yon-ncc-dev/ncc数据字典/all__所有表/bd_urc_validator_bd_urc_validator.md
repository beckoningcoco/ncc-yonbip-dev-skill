# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7268.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_validator | pk_validator | pk_validator | varchar2(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | factoryclass | factoryclass | factoryclass | varchar2(300) |
| 4 | mdclassid | mdclassid | mdclassid | varchar2(36) |  |  | '~' |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |