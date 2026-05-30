# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10738.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | bizid | bizid | bizid | varchar2(32) |
| 3 | biztype | biztype | biztype | number(38, 0) |
| 4 | define1 | define1 | define1 | varchar2(765) |
| 5 | define2 | define2 | define2 | varchar2(765) |
| 6 | define3 | define3 | define3 | varchar2(765) |
| 7 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 1 |
| 8 | isdefault | isdefault | isdefault | number(38, 0) | √ |
| 9 | name | name | name | varchar2(120) |
| 10 | remark | remark | remark | varchar2(600) |
| 11 | tenantid | tenantid | tenantid | varchar2(32) |
| 12 | creationtime | creationtime | creationtime | date |
| 13 | creator | creator | creator | varchar2(36) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | date |
| 16 | modifier | modifier | modifier | varchar2(36) |
| 17 | ts | ts | ts | date |  |  | sysdate |