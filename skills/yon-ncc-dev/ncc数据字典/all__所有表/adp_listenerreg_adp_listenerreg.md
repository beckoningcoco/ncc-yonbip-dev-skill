# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6419.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | listenerid | listenerid | listenerid | varchar2(50) | √ |
| 2 | classname | classname | classname | varchar2(300) |
| 3 | listener | listener | listener | varchar2(300) |
| 4 | module | module | module | varchar2(50) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |