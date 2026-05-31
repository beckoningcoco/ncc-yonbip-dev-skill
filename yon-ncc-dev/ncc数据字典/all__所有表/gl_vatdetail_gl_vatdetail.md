# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8579.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vatdetail | pk_vatdetail | pk_vatdetail | varchar2(20) | √ |
| 2 | businesscode | businesscode | businesscode | varchar2(50) |
| 3 | detailindex | detailindex | detailindex | number(38, 0) |
| 4 | direction | direction | direction | varchar2(1) |
| 5 | explanation | explanation | explanation | varchar2(150) |
| 6 | moneyamount | moneyamount | moneyamount | number(28, 8) |
| 7 | pk_accasoa | pk_accasoa | pk_accasoa | varchar2(20) |  |  | '~' |
| 8 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 9 | pk_clientvatcode | pk_clientvatcode | pk_clientvatcode | varchar2(20) |
| 10 | pk_detail | pk_detail | pk_detail | varchar2(20) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_manager | pk_manager | pk_manager | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_receivecountry | pk_receivecountry | pk_receivecountry | varchar2(20) |  |  | '~' |
| 15 | pk_suppliervatcode | pk_suppliervatcode | pk_suppliervatcode | varchar2(20) |
| 16 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 17 | pk_unit | pk_unit | pk_unit | varchar2(20) |  |  | '~' |
| 18 | pk_vatcountry | pk_vatcountry | pk_vatcountry | varchar2(20) |  |  | '~' |
| 19 | pk_voucher | pk_voucher | pk_voucher | varchar2(20) |
| 20 | prepareddate | prepareddate | prepareddate | char(19) |
| 21 | sendcountryid | sendcountryid | sendcountryid | varchar2(20) |  |  | '~' |
| 22 | taxamount | taxamount | taxamount | number(28, 8) |
| 23 | voucherkind | voucherkind | voucherkind | varchar2(50) |
| 24 | voucherno | voucherno | voucherno | number(38, 0) |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |