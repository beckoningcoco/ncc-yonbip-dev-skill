# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12502.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnnewborn | pk_cnnewborn | pk_cnnewborn | char(20) | √ |
| 2 | addr | addr | addr | varchar2(256) |
| 3 | birthidno | birthidno | birthidno | varchar2(50) |
| 4 | date_birth | date_birth | date_birth | char(19) |
| 5 | dt_delimode | dt_delimode | dt_delimode | varchar2(50) |
| 6 | dt_deliret | dt_deliret | dt_deliret | varchar2(50) |
| 7 | dt_idtye_father | dt_idtye_father | dt_idtye_father | varchar2(50) |
| 8 | dt_nation_father | dt_nation_father | dt_nation_father | varchar2(50) |
| 9 | dt_newbb_health | dt_newbb_health | dt_newbb_health | varchar2(50) |
| 10 | dt_region_city | dt_region_city | dt_region_city | varchar2(20) |  |  | '~' |
| 11 | dt_region_contry_father | dt_region_contry_father | dt_region_contry_father | varchar2(20) |  |  | '~' |
| 12 | dt_region_dist | dt_region_dist | dt_region_dist | varchar2(20) |  |  | '~' |
| 13 | dt_region_prov | dt_region_prov | dt_region_prov | varchar2(50) |
| 14 | entrydate | entrydate | entrydate | char(19) |
| 15 | fatherage | fatherage | fatherage | number(38, 0) |
| 16 | fatheridno | fatheridno | fatheridno | varchar2(50) |
| 17 | fathername | fathername | fathername | varchar2(50) |
| 18 | fathernation | fathernation | fathernation | varchar2(20) |  |  | '~' |
| 19 | flag_admit | flag_admit | flag_admit | char(1) |
| 20 | flag_pi | flag_pi | flag_pi | char(1) |
| 21 | gestation | gestation | gestation | number(14, 2) |
| 22 | height | height | height | number(14, 2) |
| 23 | name_bb | name_bb | name_bb | varchar2(256) |
| 24 | no_bb | no_bb | no_bb | number(38, 0) |
| 25 | pk_cnet | pk_cnet | pk_cnet | varchar2(20) |  |  | '~' |
| 26 | pk_delimode | pk_delimode | pk_delimode | varchar2(20) |  |  | '~' |
| 27 | pk_deliret | pk_deliret | pk_deliret | varchar2(20) |  |  | '~' |
| 28 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 29 | pk_idtype_father | pk_idtype_father | pk_idtype_father | varchar2(20) |  |  | '~' |
| 30 | pk_newbb_health | pk_newbb_health | pk_newbb_health | varchar2(20) |  |  | '~' |
| 31 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 32 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 33 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 34 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 35 | pk_pv_mother | pk_pv_mother | pk_pv_mother | varchar2(20) |  |  | '~' |
| 36 | pk_pv_newborn | pk_pv_newborn | pk_pv_newborn | varchar2(20) |  |  | '~' |
| 37 | pk_region_prov | pk_region_prov | pk_region_prov | varchar2(20) |  |  | '~' |
| 38 | weight | weight | weight | number(14, 2) |
| 39 | creationtime | creationtime | creationtime | char(19) |
| 40 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 41 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 42 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 43 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 44 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |