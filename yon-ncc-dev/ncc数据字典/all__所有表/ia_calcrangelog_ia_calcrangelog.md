# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8881.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccalcrangelodid | ccalcrangelodid | ccalcrangelodid | char(20) | √ |
| 2 | caccountperiod | caccountperiod | caccountperiod | char(7) |
| 3 | cinventoryid | cinventoryid | cinventoryid | varchar2(20) |  |  | '~' |
| 4 | cmodifier | cmodifier | cmodifier | varchar2(20) |  |  | '~' |
| 5 | cnewrangefields | cnewrangefields | cnewrangefields | varchar2(500) |
| 6 | coldrangefields | coldrangefields | coldrangefields | varchar2(500) |
| 7 | pk_book | pk_book | pk_book | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |