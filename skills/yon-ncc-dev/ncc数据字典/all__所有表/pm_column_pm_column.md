# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10559.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | columncode | columncode | columncode | varchar2(20) | √ |
| 3 | columndatetype | columndatetype | columndatetype | number(38, 0) | √ |
| 4 | columnname | columnname | columnname | varchar2(150) | √ |
| 5 | columntype | columntype | columntype | number(38, 0) | √ |
| 6 | defaultvalue | defaultvalue | defaultvalue | varchar2(150) |
| 7 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 1 |
| 8 | iscalculable | iscalculable | iscalculable | number(38, 0) | √ |
| 9 | issystem | issystem | issystem | number(38, 0) | √ |
| 10 | tenantid | tenantid | tenantid | varchar2(32) |
| 11 | creationtime | creationtime | creationtime | date |
| 12 | creator | creator | creator | varchar2(36) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | date |
| 15 | modifier | modifier | modifier | varchar2(36) |
| 16 | ts | ts | ts | date |  |  | sysdate |