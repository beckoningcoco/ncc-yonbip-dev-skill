# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7395.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accrualset | pk_accrualset | pk_accrualset | char(20) | √ |
| 2 | getnummethod | getnummethod | getnummethod | number(38, 0) |
| 3 | isrefer | isrefer | isrefer | char(1) |
| 4 | pk_drawruleobject | pk_drawruleobject | pk_drawruleobject | varchar2(20) |  |  | '~' |
| 5 | pk_enumvalue | pk_enumvalue | pk_enumvalue | varchar2(20) |  |  | '~' |
| 6 | pk_expenseaccrual | pk_expenseaccrual | pk_expenseaccrual | varchar2(50) |
| 7 | value | value | value | varchar2(2000) |  |  | '~' |
| 8 | valuerule | valuerule | valuerule | varchar2(75) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |