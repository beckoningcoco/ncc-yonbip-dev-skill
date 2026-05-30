# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8549.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucher | pk_voucher | pk_voucher | char(20) | √ |
| 2 | discardflag | discardflag | discardflag | char(1) |
| 3 | errmessage | errmessage | errmessage | varchar2(60) |
| 4 | explanation | explanation | explanation | varchar2(1000) |
| 5 | isdifflag | isdifflag | isdifflag | char(1) |
| 6 | period | period | period | char(2) |
| 7 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 8 | pk_group | pk_group | pk_group | char(20) |
| 9 | pk_org | pk_org | pk_org | char(20) |
| 10 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 11 | pk_setofbook | pk_setofbook | pk_setofbook | char(20) |
| 12 | pk_sourcepk | pk_sourcepk | pk_sourcepk | char(20) |
| 13 | pk_vouchertype | pk_vouchertype | pk_vouchertype | char(20) |
| 14 | totalcredit | totalcredit | totalcredit | number(28, 8) |
| 15 | totaldebit | totaldebit | totaldebit | number(28, 8) |
| 16 | voucherkind | voucherkind | voucherkind | number(38, 0) |
| 17 | year | year | year | char(4) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |