# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8792.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hr_bill_ref | pk_hr_bill_ref | pk_hr_bill_ref | char(20) | √ |
| 2 | dest_billtype | dest_billtype | dest_billtype | varchar2(10) |
| 3 | dest_pk | dest_pk | dest_pk | varchar2(20) |
| 4 | source_billtype | source_billtype | source_billtype | varchar2(10) |
| 5 | source_pk | source_pk | source_pk | varchar2(20) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |