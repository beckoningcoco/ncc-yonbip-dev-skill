# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7404.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_execrule | pk_execrule | pk_execrule | char(20) | √ |
| 2 | execstate | execstate | execstate | varchar2(50) |
| 3 | exedatatime | exedatatime | exedatatime | char(19) |
| 4 | exeuser | exeuser | exeuser | varchar2(20) |  |  | '~' |
| 5 | period | period | period | varchar2(50) |  |  | '~' |
| 6 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 7 | pk_accrule | pk_accrule | pk_accrule | varchar2(20) |  |  | '~' |
| 8 | pk_corule | pk_corule | pk_corule | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_period | pk_period | pk_period | varchar2(20) |  |  | '~' |
| 12 | pk_ruleparam | pk_ruleparam | pk_ruleparam | varchar2(50) |
| 13 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 14 | ruletype | ruletype | ruletype | number(38, 0) |
| 15 | showorder | showorder | showorder | number(38, 0) |
| 16 | year | year | year | varchar2(50) |  |  | '~' |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |