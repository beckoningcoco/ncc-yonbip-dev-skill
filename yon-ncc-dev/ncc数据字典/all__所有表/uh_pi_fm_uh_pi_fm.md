# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12708.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patifm | pk_patifm | pk_patifm | char(20) | √ |
| 2 | addr | addr | addr | varchar2(256) |
| 3 | code | code | code | varchar2(30) |
| 4 | date_create | date_create | date_create | char(19) |
| 5 | dt_city | dt_city | dt_city | varchar2(50) |
| 6 | dt_county | dt_county | dt_county | varchar2(50) |
| 7 | dt_fm_kcfantype | dt_fm_kcfantype | dt_fm_kcfantype | varchar2(50) |  |  | '~' |
| 8 | dt_fm_kcfueltype | dt_fm_kcfueltype | dt_fm_kcfueltype | varchar2(50) |  |  | '~' |
| 9 | dt_fm_livestocktype | dt_fm_livestocktype | dt_fm_livestocktype | varchar2(50) |  |  | '~' |
| 10 | dt_fm_watertype | dt_fm_watertype | dt_fm_watertype | varchar2(50) |  |  | '~' |
| 11 | dt_fm_wctype | dt_fm_wctype | dt_fm_wctype | varchar2(50) |  |  | '~' |
| 12 | dt_province | dt_province | dt_province | varchar2(50) |
| 13 | dt_status_pifm | dt_status_pifm | dt_status_pifm | varchar2(50) |
| 14 | dt_town | dt_town | dt_town | varchar2(50) |
| 15 | dt_village | dt_village | dt_village | varchar2(50) |
| 16 | flag_fm_kcfan | flag_fm_kcfan | flag_fm_kcfan | char(1) |
| 17 | houseno | houseno | houseno | varchar2(50) |
| 18 | livearea | livearea | livearea | number(38, 0) |
| 19 | name | name | name | varchar2(50) |
| 20 | name_city | name_city | name_city | varchar2(50) |
| 21 | name_county | name_county | name_county | varchar2(50) |
| 22 | name_dept_mana | name_dept_mana | name_dept_mana | varchar2(50) |
| 23 | name_org_create | name_org_create | name_org_create | varchar2(50) |
| 24 | name_org_mana | name_org_mana | name_org_mana | varchar2(50) |
| 25 | name_province | name_province | name_province | varchar2(50) |
| 26 | name_psn_create | name_psn_create | name_psn_create | varchar2(50) |
| 27 | name_psn_phy | name_psn_phy | name_psn_phy | varchar2(50) |
| 28 | name_town | name_town | name_town | varchar2(50) |
| 29 | name_village | name_village | name_village | varchar2(50) |
| 30 | note | note | note | varchar2(256) |
| 31 | peoples | peoples | peoples | number(38, 0) |
| 32 | pk_city | pk_city | pk_city | varchar2(20) |  |  | '~' |
| 33 | pk_county | pk_county | pk_county | varchar2(20) |  |  | '~' |
| 34 | pk_dept_mana | pk_dept_mana | pk_dept_mana | varchar2(20) |  |  | '~' |
| 35 | pk_fm_kcfantype | pk_fm_kcfantype | pk_fm_kcfantype | varchar2(20) |  |  | '~' |
| 36 | pk_fm_kcfueltype | pk_fm_kcfueltype | pk_fm_kcfueltype | varchar2(20) |  |  | '~' |
| 37 | pk_fm_livestocktype | pk_fm_livestocktype | pk_fm_livestocktype | varchar2(20) |  |  | '~' |
| 38 | pk_fm_watertype | pk_fm_watertype | pk_fm_watertype | varchar2(20) |  |  | '~' |
| 39 | pk_fm_wctype | pk_fm_wctype | pk_fm_wctype | varchar2(20) |  |  | '~' |
| 40 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 41 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 42 | pk_org_create | pk_org_create | pk_org_create | varchar2(20) |  |  | '~' |
| 43 | pk_org_mana | pk_org_mana | pk_org_mana | varchar2(20) |  |  | '~' |
| 44 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 45 | pk_province | pk_province | pk_province | varchar2(20) |  |  | '~' |
| 46 | pk_psn_create | pk_psn_create | pk_psn_create | varchar2(20) |  |  | '~' |
| 47 | pk_psn_phy | pk_psn_phy | pk_psn_phy | varchar2(20) |  |  | '~' |
| 48 | pk_status_pifm | pk_status_pifm | pk_status_pifm | char(20) |
| 49 | postcode | postcode | postcode | varchar2(50) |
| 50 | creationtime | creationtime | creationtime | char(19) |
| 51 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 52 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 53 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 54 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 55 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |