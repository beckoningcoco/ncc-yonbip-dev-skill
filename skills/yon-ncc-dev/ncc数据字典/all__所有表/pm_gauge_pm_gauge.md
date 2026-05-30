# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10611.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | classname | classname | classname | varchar2(120) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 1 |
| 4 | ischecked | ischecked | ischecked | number(38, 0) | √ |  | 0 |
| 5 | isdoubleweight | isdoubleweight | isdoubleweight | number(38, 0) | √ |  | 0 |
| 6 | name | name | name | varchar2(120) | √ |
| 7 | orgid | orgid | orgid | varchar2(660) | √ |  | '' |
| 8 | originalid | originalid | originalid | varchar2(32) | √ |  | '' |
| 9 | reftime | reftime | reftime | date |
| 10 | remark | remark | remark | varchar2(600) |
| 11 | scoreruleid | scoreruleid | scoreruleid | varchar2(32) |
| 12 | tenantid | tenantid | tenantid | varchar2(32) |
| 13 | creationtime | creationtime | creationtime | date |
| 14 | creator | creator | creator | varchar2(36) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | date |
| 17 | modifier | modifier | modifier | varchar2(36) |
| 18 | ts | ts | ts | date |  |  | sysdate |