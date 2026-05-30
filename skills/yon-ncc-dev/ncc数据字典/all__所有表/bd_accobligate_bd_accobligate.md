# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6723.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accobligate | pk_accobligate | pk_accobligate | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | obligaterule | obligaterule | obligaterule | varchar2(50) | √ |
| 4 | pk_accchart | pk_accchart | pk_accchart | char(20) | √ |
| 5 | pk_createaccchart | pk_createaccchart | pk_createaccchart | varchar2(20) |  |  | '~' |
| 6 | pk_srcobligate | pk_srcobligate | pk_srcobligate | varchar2(20) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |