# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6746.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assign_tab | pk_assign_tab | pk_assign_tab | char(20) | √ |
| 2 | classmdid | classmdid | classmdid | char(36) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | mdid | mdid | mdid | char(36) | √ |
| 5 | modulename | modulename | modulename | varchar2(50) |
| 6 | orgrefgetter | orgrefgetter | orgrefgetter | varchar2(100) | √ |
| 7 | orgservice | orgservice | orgservice | varchar2(100) | √ |
| 8 | resdir | resdir | resdir | varchar2(50) |
| 9 | resid | resid | resid | varchar2(50) |
| 10 | showindex | showindex | showindex | number(38, 0) |
| 11 | tabid | tabid | tabid | varchar2(36) |  |  | '~' |
| 12 | tabname | tabname | tabname | varchar2(50) |
| 13 | valueeditor | valueeditor | valueeditor | varchar2(100) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |