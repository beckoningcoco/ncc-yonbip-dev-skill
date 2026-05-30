# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10471.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr_pay | pk_contr_pay | pk_contr_pay | char(20) | √ |
| 2 | accouts | accouts | accouts | number(38, 0) |
| 3 | accrate | accrate | accrate | number(28, 8) |
| 4 | completeratio | completeratio | completeratio | number(28, 8) |
| 5 | isdeposit | isdeposit | isdeposit | char(1) |
| 6 | isprepayment | isprepayment | isprepayment | char(1) |
| 7 | memo | memo | memo | varchar2(200) |
| 8 | oprnum | oprnum | oprnum | number(38, 0) |  |  | 0 |
| 9 | paymentday | paymentday | paymentday | number(38, 0) |
| 10 | pk_child_oid | pk_child_oid | pk_child_oid | varchar2(20) |
| 11 | pk_contr | pk_contr | pk_contr | char(20) | √ |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | pk_paymentch | pk_paymentch | pk_paymentch | varchar2(20) |  |  | '~' |
| 16 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 17 | qual_time | qual_time | qual_time | number(38, 0) |
| 18 | rowno | rowno | rowno | varchar2(20) |
| 19 | sched_taxmny | sched_taxmny | sched_taxmny | number(28, 8) |
| 20 | taxmny | taxmny | taxmny | number(28, 8) |
| 21 | tot_sld_taxmny | tot_sld_taxmny | tot_sld_taxmny | number(28, 8) |
| 22 | def1 | def1 | def1 | varchar2(101) |
| 23 | def2 | def2 | def2 | varchar2(101) |
| 24 | def3 | def3 | def3 | varchar2(101) |
| 25 | def4 | def4 | def4 | varchar2(101) |
| 26 | def5 | def5 | def5 | varchar2(101) |
| 27 | def6 | def6 | def6 | varchar2(101) |
| 28 | def7 | def7 | def7 | varchar2(101) |
| 29 | def8 | def8 | def8 | varchar2(101) |
| 30 | def9 | def9 | def9 | varchar2(101) |
| 31 | def10 | def10 | def10 | varchar2(101) |
| 32 | def11 | def11 | def11 | varchar2(101) |
| 33 | def12 | def12 | def12 | varchar2(101) |
| 34 | def13 | def13 | def13 | varchar2(101) |
| 35 | def14 | def14 | def14 | varchar2(101) |
| 36 | def15 | def15 | def15 | varchar2(101) |
| 37 | def16 | def16 | def16 | varchar2(101) |
| 38 | def17 | def17 | def17 | varchar2(101) |
| 39 | def18 | def18 | def18 | varchar2(101) |
| 40 | def19 | def19 | def19 | varchar2(101) |
| 41 | def20 | def20 | def20 | varchar2(101) |
| 42 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 43 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |