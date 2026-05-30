# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6641.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_attrmap | pk_attrmap | pk_attrmap | char(20) | √ |
| 2 | accstrategy | accstrategy | accstrategy | number(38, 0) |
| 3 | pk_appobjattr | pk_appobjattr | pk_appobjattr | varchar2(20) |  |  | '~' |
| 4 | pk_referobj | pk_referobj | pk_referobj | varchar2(20) |  |  | '~' |
| 5 | referobjattr | referobjattr | referobjattr | varchar2(50) |  |  | '~' |
| 6 | refobjattrname | refobjattrname | refobjattrname | varchar2(300) |
| 7 | refobjattrname2 | refobjattrname2 | refobjattrname2 | varchar2(300) |
| 8 | refobjattrname3 | refobjattrname3 | refobjattrname3 | varchar2(300) |
| 9 | refobjattrname4 | refobjattrname4 | refobjattrname4 | varchar2(300) |
| 10 | refobjattrname5 | refobjattrname5 | refobjattrname5 | varchar2(300) |
| 11 | refobjattrname6 | refobjattrname6 | refobjattrname6 | varchar2(300) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |