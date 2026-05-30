# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8256.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_archivelog | pk_archivelog | pk_archivelog | char(20) | √ |
| 2 | archivedate | archivedate | archivedate | char(19) |
| 3 | period | period | period | char(2) | √ |
| 4 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) | √ |
| 5 | pk_archive | pk_archive | pk_archive | char(20) | √ |
| 6 | pk_archived | pk_archived | pk_archived | varchar2(20) |  |  | '~' |
| 7 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 8 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 9 | pk_voucher | pk_voucher | pk_voucher | varchar2(20) | √ |
| 10 | pk_vouchertype | pk_vouchertype | pk_vouchertype | varchar2(20) |  |  | '~' |
| 11 | receiptfile | receiptfile | receiptfile | varchar2(100) |  |  | '~' |
| 12 | receiptmessage | receiptmessage | receiptmessage | varchar2(300) |  |  | '~' |
| 13 | state | state | state | varchar2(50) |
| 14 | vouchernum | vouchernum | vouchernum | number(38, 0) |
| 15 | year | year | year | char(4) | √ |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |