# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11196.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_s | pk_contract_s | pk_contract_s | char(20) | √ |
| 2 | adjust_num | adjust_num | adjust_num | number(28, 8) |
| 3 | pk_contract | pk_contract | pk_contract | char(20) | √ |
| 4 | pk_contract_base | pk_contract_base | pk_contract_base | varchar2(50) |
| 5 | pk_contract_b_base_src | pk_contract_b_base_src | pk_contract_b_base_src | varchar2(20) |
| 6 | pk_contract_b_src | pk_contract_b_src | pk_contract_b_src | varchar2(20) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_marbaseclass | pk_marbaseclass | pk_marbaseclass | varchar2(20) |
| 9 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 10 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | pk_rent_unit | pk_rent_unit | pk_rent_unit | varchar2(20) |  |  | '~' |
| 14 | rent_num_comp | rent_num_comp | rent_num_comp | number(28, 8) |
| 15 | rent_num_discard | rent_num_discard | rent_num_discard | number(28, 8) |
| 16 | rent_num_in | rent_num_in | rent_num_in | number(28, 8) |
| 17 | rent_num_lost | rent_num_lost | rent_num_lost | number(28, 8) |
| 18 | rent_num_return | rent_num_return | rent_num_return | number(28, 8) |
| 19 | rent_num_stop | rent_num_stop | rent_num_stop | number(28, 8) |
| 20 | rowno_src | rowno_src | rowno_src | varchar2(30) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |