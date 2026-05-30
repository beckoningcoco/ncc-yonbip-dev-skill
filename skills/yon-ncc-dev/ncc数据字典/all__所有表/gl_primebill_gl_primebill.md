# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8525.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_primebill | pk_primebill | pk_primebill | char(20) | √ |
| 2 | content | content | content | blob |
| 3 | memassage | memassage | memassage | varchar2(1000) |
| 4 | name | name | name | varchar2(200) |
| 5 | parenttablename | parenttablename | parenttablename | varchar2(50) |
| 6 | pk_parentbill | pk_parentbill | pk_parentbill | char(20) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |