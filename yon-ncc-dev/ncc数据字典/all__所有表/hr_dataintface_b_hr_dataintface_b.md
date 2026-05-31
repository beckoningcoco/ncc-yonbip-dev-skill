# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8803.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dataintface_b | pk_dataintface_b | pk_dataintface_b | char(20) | √ |
| 2 | icaretpos | icaretpos | icaretpos | number(38, 0) |
| 3 | ifid | ifid | ifid | char(20) | √ |
| 4 | ifieldtype | ifieldtype | ifieldtype | number(38, 0) | √ |
| 5 | iflddecimal | iflddecimal | iflddecimal | number(38, 0) |
| 6 | ifldwidth | ifldwidth | ifldwidth | number(38, 0) | √ |  | 0 |
| 7 | iiforder | iiforder | iiforder | number(38, 0) |  |  | 0 |
| 8 | iseq | iseq | iseq | number(38, 0) | √ |
| 9 | isourcetype | isourcetype | isourcetype | number(38, 0) | √ |
| 10 | vcaret | vcaret | vcaret | varchar2(2) |
| 11 | vcontent | vcontent | vcontent | varchar2(128) |
| 12 | vfieldname | vfieldname | vfieldname | varchar2(200) | √ |
| 13 | vformulastr | vformulastr | vformulastr | varchar2(1024) |
| 14 | vincludeafter | vincludeafter | vincludeafter | varchar2(2) |
| 15 | vincludebefore | vincludebefore | vincludebefore | varchar2(2) |
| 16 | vseparator | vseparator | vseparator | varchar2(2) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |