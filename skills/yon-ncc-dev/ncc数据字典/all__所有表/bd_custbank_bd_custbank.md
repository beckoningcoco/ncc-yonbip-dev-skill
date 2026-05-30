# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6843.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custbank | pk_custbank | pk_custbank | char(20) | √ |
| 2 | accclass | accclass | accclass | number(38, 0) |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | isdefault | isdefault | isdefault | char(1) |
| 5 | pk_bankaccbas | pk_bankaccbas | pk_bankaccbas | varchar2(20) |  |  | '~' |
| 6 | pk_bankaccsub | pk_bankaccsub | pk_bankaccsub | varchar2(20) |  |  | '~' |
| 7 | pk_cust | pk_cust | pk_cust | varchar2(20) |  |  | '~' |
| 8 | pk_oldcustbank | pk_oldcustbank | pk_oldcustbank | char(20) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |