# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10613.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |  | '' |
| 2 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 1 |
| 3 | gradecode | gradecode | gradecode | varchar2(20) | √ |
| 4 | gradename | gradename | gradename | varchar2(150) | √ |
| 5 | graderemark | graderemark | graderemark | varchar2(600) |
| 6 | orgid | orgid | orgid | varchar2(660) | √ |  | '' |
| 7 | tenantid | tenantid | tenantid | varchar2(32) |
| 8 | creationtime | creationtime | creationtime | date |
| 9 | creator | creator | creator | varchar2(36) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | modifiedtime | modifiedtime | modifiedtime | date |
| 12 | modifier | modifier | modifier | varchar2(36) |
| 13 | ts | ts | ts | date |  |  | sysdate |