# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10853.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_actionconstric | pk_actionconstric | pk_actionconstric | char(20) | √ |
| 2 | actiontype | actiontype | actiontype | varchar2(20) | √ |
| 3 | conditionjson | conditionjson | conditionjson | blob |
| 4 | conditionxpression | conditionxpression | conditionxpression | blob |
| 5 | configflag | configflag | configflag | number(38, 0) | √ |
| 6 | errhintmsg | errhintmsg | errhintmsg | varchar2(4000) |
| 7 | functionid | functionid | functionid | varchar2(20) |  |  | '~' |
| 8 | isbefore | isbefore | isbefore | char(1) |
| 9 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 10 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 11 | pk_businesstype | pk_businesstype | pk_businesstype | char(20) | √ |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | sysindex | sysindex | sysindex | number(38, 0) |
| 15 | value | value | value | varchar2(50) |
| 16 | ysf | ysf | ysf | varchar2(30) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |