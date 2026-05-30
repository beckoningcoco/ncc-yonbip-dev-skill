# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10691.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_salebalance_c | pk_salebalance_c | pk_salebalance_c | char(20) | √ |
| 2 | accrate | accrate | accrate | number(28, 8) |
| 3 | app_mny | app_mny | app_mny | number(28, 8) |
| 4 | bal_dif_taxmny | bal_dif_taxmny | bal_dif_taxmny | number(28, 8) |
| 5 | bal_mny | bal_mny | bal_mny | number(28, 8) |
| 6 | cha_taxmny_org | cha_taxmny_org | cha_taxmny_org | number(28, 8) |
| 7 | due_app_mny | due_app_mny | due_app_mny | number(28, 8) |
| 8 | due_mny | due_mny | due_mny | number(28, 8) |
| 9 | due_taxmny_org | due_taxmny_org | due_taxmny_org | number(28, 8) |
| 10 | isdeposit | isdeposit | isdeposit | char(1) |
| 11 | memo | memo | memo | varchar2(50) |
| 12 | paymentday | paymentday | paymentday | number(38, 0) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_mcontr_protocol | pk_mcontr_protocol | pk_mcontr_protocol | varchar2(50) |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | pk_sale_balance | pk_sale_balance | pk_sale_balance | char(20) | √ |
| 18 | prepayment | prepayment | prepayment | char(1) |
| 19 | qual_time | qual_time | qual_time | number(38, 0) |
| 20 | showorder | showorder | showorder | number(38, 0) |
| 21 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 22 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |
| 23 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 24 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 25 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |
| 26 | taxmny_org | taxmny_org | taxmny_org | number(28, 8) |
| 27 | tot_bal_mny | tot_bal_mny | tot_bal_mny | number(28, 8) |
| 28 | tot_bal_taxmny | tot_bal_taxmny | tot_bal_taxmny | number(28, 8) |
| 29 | bdef1 | bdef1 | bdef1 | varchar2(101) |
| 30 | bdef2 | bdef2 | bdef2 | varchar2(101) |
| 31 | bdef3 | bdef3 | bdef3 | varchar2(101) |
| 32 | bdef4 | bdef4 | bdef4 | varchar2(101) |
| 33 | bdef5 | bdef5 | bdef5 | varchar2(101) |
| 34 | bdef6 | bdef6 | bdef6 | varchar2(101) |
| 35 | bdef7 | bdef7 | bdef7 | varchar2(101) |
| 36 | bdef8 | bdef8 | bdef8 | varchar2(101) |
| 37 | bdef9 | bdef9 | bdef9 | varchar2(101) |
| 38 | bdef10 | bdef10 | bdef10 | varchar2(101) |
| 39 | bdef11 | bdef11 | bdef11 | varchar2(101) |
| 40 | bdef12 | bdef12 | bdef12 | varchar2(101) |
| 41 | bdef13 | bdef13 | bdef13 | varchar2(101) |
| 42 | bdef14 | bdef14 | bdef14 | varchar2(101) |
| 43 | bdef15 | bdef15 | bdef15 | varchar2(101) |
| 44 | bdef16 | bdef16 | bdef16 | varchar2(101) |
| 45 | bdef17 | bdef17 | bdef17 | varchar2(101) |
| 46 | bdef18 | bdef18 | bdef18 | varchar2(101) |
| 47 | bdef19 | bdef19 | bdef19 | varchar2(101) |
| 48 | bdef20 | bdef20 | bdef20 | varchar2(101) |
| 49 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 50 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |