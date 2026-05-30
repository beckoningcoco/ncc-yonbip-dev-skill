# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10586.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | dimcode | dimcode | dimcode | varchar2(40) | √ |
| 3 | dimname | dimname | dimname | varchar2(600) | √ |
| 4 | dimremark | dimremark | dimremark | varchar2(600) |
| 5 | dimtype | dimtype | dimtype | number(38, 0) | √ |
| 6 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 1 |
| 7 | issystem | issystem | issystem | number(38, 0) | √ |  | 0 |
| 8 | tenantid | tenantid | tenantid | varchar2(32) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | date |  |  | sysdate |