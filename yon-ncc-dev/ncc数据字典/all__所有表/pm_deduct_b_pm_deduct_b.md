# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10585.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deduct_b | pk_deduct_b | pk_deduct_b | char(20) | √ |
| 2 | calcostmny | calcostmny | calcostmny | number(28, 8) |
| 3 | deduct_explain | deduct_explain | deduct_explain | varchar2(200) |
| 4 | deduct_mny | deduct_mny | deduct_mny | number(28, 8) |
| 5 | deduct_taxmny | deduct_taxmny | deduct_taxmny | number(28, 8) |
| 6 | estimate_mny | estimate_mny | estimate_mny | number(28, 8) |
| 7 | estimate_tax | estimate_tax | estimate_tax | number(28, 8) |
| 8 | estimate_taxmny | estimate_taxmny | estimate_taxmny | number(28, 8) |
| 9 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 10 | invoice_qual_mny | invoice_qual_mny | invoice_qual_mny | number(28, 8) |
| 11 | memo | memo | memo | varchar2(200) |
| 12 | nosubtaxmny | nosubtaxmny | nosubtaxmny | number(28, 8) |
| 13 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |
| 14 | pk_deduct | pk_deduct | pk_deduct | char(20) | √ |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 19 | rowno | rowno | rowno | varchar2(30) |
| 20 | tax | tax | tax | number(28, 8) |
| 21 | taxrate | taxrate | taxrate | number(28, 8) |
| 22 | taxtype | taxtype | taxtype | number(38, 0) |  |  | 1 |
| 23 | verified_flag | verified_flag | verified_flag | char(1) |
| 24 | verify_mny | verify_mny | verify_mny | number(28, 8) |
| 25 | writeoff_mny | writeoff_mny | writeoff_mny | number(28, 8) |
| 26 | writeoff_tax | writeoff_tax | writeoff_tax | number(28, 8) |
| 27 | writeoff_taxmny | writeoff_taxmny | writeoff_taxmny | number(28, 8) |
| 28 | def1 | def1 | def1 | varchar2(101) |
| 29 | def2 | def2 | def2 | varchar2(101) |
| 30 | def3 | def3 | def3 | varchar2(101) |
| 31 | def4 | def4 | def4 | varchar2(101) |
| 32 | def5 | def5 | def5 | varchar2(101) |
| 33 | def6 | def6 | def6 | varchar2(101) |
| 34 | def7 | def7 | def7 | varchar2(101) |
| 35 | def8 | def8 | def8 | varchar2(101) |
| 36 | def9 | def9 | def9 | varchar2(101) |
| 37 | def10 | def10 | def10 | varchar2(101) |
| 38 | def11 | def11 | def11 | varchar2(101) |
| 39 | def12 | def12 | def12 | varchar2(101) |
| 40 | def13 | def13 | def13 | varchar2(101) |
| 41 | def14 | def14 | def14 | varchar2(101) |
| 42 | def15 | def15 | def15 | varchar2(101) |
| 43 | def16 | def16 | def16 | varchar2(101) |
| 44 | def17 | def17 | def17 | varchar2(101) |
| 45 | def18 | def18 | def18 | varchar2(101) |
| 46 | def19 | def19 | def19 | varchar2(101) |
| 47 | def20 | def20 | def20 | varchar2(101) |
| 48 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 49 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |