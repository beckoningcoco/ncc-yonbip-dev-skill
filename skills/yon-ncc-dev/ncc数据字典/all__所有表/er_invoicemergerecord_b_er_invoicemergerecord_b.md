# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7969.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoicemergerecord_b | pk_invoicemergerecord_b | pk_invoicemergerecord_b | char(20) | √ |
| 2 | pk_erminvoice | pk_erminvoice | pk_erminvoice | varchar2(20) |  |  | '~' |
| 3 | pk_erminvoice_b | pk_erminvoice_b | pk_erminvoice_b | varchar2(50) |
| 4 | pk_invoicemergerecord | pk_invoicemergerecord | pk_invoicemergerecord | char(20) | √ |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |