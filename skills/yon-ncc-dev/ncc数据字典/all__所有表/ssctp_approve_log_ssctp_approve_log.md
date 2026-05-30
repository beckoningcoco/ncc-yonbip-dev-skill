# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11895.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_approve_log | pk_approve_log | pk_approve_log | char(20) | √ |
| 2 | actiontype | actiontype | actiontype | varchar2(50) |
| 3 | pk_approverule | pk_approverule | pk_approverule | varchar2(20) |
| 4 | pk_billid | pk_billid | pk_billid | varchar2(20) | √ |
| 5 | result | result | result | varchar2(20) |  |  | '~' |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |