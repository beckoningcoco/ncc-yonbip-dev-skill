# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11051.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_writebackfield | pk_writebackfield | pk_writebackfield | char(20) | √ |  | '~' |
| 2 | pk_writebacksetting | pk_writebacksetting | pk_writebacksetting | varchar2(20) |
| 3 | sourcefield | sourcefield | sourcefield | varchar2(512) |
| 4 | srcaccesstype | srcaccesstype | srcaccesstype | varchar2(50) |
| 5 | targetaccesstype | targetaccesstype | targetaccesstype | varchar2(50) |
| 6 | targetfield | targetfield | targetfield | varchar2(768) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |