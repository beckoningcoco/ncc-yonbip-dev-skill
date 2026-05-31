# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10714.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | code | code | code | varchar2(32) |
| 3 | hot | hot | hot | number(38, 0) |
| 4 | issystem | issystem | issystem | number(38, 0) | √ |  | 0 |
| 5 | name | name | name | varchar2(30) | √ |
| 6 | tagorder | tagorder | tagorder | number(38, 0) |
| 7 | tagsubtype | tagsubtype | tagsubtype | number(38, 0) |
| 8 | tagtype | tagtype | tagtype | number(38, 0) | √ |
| 9 | tenantid | tenantid | tenantid | varchar2(32) |
| 10 | creator | creator | creator | varchar2(36) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | date |  |  | sysdate |