# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12272.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | begindatetime | begindatetime | begindatetime | char(19) |
| 3 | cleandquota | cleandquota | cleandquota | number(16, 4) |
| 4 | clearingstate | clearingstate | clearingstate | number(38, 0) |
| 5 | curquota | curquota | curquota | number(16, 4) |
| 6 | enddatetime | enddatetime | enddatetime | char(19) |
| 7 | initialrestquota | initialrestquota | initialrestquota | number(16, 4) |
| 8 | invalidstate | invalidstate | invalidstate | number(38, 0) |
| 9 | lastenddatetime | lastenddatetime | lastenddatetime | char(19) |
| 10 | leavetype | leavetype | leavetype | varchar2(36) |
| 11 | month | month | month | varchar2(2) |
| 12 | nextquota | nextquota | nextquota | number(16, 4) |
| 13 | obsoletequota | obsoletequota | obsoletequota | number(16, 4) |
| 14 | periodtype | periodtype | periodtype | number(38, 0) |
| 15 | preforwardquota | preforwardquota | preforwardquota | number(16, 4) |
| 16 | prerestquota | prerestquota | prerestquota | number(16, 4) |
| 17 | restquota | restquota | restquota | number(16, 4) |
| 18 | staffid | staffid | staffid | varchar2(36) |
| 19 | usedquota | usedquota | usedquota | number(16, 4) |
| 20 | usedquotaapproved | usedquotaapproved | usedquotaapproved | number(16, 4) |
| 21 | usedquotaapproving | usedquotaapproving | usedquotaapproving | number(16, 4) |
| 22 | year | year | year | varchar2(4) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | date |  |  | sysdate |