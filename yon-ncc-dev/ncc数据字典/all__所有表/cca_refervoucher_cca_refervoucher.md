# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7417.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_refervoucher | pk_refervoucher | pk_refervoucher | char(20) | √ |
| 2 | pk_costvoucher | pk_costvoucher | pk_costvoucher | varchar2(20) |  |  | '~' |
| 3 | pk_execrule | pk_execrule | pk_execrule | char(20) | √ |
| 4 | pk_voucher | pk_voucher | pk_voucher | varchar2(20) |  |  | '~' |
| 5 | type | type | type | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |