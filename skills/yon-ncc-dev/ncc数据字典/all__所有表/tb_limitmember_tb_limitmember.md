# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12050.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | limitmembers | limitmembers | limitmembers | varchar2(20) |
| 3 | pk_dimlevel | pk_dimlevel | pk_dimlevel | varchar2(50) |
| 4 | pk_levelvalue | pk_levelvalue | pk_levelvalue | blob |
| 5 | pk_rulemember | pk_rulemember | pk_rulemember | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |