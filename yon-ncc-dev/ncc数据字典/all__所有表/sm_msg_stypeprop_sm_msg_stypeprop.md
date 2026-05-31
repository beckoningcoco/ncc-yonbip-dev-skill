# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11596.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stypeprop | pk_stypeprop | pk_stypeprop | char(20) | √ |
| 2 | propname | propname | propname | varchar2(50) |
| 3 | propvalue | propvalue | propvalue | varchar2(200) |
| 4 | stpbase | stpbase | stpbase | varchar2(20) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |