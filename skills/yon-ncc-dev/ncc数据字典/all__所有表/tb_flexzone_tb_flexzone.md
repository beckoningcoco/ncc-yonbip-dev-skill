# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12027.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | idx | idx | idx | number(38, 0) |
| 3 | pk_formula | pk_formula | pk_formula | varchar2(20) |
| 4 | plannum | plannum | plannum | varchar2(2000) |
| 5 | zonedown | zonedown | zonedown | number(30, 8) |
| 6 | zonedowntype | zonedowntype | zonedowntype | number(38, 0) |
| 7 | zonetype | zonetype | zonetype | number(38, 0) |
| 8 | zoneup | zoneup | zoneup | number(30, 8) |
| 9 | zoneuptype | zoneuptype | zoneuptype | number(38, 0) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |