# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11536.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_createcorp | pk_createcorp | pk_createcorp | char(20) | √ |
| 2 | accountmonth | accountmonth | accountmonth | varchar2(2) |
| 3 | accountyear | accountyear | accountyear | char(4) |
| 4 | createcalendar | createcalendar | createcalendar | char(19) | √ |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 6 | funccode | funccode | funccode | varchar2(60) | √ |
| 7 | isncinnermodule | isncinnermodule | isncinnermodule | char(1) |
| 8 | pk_corp | pk_corp | pk_corp | char(4) | √ |
| 9 | pk_org | pk_org | pk_org | char(20) | √ |
| 10 | settledmonth | settledmonth | settledmonth | varchar2(2) |
| 11 | settledyear | settledyear | settledyear | char(4) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |