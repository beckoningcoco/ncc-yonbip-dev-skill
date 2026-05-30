# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13035.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billdefine | pk_billdefine | pk_billdefine | varchar2(20) | √ |
| 2 | aamlevel | aamlevel | aamlevel | varchar2(50) |
| 3 | billdefinedata | billdefinedata | billdefinedata | blob |
| 4 | billtype | billtype | billtype | varchar2(50) |
| 5 | exsystemcode | exsystemcode | exsystemcode | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |