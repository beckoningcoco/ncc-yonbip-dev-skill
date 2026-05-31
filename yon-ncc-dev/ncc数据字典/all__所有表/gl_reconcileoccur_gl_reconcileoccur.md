# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8538.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcileoccur | pk_reconcileoccur | pk_reconcileoccur | char(20) | √ |
| 2 | code | code | code | varchar2(15) |
| 3 | creattime | creattime | creattime | char(19) |
| 4 | isdetailrecon | isdetailrecon | isdetailrecon | char(1) |
| 5 | isreconcile | isreconcile | isreconcile | char(1) |
| 6 | occurdate | occurdate | occurdate | char(19) |
| 7 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 8 | pk_book | pk_book | pk_book | char(20) |
| 9 | pk_group | pk_group | pk_group | char(20) |
| 10 | pk_org | pk_org | pk_org | char(20) |
| 11 | pk_voucherself | pk_voucherself | pk_voucherself | char(20) |
| 12 | reconciler | reconciler | reconciler | char(20) |
| 13 | creator | creator | creator | char(20) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | char(20) |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |