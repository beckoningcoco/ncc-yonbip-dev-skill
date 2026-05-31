# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11839.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | bgimageid | bgimageid | bgimageid | varchar2(50) |
| 3 | imagepath | imagepath | imagepath | varchar2(1023) |
| 4 | name | name | name | varchar2(254) |
| 5 | showorder | showorder | showorder | number(38, 0) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |