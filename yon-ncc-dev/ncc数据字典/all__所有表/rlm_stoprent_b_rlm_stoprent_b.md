# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11214.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stoprent_b | pk_stoprent_b | pk_stoprent_b | char(20) | √ |
| 2 | changerate | changerate | changerate | varchar2(50) |
| 3 | close_flag | close_flag | close_flag | char(1) |
| 4 | close_type | close_type | close_type | number(38, 0) |  |  | 1 |
| 5 | day_num | day_num | day_num | number(38, 0) |
| 6 | end_date | end_date | end_date | char(19) |
| 7 | ismaterial_flag | ismaterial_flag | ismaterial_flag | char(1) |
| 8 | main_num | main_num | main_num | number(28, 8) |
| 9 | memo | memo | memo | varchar2(200) |
| 10 | nbatchcode | nbatchcode | nbatchcode | varchar2(40) |
| 11 | num | num | num | number(28, 8) |
| 12 | pk_bill_b_src_cooperate | pk_bill_b_src_cooperate | pk_bill_b_src_cooperate | varchar2(20) |
| 13 | pk_contract_b_base_src | pk_contract_b_base_src | pk_contract_b_base_src | varchar2(20) |
| 14 | pk_contract_b_src | pk_contract_b_src | pk_contract_b_src | varchar2(20) |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 17 | pk_main_unit | pk_main_unit | pk_main_unit | varchar2(20) |  |  | '~' |
| 18 | pk_marbaseclass | pk_marbaseclass | pk_marbaseclass | varchar2(20) |  |  | '~' |
| 19 | pk_material | pk_material | pk_material | varchar2(20) | √ |  | '~' |
| 20 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) | √ |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 23 | pk_producer | pk_producer | pk_producer | varchar2(20) |  |  | '~' |
| 24 | pk_reason | pk_reason | pk_reason | varchar2(20) |  |  | '~' |
| 25 | pk_rent_unit | pk_rent_unit | pk_rent_unit | varchar2(20) |  |  | '~' |
| 26 | pk_stoprent | pk_stoprent | pk_stoprent | char(20) | √ |
| 27 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 28 | pk_unit | pk_unit | pk_unit | varchar2(20) |  |  | '~' |
| 29 | rent_changerate | rent_changerate | rent_changerate | varchar2(50) |
| 30 | rent_num | rent_num | rent_num | number(28, 8) |
| 31 | rent_price | rent_price | rent_price | number(28, 8) |
| 32 | rowno | rowno | rowno | varchar2(30) |
| 33 | rowno_src | rowno_src | rowno_src | varchar2(30) |
| 34 | start_date | start_date | start_date | char(19) |
| 35 | def1 | def1 | def1 | varchar2(101) |
| 36 | def2 | def2 | def2 | varchar2(101) |
| 37 | def3 | def3 | def3 | varchar2(101) |
| 38 | def4 | def4 | def4 | varchar2(101) |
| 39 | def5 | def5 | def5 | varchar2(101) |
| 40 | def6 | def6 | def6 | varchar2(101) |
| 41 | def7 | def7 | def7 | varchar2(101) |
| 42 | def8 | def8 | def8 | varchar2(101) |
| 43 | def9 | def9 | def9 | varchar2(101) |
| 44 | def10 | def10 | def10 | varchar2(101) |
| 45 | def11 | def11 | def11 | varchar2(101) |
| 46 | def12 | def12 | def12 | varchar2(101) |
| 47 | def13 | def13 | def13 | varchar2(101) |
| 48 | def14 | def14 | def14 | varchar2(101) |
| 49 | def15 | def15 | def15 | varchar2(101) |
| 50 | def16 | def16 | def16 | varchar2(101) |
| 51 | def17 | def17 | def17 | varchar2(101) |
| 52 | def18 | def18 | def18 | varchar2(101) |
| 53 | def19 | def19 | def19 | varchar2(101) |
| 54 | def20 | def20 | def20 | varchar2(101) |
| 55 | vfree1 | vfree1 | vfree1 | varchar2(101) |
| 56 | vfree2 | vfree2 | vfree2 | varchar2(101) |
| 57 | vfree3 | vfree3 | vfree3 | varchar2(101) |
| 58 | vfree4 | vfree4 | vfree4 | varchar2(101) |
| 59 | vfree5 | vfree5 | vfree5 | varchar2(101) |
| 60 | vfree6 | vfree6 | vfree6 | varchar2(101) |
| 61 | vfree7 | vfree7 | vfree7 | varchar2(101) |
| 62 | vfree8 | vfree8 | vfree8 | varchar2(101) |
| 63 | vfree9 | vfree9 | vfree9 | varchar2(101) |
| 64 | vfree10 | vfree10 | vfree10 | varchar2(101) |
| 65 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 66 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |