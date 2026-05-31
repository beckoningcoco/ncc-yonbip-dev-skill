# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7755.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_sale_payterm | pk_ct_sale_payterm | pk_ct_sale_payterm | char(20) | √ |
| 2 | accountday | accountday | accountday | number(38, 0) |
| 3 | accrate | accrate | accrate | number(16, 4) |
| 4 | checkdata | checkdata | checkdata | number(38, 0) |
| 5 | dplaneffectdate | dplaneffectdate | dplaneffectdate | char(19) |
| 6 | dplanenddate | dplanenddate | dplanenddate | char(19) |
| 7 | drealeffectdate | drealeffectdate | drealeffectdate | char(19) |
| 8 | drealenddate | drealenddate | drealenddate | char(19) |
| 9 | effectaddmonth | effectaddmonth | effectaddmonth | number(38, 0) |
| 10 | effectdateadddate | effectdateadddate | effectdateadddate | number(38, 0) |
| 11 | effectmonth | effectmonth | effectmonth | char(1) |
| 12 | isdeposit | isdeposit | isdeposit | char(1) |  |  | 'N' |
| 13 | nctrecvmny | nctrecvmny | nctrecvmny | number(28, 8) |
| 14 | nglobalpanrecymny | nglobalpanrecymny | nglobalpanrecymny | number(28, 8) |
| 15 | ngroupplanrecvmny | ngroupplanrecvmny | ngroupplanrecvmny | number(28, 8) |
| 16 | nlocalplanmny | nlocalplanmny | nlocalplanmny | number(28, 8) |
| 17 | nplanrecmny | nplanrecmny | nplanrecmny | number(28, 8) |
| 18 | nrealrecymny | nrealrecymny | nrealrecymny | number(28, 8) |
| 19 | paymentday | paymentday | paymentday | number(38, 0) |  |  | 0 |
| 20 | pk_balatype | pk_balatype | pk_balatype | char(20) |  |  | '~' |
| 21 | pk_ct_sale | pk_ct_sale | pk_ct_sale | char(20) | √ |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_incomeperiod | pk_incomeperiod | pk_incomeperiod | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_origpayterm | pk_origpayterm | pk_origpayterm | char(20) |
| 27 | pk_rate | pk_rate | pk_rate | char(20) |  |  | '~' |
| 28 | prepayment | prepayment | prepayment | char(1) |
| 29 | showorder | showorder | showorder | number(38, 0) |
| 30 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |