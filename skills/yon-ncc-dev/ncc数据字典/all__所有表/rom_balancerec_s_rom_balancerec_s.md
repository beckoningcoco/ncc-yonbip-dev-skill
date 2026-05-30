# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11234.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balancerec_s | pk_balancerec_s | pk_balancerec_s | char(20) | √ |
| 2 | bill_code_stoprent | bill_code_stoprent | bill_code_stoprent | varchar2(40) |
| 3 | day_num | day_num | day_num | number(38, 0) |
| 4 | end_date | end_date | end_date | char(19) |
| 5 | memo | memo | memo | varchar2(200) |
| 6 | origin_rate | origin_rate | origin_rate | number(28, 8) |
| 7 | pk_balancerec | pk_balancerec | pk_balancerec | char(20) | √ |
| 8 | pk_contract_base | pk_contract_base | pk_contract_base | varchar2(20) |  |  | '~' |
| 9 | pk_contract_b_src | pk_contract_b_src | pk_contract_b_src | varchar2(20) |
| 10 | pk_contract_v | pk_contract_v | pk_contract_v | varchar2(20) |  |  | '~' |
| 11 | pk_currency_origin | pk_currency_origin | pk_currency_origin | varchar2(20) |  |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_marbaseclass | pk_marbaseclass | pk_marbaseclass | varchar2(20) |  |  | '~' |
| 14 | pk_material | pk_material | pk_material | varchar2(20) | √ |  | '~' |
| 15 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) | √ |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | pk_rent_unit | pk_rent_unit | pk_rent_unit | varchar2(20) |  |  | '~' |
| 19 | pk_stoprent | pk_stoprent | pk_stoprent | varchar2(20) |  |  | '~' |
| 20 | pk_stoprent_b_src | pk_stoprent_b_src | pk_stoprent_b_src | varchar2(20) |  |  | '~' |
| 21 | rent_num | rent_num | rent_num | number(28, 8) |
| 22 | rent_price | rent_price | rent_price | number(28, 8) |
| 23 | rent_price_org | rent_price_org | rent_price_org | number(28, 8) |
| 24 | rowno | rowno | rowno | varchar2(30) |
| 25 | rowno_src | rowno_src | rowno_src | varchar2(30) |
| 26 | rowno_stoprent | rowno_stoprent | rowno_stoprent | varchar2(30) |
| 27 | start_date | start_date | start_date | char(19) |
| 28 | stopmoney | stopmoney | stopmoney | number(28, 8) |
| 29 | stopmoney_global | stopmoney_global | stopmoney_global | number(28, 8) |
| 30 | stopmoney_group | stopmoney_group | stopmoney_group | number(28, 8) |
| 31 | stopmoney_org | stopmoney_org | stopmoney_org | number(28, 8) |
| 32 | def1 | def1 | def1 | varchar2(101) |
| 33 | def2 | def2 | def2 | varchar2(101) |
| 34 | def3 | def3 | def3 | varchar2(101) |
| 35 | def4 | def4 | def4 | varchar2(101) |
| 36 | def5 | def5 | def5 | varchar2(101) |
| 37 | def6 | def6 | def6 | varchar2(101) |
| 38 | def7 | def7 | def7 | varchar2(101) |
| 39 | def8 | def8 | def8 | varchar2(101) |
| 40 | def9 | def9 | def9 | varchar2(101) |
| 41 | def10 | def10 | def10 | varchar2(101) |
| 42 | def11 | def11 | def11 | varchar2(101) |
| 43 | def12 | def12 | def12 | varchar2(101) |
| 44 | def13 | def13 | def13 | varchar2(101) |
| 45 | def14 | def14 | def14 | varchar2(101) |
| 46 | def15 | def15 | def15 | varchar2(101) |
| 47 | def16 | def16 | def16 | varchar2(101) |
| 48 | def17 | def17 | def17 | varchar2(101) |
| 49 | def18 | def18 | def18 | varchar2(101) |
| 50 | def19 | def19 | def19 | varchar2(101) |
| 51 | def20 | def20 | def20 | varchar2(101) |
| 52 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 53 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |