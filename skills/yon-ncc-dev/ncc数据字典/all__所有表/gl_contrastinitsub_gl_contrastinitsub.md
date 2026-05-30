# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8458.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastinitsub | pk_contrastinitsub | pk_contrastinitsub | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |  |  | 0 |
| 3 | bizdate | bizdate | bizdate | char(19) |
| 4 | checkdate | checkdate | checkdate | char(19) |
| 5 | checkno | checkno | checkno | varchar2(20) |
| 6 | checkstyle | checkstyle | checkstyle | varchar2(20) |
| 7 | detailno | detailno | detailno | number(38, 0) |
| 8 | direction | direction | direction | varchar2(50) |
| 9 | explanation | explanation | explanation | varchar2(150) |
| 10 | globalamount | globalamount | globalamount | number(28, 8) |  |  | 0 |
| 11 | groupamount | groupamount | groupamount | number(28, 8) |  |  | 0 |
| 12 | iscontrasted | iscontrasted | iscontrasted | char(1) |
| 13 | istransfered | istransfered | istransfered | char(1) |
| 14 | locamount | locamount | locamount | number(28, 8) |  |  | 0 |
| 15 | period | period | period | char(2) |
| 16 | pk_accasoa | pk_accasoa | pk_accasoa | varchar2(20) |  |  | '~' |
| 17 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 18 | pk_contrastinit | pk_contrastinit | pk_contrastinit | char(20) | √ |
| 19 | pk_contrastrule | pk_contrastrule | pk_contrastrule | varchar2(20) |  |  | '~' |
| 20 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 21 | pk_customer | pk_customer | pk_customer | char(20) |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_measure | pk_measure | pk_measure | varchar2(50) |
| 24 | pk_vouchertype | pk_vouchertype | pk_vouchertype | varchar2(20) |  |  | '~' |
| 25 | quantity | quantity | quantity | number(28, 8) |  |  | 0 |
| 26 | startdate | startdate | startdate | char(19) |
| 27 | voucherdate | voucherdate | voucherdate | char(19) |
| 28 | voucherno | voucherno | voucherno | number(38, 0) |
| 29 | year | year | year | char(4) |
| 30 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |