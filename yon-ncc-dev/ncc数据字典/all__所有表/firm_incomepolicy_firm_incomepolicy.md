# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8358.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_incomepolicy | pk_incomepolicy | pk_incomepolicy | char(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | defertype | defertype | defertype | number(38, 0) |
| 4 | incometype | incometype | incometype | number(38, 0) |
| 5 | name | name | name | varchar2(300) | √ |
| 6 | name2 | name2 | name2 | varchar2(300) |
| 7 | name3 | name3 | name3 | varchar2(300) |
| 8 | name4 | name4 | name4 | varchar2(300) |
| 9 | name5 | name5 | name5 | varchar2(300) |
| 10 | name6 | name6 | name6 | varchar2(300) |
| 11 | pk_deferrule | pk_deferrule | pk_deferrule | varchar2(20) |  |  | '~' |
| 12 | pk_defertime | pk_defertime | pk_defertime | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_imcomerule | pk_imcomerule | pk_imcomerule | varchar2(20) |  |  | '~' |
| 15 | pk_incometime | pk_incometime | pk_incometime | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |