# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11490.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deliveryrule_b | pk_deliveryrule_b | pk_deliveryrule_b | char(20) | √ |
| 2 | acceptbase | acceptbase | acceptbase | number(38, 0) |
| 3 | balance | balance | balance | number(28, 8) |
| 4 | bankname_p | bankname_p | bankname_p | varchar2(20) |  |  | '~' |
| 5 | bankrelatecode | bankrelatecode | bankrelatecode | varchar2(50) |
| 6 | deliveryrate | deliveryrate | deliveryrate | number(15, 8) |
| 7 | isacceptinteger | isacceptinteger | isacceptinteger | char(1) |
| 8 | isnetbankfull | isnetbankfull | isnetbankfull | char(1) |
| 9 | issamebank | issamebank | issamebank | varchar2(50) |
| 10 | issamecity | issamecity | issamecity | varchar2(50) |
| 11 | leastamount | leastamount | leastamount | number(28, 8) |
| 12 | paytype | paytype | paytype | varchar2(50) |
| 13 | pk_accid | pk_accid | pk_accid | varchar2(20) |  |  | '~' |
| 14 | pk_bankacc_p | pk_bankacc_p | pk_bankacc_p | varchar2(20) |  |  | '~' |
| 15 | pk_deliveryrule_h | pk_deliveryrule_h | pk_deliveryrule_h | char(20) | √ |
| 16 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 17 | pk_financeorg_v | pk_financeorg_v | pk_financeorg_v | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_planitem_p | pk_planitem_p | pk_planitem_p | varchar2(20) |  |  | '~' |
| 22 | pk_planitem_r | pk_planitem_r | pk_planitem_r | varchar2(20) |  |  | '~' |
| 23 | ration | ration | ration | number(28, 8) |
| 24 | rowno | rowno | rowno | varchar2(50) |
| 25 | ruletype | ruletype | ruletype | number(38, 0) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |