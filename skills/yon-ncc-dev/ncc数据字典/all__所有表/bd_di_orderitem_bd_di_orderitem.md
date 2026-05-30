# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6887.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orderitem | pk_orderitem | pk_orderitem | varchar2(50) | √ |
| 2 | atindex | atindex | atindex | number(38, 0) |
| 3 | code | code | code | varchar2(50) |
| 4 | itemorder | itemorder | itemorder | number(38, 0) |
| 5 | name | name | name | varchar2(50) |
| 6 | pk_scheme | pk_scheme | pk_scheme | varchar2(20) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |