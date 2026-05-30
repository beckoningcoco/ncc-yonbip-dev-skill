# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6478.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_evaluate_d | pk_evaluate_d | pk_evaluate_d | char(20) | √ |
| 2 | adjustment_rentnotax | adjustment_rentnotax | adjustment_rentnotax | number(28, 8) |
| 3 | adjustment_rentnotax_global | adjustment_rentnotax_global | adjustment_rentnotax_global | number(28, 8) |
| 4 | adjustment_rentnotax_group | adjustment_rentnotax_group | adjustment_rentnotax_group | number(28, 8) |
| 5 | adjustment_rentnotax_org | adjustment_rentnotax_org | adjustment_rentnotax_org | number(28, 8) |
| 6 | adjustment_renttax | adjustment_renttax | adjustment_renttax | number(28, 8) |
| 7 | adjustment_renttax_global | adjustment_renttax_global | adjustment_renttax_global | number(28, 8) |
| 8 | adjustment_renttax_group | adjustment_renttax_group | adjustment_renttax_group | number(28, 8) |
| 9 | adjustment_renttax_org | adjustment_renttax_org | adjustment_renttax_org | number(28, 8) |
| 10 | adjustment_tax | adjustment_tax | adjustment_tax | number(28, 8) |
| 11 | adjustment_tax_global | adjustment_tax_global | adjustment_tax_global | number(28, 8) |
| 12 | adjustment_tax_group | adjustment_tax_group | adjustment_tax_group | number(28, 8) |
| 13 | adjustment_tax_org | adjustment_tax_org | adjustment_tax_org | number(28, 8) |
| 14 | amount_type | amount_type | amount_type | number(38, 0) |
| 15 | calculate_rentnotax | calculate_rentnotax | calculate_rentnotax | number(28, 8) |
| 16 | calculate_rentnotax_global | calculate_rentnotax_global | calculate_rentnotax_global | number(28, 8) |
| 17 | calculate_rentnotax_group | calculate_rentnotax_group | calculate_rentnotax_group | number(28, 8) |
| 18 | calculate_rentnotax_org | calculate_rentnotax_org | calculate_rentnotax_org | number(28, 8) |
| 19 | calculate_renttax | calculate_renttax | calculate_renttax | number(28, 8) |
| 20 | calculate_renttax_global | calculate_renttax_global | calculate_renttax_global | number(28, 8) |
| 21 | calculate_renttax_group | calculate_renttax_group | calculate_renttax_group | number(28, 8) |
| 22 | calculate_renttax_org | calculate_renttax_org | calculate_renttax_org | number(28, 8) |
| 23 | calculate_tax | calculate_tax | calculate_tax | number(28, 8) |
| 24 | calculate_tax_global | calculate_tax_global | calculate_tax_global | number(28, 8) |
| 25 | calculate_tax_group | calculate_tax_group | calculate_tax_group | number(28, 8) |
| 26 | calculate_tax_org | calculate_tax_org | calculate_tax_org | number(28, 8) |
| 27 | end_date | end_date | end_date | char(19) |
| 28 | incomplete_period_day | incomplete_period_day | incomplete_period_day | number(38, 0) |
| 29 | is_renewal_flag | is_renewal_flag | is_renewal_flag | char(1) |
| 30 | memo | memo | memo | varchar2(50) |
| 31 | nocalculate | nocalculate | nocalculate | char(1) |
| 32 | period_num | period_num | period_num | number(38, 0) |
| 33 | pk_evaluate | pk_evaluate | pk_evaluate | char(20) | √ |
| 34 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 35 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 36 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 37 | pre_rent | pre_rent | pre_rent | number(28, 8) |
| 38 | pre_rent_notax | pre_rent_notax | pre_rent_notax | number(28, 8) |
| 39 | renewal_flag | renewal_flag | renewal_flag | char(1) |
| 40 | rent_day | rent_day | rent_day | number(28, 8) |
| 41 | rent_daynotax | rent_daynotax | rent_daynotax | number(28, 8) |
| 42 | rent_daynotax_org | rent_daynotax_org | rent_daynotax_org | number(28, 8) |
| 43 | rent_day_org | rent_day_org | rent_day_org | number(28, 8) |
| 44 | rowno | rowno | rowno | varchar2(50) |
| 45 | start_date | start_date | start_date | char(19) |
| 46 | subsection_type | subsection_type | subsection_type | varchar2(50) |
| 47 | use_calculate_rentnotax | use_calculate_rentnotax | use_calculate_rentnotax | number(28, 8) |
| 48 | use_calculate_renttax | use_calculate_renttax | use_calculate_renttax | number(28, 8) |
| 49 | use_calculate_tax | use_calculate_tax | use_calculate_tax | number(28, 8) |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |