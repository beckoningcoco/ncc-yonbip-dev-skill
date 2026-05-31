# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7736.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_payplan | pk_ct_payplan | pk_ct_payplan | char(20) | √ |
| 2 | bpreflag | bpreflag | bpreflag | char(1) |
| 3 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 4 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 5 | crowno | crowno | crowno | varchar2(20) |
| 6 | dbegindate | dbegindate | dbegindate | char(19) |
| 7 | denddate | denddate | denddate | char(19) |
| 8 | feffdatetype | feffdatetype | feffdatetype | varchar2(50) |
| 9 | iaccounttermno | iaccounttermno | iaccounttermno | number(38, 0) |
| 10 | iitermdays | iitermdays | iitermdays | number(38, 0) |
| 11 | naccumpayappmny | naccumpayappmny | naccumpayappmny | number(28, 8) |
| 12 | naccumpayapporgmny | naccumpayapporgmny | naccumpayapporgmny | number(28, 8) |
| 13 | naccumpaymny | naccumpaymny | naccumpaymny | number(28, 8) |
| 14 | naccumpayorgmny | naccumpayorgmny | naccumpayorgmny | number(28, 8) |
| 15 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 16 | nmny | nmny | nmny | number(28, 8) |
| 17 | norigmny | norigmny | norigmny | number(28, 8) |
| 18 | nrate | nrate | nrate | number(28, 8) |
| 19 | ntotalorigmny | ntotalorigmny | ntotalorigmny | number(28, 8) |
| 20 | pk_ct_pu | pk_ct_pu | pk_ct_pu | char(20) | √ |
| 21 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 22 | pk_financeorg_v | pk_financeorg_v | pk_financeorg_v | varchar2(20) |  |  | '~' |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_payterm | pk_payterm | pk_payterm | varchar2(20) |  |  | '~' |
| 25 | pk_paytermch | pk_paytermch | pk_paytermch | varchar2(20) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |