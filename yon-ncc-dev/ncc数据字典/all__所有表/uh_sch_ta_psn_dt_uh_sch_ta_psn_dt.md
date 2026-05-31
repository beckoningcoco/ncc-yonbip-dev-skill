# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12795.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tapsndt | pk_tapsndt | pk_tapsndt | char(20) | √ |
| 2 | date_ta | date_ta | date_ta | char(19) |
| 3 | desc_schtars | desc_schtars | desc_schtars | varchar2(200) |
| 4 | dt_schtars | dt_schtars | dt_schtars | varchar2(200) |
| 5 | dt_schtatype | dt_schtatype | dt_schtatype | varchar2(50) |
| 6 | dt_schtatype_plan | dt_schtatype_plan | dt_schtatype_plan | varchar2(50) |
| 7 | eu_tapsn_plan | eu_tapsn_plan | eu_tapsn_plan | number(38, 0) |
| 8 | eu_tapsn_sch | eu_tapsn_sch | eu_tapsn_sch | number(38, 0) |
| 9 | flag_fin | flag_fin | flag_fin | char(1) |
| 10 | flag_nomach | flag_nomach | flag_nomach | char(1) |
| 11 | flag_talock | flag_talock | flag_talock | char(1) |
| 12 | name_schtatype | name_schtatype | name_schtatype | varchar2(50) |
| 13 | name_schtatype_plan | name_schtatype_plan | name_schtatype_plan | varchar2(50) |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 17 | pk_schtatype | pk_schtatype | pk_schtatype | char(20) |
| 18 | pk_schtatype_plan | pk_schtatype_plan | pk_schtatype_plan | char(20) |
| 19 | pk_tadpweek | pk_tadpweek | pk_tadpweek | varchar2(20) |  |  | '~' |
| 20 | pk_tapsn | pk_tapsn | pk_tapsn | varchar2(50) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |