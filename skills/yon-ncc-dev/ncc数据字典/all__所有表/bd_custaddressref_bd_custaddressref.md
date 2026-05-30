# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6841.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_address | pk_address | pk_address | varchar2(20) | √ |
| 2 | pk_customer | pk_customer | pk_customer | varchar2(20) | √ |  | '~' |
| 3 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 5 | isupdated | isupdated | isupdated | char(1) |
| 6 | pk_addressref | pk_addressref | pk_addressref | varchar2(20) |  |  | '~' |
| 7 | pk_custaddress | pk_custaddress | pk_custaddress | varchar2(20) |  |  | '~' |
| 8 | reffieldname | reffieldname | reffieldname | varchar2(20) | √ |
| 9 | reftablename | reftablename | reftablename | varchar2(50) | √ |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |