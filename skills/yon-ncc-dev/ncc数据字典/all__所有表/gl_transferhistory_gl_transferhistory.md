# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8570.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transferhistory | pk_transferhistory | pk_transferhistory | char(20) | √ |
| 2 | operatetime | operatetime | operatetime | char(19) |
| 3 | period | period | period | varchar2(3) |
| 4 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 5 | pk_corp | pk_corp | pk_corp | char(4) |
| 6 | pk_glbook | pk_glbook | pk_glbook | char(20) |
| 7 | pk_glorg | pk_glorg | pk_glorg | char(20) |
| 8 | pk_group | pk_group | pk_group | char(20) |
| 9 | pk_org | pk_org | pk_org | char(20) |
| 10 | pk_sob | pk_sob | pk_sob | char(20) |
| 11 | pk_transfer | pk_transfer | pk_transfer | char(20) |
| 12 | pk_unit | pk_unit | pk_unit | char(20) |
| 13 | pk_voucher | pk_voucher | pk_voucher | char(20) |
| 14 | pk_voucher_reversed | pk_voucher_reversed | pk_voucher_reversed | char(20) |
| 15 | transfertype | transfertype | transfertype | varchar2(100) |
| 16 | year | year | year | char(4) |
| 17 | free1 | free1 | free1 | varchar2(60) |
| 18 | free2 | free2 | free2 | varchar2(60) |
| 19 | free3 | free3 | free3 | varchar2(60) |
| 20 | free4 | free4 | free4 | varchar2(60) |
| 21 | free5 | free5 | free5 | varchar2(60) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |