# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11481.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocaterule_b | pk_allocaterule_b | pk_allocaterule_b | char(20) | √ |
| 2 | acceptbase | acceptbase | acceptbase | number(38, 0) |
| 3 | allocaterate | allocaterate | allocaterate | number(28, 8) |
| 4 | bankacccode_r | bankacccode_r | bankacccode_r | varchar2(40) |
| 5 | bankaccname_r | bankaccname_r | bankaccname_r | varchar2(200) |
| 6 | bankname_r | bankname_r | bankname_r | varchar2(20) |  |  | '~' |
| 7 | bankrelatecode | bankrelatecode | bankrelatecode | varchar2(50) |
| 8 | isacceptinteger | isacceptinteger | isacceptinteger | char(1) |
| 9 | isnetbankfull | isnetbankfull | isnetbankfull | char(1) |
| 10 | issamebank | issamebank | issamebank | varchar2(50) |
| 11 | issamecity | issamecity | issamecity | varchar2(50) |
| 12 | leastamount | leastamount | leastamount | number(28, 8) |
| 13 | paytype | paytype | paytype | varchar2(50) |
| 14 | pk_accid | pk_accid | pk_accid | varchar2(20) |  |  | '~' |
| 15 | pk_allocaterule_h | pk_allocaterule_h | pk_allocaterule_h | char(20) | √ |
| 16 | pk_bankacc_r | pk_bankacc_r | pk_bankacc_r | varchar2(20) |  |  | '~' |
| 17 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 18 | pk_financeorg_v | pk_financeorg_v | pk_financeorg_v | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | pk_planitem_p | pk_planitem_p | pk_planitem_p | varchar2(20) |  |  | '~' |
| 23 | pk_planitem_r | pk_planitem_r | pk_planitem_r | varchar2(20) |  |  | '~' |
| 24 | reservelimit | reservelimit | reservelimit | number(28, 8) |
| 25 | rowno | rowno | rowno | varchar2(50) |
| 26 | ruletype | ruletype | ruletype | number(38, 0) |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |