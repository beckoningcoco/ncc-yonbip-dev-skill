# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8555.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settledreport | pk_settledreport | pk_settledreport | char(20) | √ |
| 2 | accountingbookcode | accountingbookcode | accountingbookcode | varchar2(30) |
| 3 | accountingbookname | accountingbookname | accountingbookname | varchar2(70) |
| 4 | finishstatus | finishstatus | finishstatus | number(38, 0) |
| 5 | issettled | issettled | issettled | number(38, 0) |
| 6 | period | period | period | char(2) |
| 7 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) | √ |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 11 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 12 | processvalue | processvalue | processvalue | varchar2(50) |
| 13 | settledtime | settledtime | settledtime | char(19) |
| 14 | settleduser | settleduser | settleduser | varchar2(20) |  |  | '~' |
| 15 | year | year | year | char(4) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |