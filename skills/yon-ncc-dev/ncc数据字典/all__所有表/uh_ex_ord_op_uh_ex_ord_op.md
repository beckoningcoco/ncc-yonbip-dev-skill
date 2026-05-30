# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12596.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordop | pk_ordop | pk_ordop | char(20) | √ |
| 2 | code_apply | code_apply | code_apply | varchar2(30) |
| 3 | code_pres | code_pres | code_pres | varchar2(30) |
| 4 | date_begin | date_begin | date_begin | char(19) |
| 5 | date_canc | date_canc | date_canc | char(19) |
| 6 | date_chk | date_chk | date_chk | char(19) |
| 7 | date_entry | date_entry | date_entry | char(19) |
| 8 | date_exec | date_exec | date_exec | char(19) |
| 9 | date_sign | date_sign | date_sign | char(19) |
| 10 | date_stop | date_stop | date_stop | char(19) |
| 11 | days_ord | days_ord | days_ord | number(38, 0) |
| 12 | desc_ord | desc_ord | desc_ord | varchar2(256) |
| 13 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 14 | dt_usage | dt_usage | dt_usage | varchar2(50) |
| 15 | flag_canc | flag_canc | flag_canc | char(1) |
| 16 | flag_chk | flag_chk | flag_chk | char(1) |
| 17 | flag_exec | flag_exec | flag_exec | char(1) |
| 18 | flag_pres | flag_pres | flag_pres | char(1) |
| 19 | flag_self | flag_self | flag_self | char(1) |
| 20 | flag_sign | flag_sign | flag_sign | char(1) |
| 21 | flag_srvset | flag_srvset | flag_srvset | char(1) |
| 22 | flag_stop | flag_stop | flag_stop | char(1) |
| 23 | groupno | groupno | groupno | varchar2(30) |
| 24 | name_ord | name_ord | name_ord | varchar2(50) |
| 25 | name_psn_canc | name_psn_canc | name_psn_canc | varchar2(50) |
| 26 | name_psn_chk | name_psn_chk | name_psn_chk | varchar2(50) |
| 27 | name_psn_phy | name_psn_phy | name_psn_phy | varchar2(50) |
| 28 | name_psn_stop | name_psn_stop | name_psn_stop | varchar2(50) |
| 29 | note | note | note | varchar2(256) |
| 30 | pk_freq | pk_freq | pk_freq | varchar2(20) |  |  | '~' |
| 31 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 32 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 33 | pk_pres | pk_pres | pk_pres | varchar2(50) |  |  | '~' |
| 34 | pk_psn_canc | pk_psn_canc | pk_psn_canc | varchar2(20) |  |  | '~' |
| 35 | pk_psn_chk | pk_psn_chk | pk_psn_chk | varchar2(20) |  |  | '~' |
| 36 | pk_psn_phy | pk_psn_phy | pk_psn_phy | varchar2(20) |  |  | '~' |
| 37 | pk_psn_stop | pk_psn_stop | pk_psn_stop | varchar2(20) |  |  | '~' |
| 38 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 39 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(50) |  |  | '~' |
| 40 | pk_usage | pk_usage | pk_usage | varchar2(20) |  |  | '~' |
| 41 | pk_usagenote | pk_usagenote | pk_usagenote | varchar2(20) |  |  | '~' |
| 42 | price | price | price | number(14, 2) |
| 43 | quan | quan | quan | number(14, 2) |
| 44 | sortno | sortno | sortno | number(38, 0) |
| 45 | unit | unit | unit | varchar2(50) |
| 46 | usagenote | usagenote | usagenote | varchar2(50) |
| 47 | creationtime | creationtime | creationtime | char(19) |
| 48 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 49 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 50 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 51 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 52 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |