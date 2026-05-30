# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7339.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_macro | pk_macro | pk_macro | varchar2(20) | √ |
| 2 | express | express | express | blob |
| 3 | macrocode | macrocode | macrocode | varchar2(30) |
| 4 | macroname | macroname | macroname | varchar2(30) |
| 5 | macrotype | macrotype | macrotype | number(38, 0) |
| 6 | note | note | note | varchar2(1024) |
| 7 | preset | preset | preset | char(1) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |