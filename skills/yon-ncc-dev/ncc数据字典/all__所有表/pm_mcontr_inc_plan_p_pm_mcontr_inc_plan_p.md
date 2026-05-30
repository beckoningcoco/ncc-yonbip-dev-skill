# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10643.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_income_plan_p | pk_income_plan_p | pk_income_plan_p | char(20) | √ |
| 2 | accouts | accouts | accouts | number(38, 0) |
| 3 | already_shou_taxmny | already_shou_taxmny | already_shou_taxmny | number(28, 8) |
| 4 | deadline | deadline | deadline | char(19) |
| 5 | effectdate | effectdate | effectdate | char(19) |
| 6 | income_rate | income_rate | income_rate | number(28, 8) |
| 7 | not_shou_taxmny | not_shou_taxmny | not_shou_taxmny | number(28, 8) |
| 8 | paymentday | paymentday | paymentday | number(38, 0) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_income_plan | pk_income_plan | pk_income_plan | char(20) | √ |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 14 | rowno | rowno | rowno | varchar2(20) |
| 15 | shou_mny | shou_mny | shou_mny | number(28, 8) |
| 16 | shou_taxmny | shou_taxmny | shou_taxmny | number(28, 8) |
| 17 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 18 | src_bill_type | src_bill_type | src_bill_type | varchar2(4) |
| 19 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 20 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 21 | src_tot_taxmny | src_tot_taxmny | src_tot_taxmny | number(28, 8) |
| 22 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 23 | tax | tax | tax | number(28, 8) |
| 24 | taxrate | taxrate | taxrate | number(28, 8) |
| 25 | bdef1 | bdef1 | bdef1 | varchar2(101) |
| 26 | bdef2 | bdef2 | bdef2 | varchar2(101) |
| 27 | bdef3 | bdef3 | bdef3 | varchar2(101) |
| 28 | bdef4 | bdef4 | bdef4 | varchar2(101) |
| 29 | bdef5 | bdef5 | bdef5 | varchar2(101) |
| 30 | bdef6 | bdef6 | bdef6 | varchar2(101) |
| 31 | bdef7 | bdef7 | bdef7 | varchar2(101) |
| 32 | bdef8 | bdef8 | bdef8 | varchar2(101) |
| 33 | bdef9 | bdef9 | bdef9 | varchar2(101) |
| 34 | bdef10 | bdef10 | bdef10 | varchar2(101) |
| 35 | bdef11 | bdef11 | bdef11 | varchar2(101) |
| 36 | bdef12 | bdef12 | bdef12 | varchar2(101) |
| 37 | bdef13 | bdef13 | bdef13 | varchar2(101) |
| 38 | bdef14 | bdef14 | bdef14 | varchar2(101) |
| 39 | bdef15 | bdef15 | bdef15 | varchar2(101) |
| 40 | bdef16 | bdef16 | bdef16 | varchar2(101) |
| 41 | bdef17 | bdef17 | bdef17 | varchar2(101) |
| 42 | bdef18 | bdef18 | bdef18 | varchar2(101) |
| 43 | bdef19 | bdef19 | bdef19 | varchar2(101) |
| 44 | bdef20 | bdef20 | bdef20 | varchar2(101) |
| 45 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 46 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |