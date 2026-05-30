# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10894.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billactionconfig | pk_billactionconfig | pk_billactionconfig | char(20) | √ |
| 2 | actiontype | actiontype | actiontype | varchar2(20) | √ |
| 3 | pk_billactiongroup | pk_billactiongroup | pk_billactiongroup | varchar2(20) |  |  | '~' |
| 4 | sysindex | sysindex | sysindex | number(38, 0) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |