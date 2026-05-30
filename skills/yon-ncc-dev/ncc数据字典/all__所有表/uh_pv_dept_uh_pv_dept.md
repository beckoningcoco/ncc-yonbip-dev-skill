# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12738.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvdept | pk_pvdept | pk_pvdept | char(20) | √ |
| 2 | date_begin | date_begin | date_begin | char(19) |
| 3 | date_end | date_end | date_end | char(19) |
| 4 | desc_patieva | desc_patieva | desc_patieva | varchar2(256) |
| 5 | dt_level_dise | dt_level_dise | dt_level_dise | varchar2(50) |
| 6 | dt_patieva | dt_patieva | dt_patieva | varchar2(50) |
| 7 | eu_deptrole | eu_deptrole | eu_deptrole | number(38, 0) |
| 8 | eu_status | eu_status | eu_status | number(38, 0) |
| 9 | flag_admit | flag_admit | flag_admit | char(1) |
| 10 | flag_borrow | flag_borrow | flag_borrow | char(1) |
| 11 | flag_discharge | flag_discharge | flag_discharge | char(1) |
| 12 | flag_maj | flag_maj | flag_maj | char(1) |
| 13 | name_psn_begin | name_psn_begin | name_psn_begin | varchar2(50) |
| 14 | name_psn_end | name_psn_end | name_psn_end | varchar2(50) |
| 15 | pk_b1bf | pk_b1bf | pk_b1bf | char(20) |
| 16 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 17 | pk_dept_ns | pk_dept_ns | pk_dept_ns | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_level_dise | pk_level_dise | pk_level_dise | varchar2(50) |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_patieva | pk_patieva | pk_patieva | varchar2(20) |  |  | '~' |
| 22 | pk_psn_begin | pk_psn_begin | pk_psn_begin | varchar2(20) |  |  | '~' |
| 23 | pk_psn_end | pk_psn_end | pk_psn_end | varchar2(20) |  |  | '~' |
| 24 | pk_pv | pk_pv | pk_pv | char(20) | √ |
| 25 | pk_pvdept_link | pk_pvdept_link | pk_pvdept_link | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |