# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11892.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_approvemonitor | pk_approvemonitor | pk_approvemonitor | char(20) | √ |
| 2 | approverule | approverule | approverule | varchar2(200) |
| 3 | expreason | expreason | expreason | varchar2(200) |
| 4 | exptype | exptype | exptype | varchar2(20) |  |  | '~' |
| 5 | expuntreated | expuntreated | expuntreated | char(1) |
| 6 | pk_approverule | pk_approverule | pk_approverule | varchar2(20) |  |  | '~' |
| 7 | pk_billid | pk_billid | pk_billid | varchar2(20) | √ |
| 8 | pk_currenttask | pk_currenttask | pk_currenttask | char(20) | √ |  | '~' |
| 9 | resultsflag | resultsflag | resultsflag | varchar2(20) |  |  | '~' |
| 10 | workinggroupname | workinggroupname | workinggroupname | varchar2(200) |
| 11 | def1 | def1 | def1 | varchar2(101) |
| 12 | def2 | def2 | def2 | varchar2(101) |
| 13 | def3 | def3 | def3 | varchar2(101) |
| 14 | def4 | def4 | def4 | varchar2(101) |
| 15 | def5 | def5 | def5 | varchar2(101) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |