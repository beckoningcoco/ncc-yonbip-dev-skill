# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10652.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | changdate | changdate | changdate | date |
| 3 | changer | changer | changer | varchar2(36) |
| 4 | changtype | changtype | changtype | number(38, 0) |
| 5 | field | field | field | varchar2(765) |
| 6 | fieldname | fieldname | fieldname | varchar2(765) |
| 7 | formervaluenum | formervaluenum | formervaluenum | number(38, 0) |
| 8 | formervaluetext | formervaluetext | formervaluetext | varchar2(600) |
| 9 | newvaluenum | newvaluenum | newvaluenum | number(38, 0) |
| 10 | newvaluetext | newvaluetext | newvaluetext | varchar2(600) |
| 11 | objalignid | objalignid | objalignid | varchar2(32) |
| 12 | objectiveid | objectiveid | objectiveid | varchar2(32) | √ |
| 13 | tenantid | tenantid | tenantid | varchar2(32) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | date |  |  | sysdate |