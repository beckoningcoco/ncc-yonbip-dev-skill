# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8550.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recothertmp | pk_recothertmp | pk_recothertmp | char(20) | √ |
| 2 | explanation | explanation | explanation | varchar2(1000) |
| 3 | pk_group | pk_group | pk_group | char(20) |
| 4 | pk_othercorp | pk_othercorp | pk_othercorp | char(20) |
| 5 | pk_otherglbook | pk_otherglbook | pk_otherglbook | char(20) |
| 6 | pk_otherglorg | pk_otherglorg | pk_otherglorg | char(20) |
| 7 | pk_otherglorgbook | pk_otherglorgbook | pk_otherglorgbook | char(20) |
| 8 | pk_prepared | pk_prepared | pk_prepared | char(20) |
| 9 | pk_reconcileoccur | pk_reconcileoccur | pk_reconcileoccur | char(20) |
| 10 | pk_recvoucher | pk_recvoucher | pk_recvoucher | char(20) |
| 11 | pk_selfcorp | pk_selfcorp | pk_selfcorp | char(20) |
| 12 | pk_selfglbook | pk_selfglbook | pk_selfglbook | char(20) |
| 13 | pk_selfglorg | pk_selfglorg | pk_selfglorg | char(20) |
| 14 | pk_selfglorgbook | pk_selfglorgbook | pk_selfglorgbook | char(20) |
| 15 | pk_voucher | pk_voucher | pk_voucher | char(20) |
| 16 | pk_vouchertype | pk_vouchertype | pk_vouchertype | char(20) |
| 17 | prepareddate | prepareddate | prepareddate | char(19) |
| 18 | totalcredit | totalcredit | totalcredit | number(28, 8) |
| 19 | totaldebit | totaldebit | totaldebit | number(28, 8) |
| 20 | voucherno | voucherno | voucherno | number(38, 0) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |