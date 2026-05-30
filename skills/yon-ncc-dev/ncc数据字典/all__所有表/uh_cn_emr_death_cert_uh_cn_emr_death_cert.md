# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12471.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | addr_city | addr_city | addr_city | varchar2(50) |
| 2 | addr_country | addr_country | addr_country | varchar2(50) |
| 3 | addr_ct | addr_ct | addr_ct | varchar2(256) |
| 4 | addr_prov | addr_prov | addr_prov | varchar2(50) |
| 5 | addr_regi_city | addr_regi_city | addr_regi_city | varchar2(200) |
| 6 | addr_regi_county | addr_regi_county | addr_regi_county | varchar2(200) |
| 7 | addr_regi_detail | addr_regi_detail | addr_regi_detail | varchar2(50) |
| 8 | addr_regi_prov | addr_regi_prov | addr_regi_prov | varchar2(200) |
| 9 | addr_resi_city | addr_resi_city | addr_resi_city | varchar2(200) |
| 10 | addr_resi_county | addr_resi_county | addr_resi_county | varchar2(200) |
| 11 | addr_resi_detail | addr_resi_detail | addr_resi_detail | varchar2(50) |
| 12 | addr_resi_prov | addr_resi_prov | addr_resi_prov | varchar2(200) |
| 13 | age_day | age_day | age_day | number(38, 0) |
| 14 | age_month | age_month | age_month | number(38, 0) |
| 15 | age_year | age_year | age_year | number(38, 0) |
| 16 | area_num | area_num | area_num | varchar2(50) |
| 17 | code_cert | code_cert | code_cert | varchar2(50) |
| 18 | code_diag | code_diag | code_diag | varchar2(20) |
| 19 | code_fp | code_fp | code_fp | varchar2(50) |
| 20 | date_birth | date_birth | date_birth | char(19) |
| 21 | date_death | date_death | date_death | char(19) |
| 22 | dt_diag_high_meth | dt_diag_high_meth | dt_diag_high_meth | varchar2(20) |
| 23 | dt_diag_high_org | dt_diag_high_org | dt_diag_high_org | varchar2(20) |
| 24 | dt_edu | dt_edu | dt_edu | varchar2(20) |
| 25 | dt_idtype | dt_idtype | dt_idtype | varchar2(20) |
| 26 | dt_location_death | dt_location_death | dt_location_death | varchar2(20) |
| 27 | dt_mari | dt_mari | dt_mari | varchar2(20) |
| 28 | dt_nation | dt_nation | dt_nation | varchar2(20) |
| 29 | dt_occu | dt_occu | dt_occu | varchar2(20) |
| 30 | dt_region_regi | dt_region_regi | dt_region_regi | varchar2(20) |
| 31 | dt_region_resi | dt_region_resi | dt_region_resi | varchar2(20) |
| 32 | dt_sex | dt_sex | dt_sex | varchar2(20) |
| 33 | flag_examine | flag_examine | flag_examine | char(1) |
| 34 | flag_pregnancy_or_end42day | flag_pregnancy_or_end42day | flag_pregnancy_or_end42day | char(2) |
| 35 | idno | idno | idno | varchar2(30) |
| 36 | name_ct | name_ct | name_ct | varchar2(50) |
| 37 | name_diag_high_meth | name_diag_high_meth | name_diag_high_meth | varchar2(50) |
| 38 | name_diag_high_org | name_diag_high_org | name_diag_high_org | varchar2(50) |
| 39 | name_edu | name_edu | name_edu | varchar2(50) |
| 40 | name_location_death | name_location_death | name_location_death | varchar2(50) |
| 41 | name_mari | name_mari | name_mari | varchar2(50) |
| 42 | name_nation | name_nation | name_nation | varchar2(50) |
| 43 | name_occu | name_occu | name_occu | varchar2(50) |
| 44 | name_sex | name_sex | name_sex | varchar2(50) |
| 45 | nation | nation | nation | varchar2(50) |
| 46 | paticode | paticode | paticode | varchar2(50) |
| 47 | patiname | patiname | patiname | varchar2(50) |
| 48 | phone_ct | phone_ct | phone_ct | varchar2(20) |
| 49 | pk_dept | pk_dept | pk_dept | char(20) |
| 50 | pk_emr | pk_emr | pk_emr | char(20) |
| 51 | pk_group | pk_group | pk_group | char(20) |
| 52 | pk_org | pk_org | pk_org | char(20) |
| 53 | pk_pati | pk_pati | pk_pati | char(20) |
| 54 | pk_pv | pk_pv | pk_pv | char(20) |
| 55 | pk_uhcnemrdeathcert | pk_uhcnemrdeathcert | pk_uhcnemrdeathcert | char(20) | √ |
| 56 | report_docname | report_docname | report_docname | varchar2(10) |
| 57 | report_pkdoc | report_pkdoc | report_pkdoc | varchar2(10) |
| 58 | report_result | report_result | report_result | varchar2(10) |
| 59 | report_time | report_time | report_time | varchar2(50) |
| 60 | root_death_cause | root_death_cause | root_death_cause | varchar2(256) |
| 61 | sortno | sortno | sortno | number(38, 0) |
| 62 | work_unit | work_unit | work_unit | varchar2(256) |
| 63 | creationtime | creationtime | creationtime | char(19) |
| 64 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 65 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |