# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12348.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measureinfo | pk_measureinfo | pk_measureinfo | char(20) | √ |
| 2 | linenum | linenum | linenum | number(38, 0) |
| 3 | measurevos | measurevos | measurevos | char(20) | √ |
| 4 | name | name | name | varchar2(200) |
| 5 | pk_measure | pk_measure | pk_measure | varchar2(28) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |