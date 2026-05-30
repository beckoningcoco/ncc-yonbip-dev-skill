# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10778.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_order_payplan | pk_order_payplan | pk_order_payplan | char(20) | √ |
| 2 | bpreflag | bpreflag | bpreflag | char(1) |  |  | 'N' |
| 3 | ccontractid | ccontractid | ccontractid | varchar2(20) |  |  | '~' |
| 4 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 5 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 6 | crowno | crowno | crowno | varchar2(20) |
| 7 | dbegindate | dbegindate | dbegindate | char(19) |
| 8 | denddate | denddate | denddate | char(19) |
| 9 | feffdatetype | feffdatetype | feffdatetype | varchar2(20) |  |  | '~' |
| 10 | iaccounttermno | iaccounttermno | iaccounttermno | number(38, 0) |
| 11 | iitermdays | iitermdays | iitermdays | number(38, 0) |
| 12 | isdeposit | isdeposit | isdeposit | char(1) |
| 13 | naccumpayappmny | naccumpayappmny | naccumpayappmny | number(28, 8) |
| 14 | naccumpayapporgmny | naccumpayapporgmny | naccumpayapporgmny | number(28, 8) |
| 15 | naccumpaymny | naccumpaymny | naccumpaymny | number(28, 8) |
| 16 | naccumpayorgmny | naccumpayorgmny | naccumpayorgmny | number(28, 8) |
| 17 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 18 | nmny | nmny | nmny | number(28, 8) |
| 19 | norigmny | norigmny | norigmny | number(28, 8) |
| 20 | nrate | nrate | nrate | number(28, 8) |
| 21 | ntotalorigmny | ntotalorigmny | ntotalorigmny | number(28, 8) |
| 22 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 23 | pk_financeorg_v | pk_financeorg_v | pk_financeorg_v | varchar2(20) |  |  | '~' |
| 24 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 25 | pk_order | pk_order | pk_order | char(20) | √ |
| 26 | pk_paymentch | pk_paymentch | pk_paymentch | varchar2(20) |
| 27 | pk_payterm | pk_payterm | pk_payterm | varchar2(20) |  |  | '~' |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |