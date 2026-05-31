# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11941.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | pk | pk | char(20) | √ |
| 2 | busicode | busicode | busicode | varchar2(50) |
| 3 | flag | flag | flag | char(1) |
| 4 | operatime | operatime | operatime | char(19) |
| 5 | operator | operator | operator | varchar2(50) |
| 6 | orderno | orderno | orderno | number(38, 0) |
| 7 | pk_bill | pk_bill | pk_bill | varchar2(50) |
| 8 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 9 | state | state | state | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |