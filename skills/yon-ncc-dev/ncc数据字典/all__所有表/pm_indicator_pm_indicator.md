# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10619.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | applyobject | applyobject | applyobject | number(38, 0) | √ |
| 3 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 1 |
| 4 | evalstandard | evalstandard | evalstandard | varchar2(3000) |
| 5 | indiclassid | indiclassid | indiclassid | varchar2(32) |
| 6 | indicode | indicode | indicode | varchar2(20) |
| 7 | indiexplain | indiexplain | indiexplain | varchar2(3000) |
| 8 | indiname | indiname | indiname | varchar2(300) | √ |
| 9 | indiprop | indiprop | indiprop | number(38, 0) |
| 10 | inditype | inditype | inditype | number(38, 0) |
| 11 | indiunit | indiunit | indiunit | varchar2(20) |
| 12 | orgid | orgid | orgid | varchar2(660) | √ |  | '' |
| 13 | tenantid | tenantid | tenantid | varchar2(32) |
| 14 | creationtime | creationtime | creationtime | date |
| 15 | creator | creator | creator | varchar2(36) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | date |
| 18 | modifier | modifier | modifier | varchar2(36) |
| 19 | ts | ts | ts | date |  |  | sysdate |