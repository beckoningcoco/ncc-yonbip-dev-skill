# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12613.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdps | pk_pdps | pk_pdps | char(20) | √ |
| 2 | date_scr | date_scr | date_scr | char(19) |
| 3 | desc_manu | desc_manu | desc_manu | varchar2(200) |
| 4 | desc_ord | desc_ord | desc_ord | varchar2(50) |
| 5 | dt_usage | dt_usage | dt_usage | varchar2(50) |
| 6 | dt_usagenote | dt_usagenote | dt_usagenote | varchar2(50) |
| 7 | name_psn_scr | name_psn_scr | name_psn_scr | varchar2(50) |
| 8 | pk_dept_ap | pk_dept_ap | pk_dept_ap | varchar2(20) |  |  | '~' |
| 9 | pk_dept_scr | pk_dept_scr | pk_dept_scr | varchar2(20) |  |  | '~' |
| 10 | pk_freq | pk_freq | pk_freq | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_ord | pk_ord | pk_ord | varchar2(50) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 15 | pk_psn_scr | pk_psn_scr | pk_psn_scr | varchar2(20) |  |  | '~' |
| 16 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 17 | pk_usage | pk_usage | pk_usage | varchar2(20) |  |  | '~' |
| 18 | pk_usagenote | pk_usagenote | pk_usagenote | varchar2(20) |  |  | '~' |
| 19 | scr_auto | scr_auto | scr_auto | number(38, 0) |
| 20 | scr_manu | scr_manu | scr_manu | varchar2(50) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |