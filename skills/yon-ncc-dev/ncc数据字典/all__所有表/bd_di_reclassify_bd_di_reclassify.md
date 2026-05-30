# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6888.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reclassify | pk_reclassify | pk_reclassify | char(20) | √ |
| 2 | destprop | destprop | destprop | varchar2(50) |
| 3 | destrepitem | destrepitem | destrepitem | varchar2(50) |
| 4 | measure | measure | measure | varchar2(50) |
| 5 | pk_scheme | pk_scheme | pk_scheme | varchar2(50) |
| 6 | srcprop | srcprop | srcprop | varchar2(50) |
| 7 | srcrepitem | srcrepitem | srcrepitem | varchar2(50) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |