# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7746.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_pu_payment | pk_ct_pu_payment | pk_ct_pu_payment | char(20) | √ |
| 2 | accrate | accrate | accrate | number(16, 4) |
| 3 | checkdata | checkdata | checkdata | number(38, 0) |
| 4 | effectaddmonth | effectaddmonth | effectaddmonth | number(38, 0) |
| 5 | effectdateadddate | effectdateadddate | effectdateadddate | number(38, 0) |
| 6 | effectmonth | effectmonth | effectmonth | number(38, 0) |
| 7 | isdeposit | isdeposit | isdeposit | char(1) |
| 8 | outaccountdate | outaccountdate | outaccountdate | number(38, 0) |
| 9 | paymentday | paymentday | paymentday | number(38, 0) |
| 10 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 11 | pk_ct_pu | pk_ct_pu | pk_ct_pu | char(20) | √ |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | pk_payperiod | pk_payperiod | pk_payperiod | varchar2(20) |  |  | '~' |
| 16 | pk_rate | pk_rate | pk_rate | varchar2(20) |  |  | '~' |
| 17 | prepayment | prepayment | prepayment | char(1) |
| 18 | showorder | showorder | showorder | number(38, 0) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |