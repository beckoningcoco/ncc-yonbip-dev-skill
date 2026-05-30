# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7288.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dynamicdim | pk_dynamicdim | pk_dynamicdim | char(20) | √ |
| 2 | pk_detail | pk_detail | pk_detail | varchar2(20) |
| 3 | pk_dimdef | pk_dimdef | pk_dimdef | varchar2(20) |
| 4 | pk_dimlevel | pk_dimlevel | pk_dimlevel | varchar2(20) |
| 5 | pk_levelval | pk_levelval | pk_levelval | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |