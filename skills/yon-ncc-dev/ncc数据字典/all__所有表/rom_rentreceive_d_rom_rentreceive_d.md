# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11255.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentreceive_d | pk_rentreceive_d | pk_rentreceive_d | char(20) | √ |
| 2 | day_num | day_num | day_num | number(38, 0) |
| 3 | end_date | end_date | end_date | char(19) |
| 4 | memo | memo | memo | varchar2(200) |
| 5 | origin_rate | origin_rate | origin_rate | number(28, 8) |
| 6 | pk_contract_base | pk_contract_base | pk_contract_base | varchar2(20) |  |  | '~' |
| 7 | pk_contract_b_base_src | pk_contract_b_base_src | pk_contract_b_base_src | varchar2(20) |
| 8 | pk_contract_b_src | pk_contract_b_src | pk_contract_b_src | varchar2(20) |
| 9 | pk_contract_v | pk_contract_v | pk_contract_v | varchar2(20) | √ |  | '~' |
| 10 | pk_currency_origin | pk_currency_origin | pk_currency_origin | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 13 | pk_marbaseclass | pk_marbaseclass | pk_marbaseclass | varchar2(20) |  |  | '~' |
| 14 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 15 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | pk_rentreceive | pk_rentreceive | pk_rentreceive | char(20) | √ |
| 19 | pk_rent_unit | pk_rent_unit | pk_rent_unit | varchar2(20) |  |  | '~' |
| 20 | rentmoney | rentmoney | rentmoney | number(28, 8) |
| 21 | rentmoney_global | rentmoney_global | rentmoney_global | number(28, 8) |
| 22 | rentmoney_group | rentmoney_group | rentmoney_group | number(28, 8) |
| 23 | rentmoney_org | rentmoney_org | rentmoney_org | number(28, 8) |
| 24 | rent_num | rent_num | rent_num | number(28, 8) |
| 25 | rent_num_com | rent_num_com | rent_num_com | number(28, 8) |
| 26 | rent_num_discard | rent_num_discard | rent_num_discard | number(28, 8) |
| 27 | rent_num_lost | rent_num_lost | rent_num_lost | number(28, 8) |
| 28 | rent_num_out | rent_num_out | rent_num_out | number(28, 8) |
| 29 | rent_num_pre | rent_num_pre | rent_num_pre | number(28, 8) |
| 30 | rent_num_rt | rent_num_rt | rent_num_rt | number(28, 8) |
| 31 | rent_num_st | rent_num_st | rent_num_st | number(28, 8) |
| 32 | rent_price | rent_price | rent_price | number(28, 8) |
| 33 | rent_time | rent_time | rent_time | number(28, 8) |
| 34 | rowno | rowno | rowno | varchar2(30) |
| 35 | rowno_src | rowno_src | rowno_src | varchar2(30) |
| 36 | start_date | start_date | start_date | char(19) |
| 37 | def1 | def1 | def1 | varchar2(101) |
| 38 | def2 | def2 | def2 | varchar2(101) |
| 39 | def3 | def3 | def3 | varchar2(101) |
| 40 | def4 | def4 | def4 | varchar2(101) |
| 41 | def5 | def5 | def5 | varchar2(101) |
| 42 | def6 | def6 | def6 | varchar2(101) |
| 43 | def7 | def7 | def7 | varchar2(101) |
| 44 | def8 | def8 | def8 | varchar2(101) |
| 45 | def9 | def9 | def9 | varchar2(101) |
| 46 | def10 | def10 | def10 | varchar2(101) |
| 47 | def11 | def11 | def11 | varchar2(101) |
| 48 | def12 | def12 | def12 | varchar2(101) |
| 49 | def13 | def13 | def13 | varchar2(101) |
| 50 | def14 | def14 | def14 | varchar2(101) |
| 51 | def15 | def15 | def15 | varchar2(101) |
| 52 | def16 | def16 | def16 | varchar2(101) |
| 53 | def17 | def17 | def17 | varchar2(101) |
| 54 | def18 | def18 | def18 | varchar2(101) |
| 55 | def19 | def19 | def19 | varchar2(101) |
| 56 | def20 | def20 | def20 | varchar2(101) |
| 57 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 58 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |