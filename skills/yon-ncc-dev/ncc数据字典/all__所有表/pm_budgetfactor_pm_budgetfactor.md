# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10546.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budgetfactor | pk_budgetfactor | pk_budgetfactor | char(20) | √ |
| 2 | bala_mny | bala_mny | bala_mny | number(28, 8) |  |  | 0 |
| 3 | budget_mny | budget_mny | budget_mny | number(28, 8) |  |  | 0 |
| 4 | exe_mny | exe_mny | exe_mny | number(28, 8) |  |  | 0 |
| 5 | float_mny | float_mny | float_mny | number(28, 8) |  |  | 0 |
| 6 | float_per | float_per | float_per | number(28, 8) |  |  | 0 |
| 7 | in_bala_mny | in_bala_mny | in_bala_mny | number(28, 8) |  |  | 0 |
| 8 | in_budget | in_budget | in_budget | number(28, 8) |  |  | 0 |
| 9 | in_exe_mny | in_exe_mny | in_exe_mny | number(28, 8) |  |  | 0 |
| 10 | in_tot_add | in_tot_add | in_tot_add | number(28, 8) |  |  | 0 |
| 11 | memo | memo | memo | varchar2(300) |
| 12 | pk_budget | pk_budget | pk_budget | char(20) | √ |
| 13 | pk_cbsnode | pk_cbsnode | pk_cbsnode | varchar2(20) |  |  | '~' |
| 14 | pk_factor | pk_factor | pk_factor | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | pre_exe_mny | pre_exe_mny | pre_exe_mny | number(28, 8) |  |  | 0 |
| 19 | pre_stage_mny | pre_stage_mny | pre_stage_mny | number(28, 8) |
| 20 | res_mny | res_mny | res_mny | number(28, 8) |  |  | 0 |
| 21 | rowno | rowno | rowno | varchar2(20) |
| 22 | src_pk_budgetadd | src_pk_budgetadd | src_pk_budgetadd | varchar2(20) |
| 23 | tot_add_mny | tot_add_mny | tot_add_mny | number(28, 8) |  |  | 0 |
| 24 | bdef1 | bdef1 | bdef1 | varchar2(101) |
| 25 | bdef2 | bdef2 | bdef2 | varchar2(101) |
| 26 | bdef3 | bdef3 | bdef3 | varchar2(101) |
| 27 | bdef4 | bdef4 | bdef4 | varchar2(101) |
| 28 | bdef5 | bdef5 | bdef5 | varchar2(101) |
| 29 | bdef6 | bdef6 | bdef6 | varchar2(101) |
| 30 | bdef7 | bdef7 | bdef7 | varchar2(101) |
| 31 | bdef8 | bdef8 | bdef8 | varchar2(101) |
| 32 | bdef9 | bdef9 | bdef9 | varchar2(101) |
| 33 | bdef10 | bdef10 | bdef10 | varchar2(101) |
| 34 | bdef11 | bdef11 | bdef11 | varchar2(101) |
| 35 | bdef12 | bdef12 | bdef12 | varchar2(101) |
| 36 | bdef13 | bdef13 | bdef13 | varchar2(101) |
| 37 | bdef14 | bdef14 | bdef14 | varchar2(101) |
| 38 | bdef15 | bdef15 | bdef15 | varchar2(101) |
| 39 | bdef16 | bdef16 | bdef16 | varchar2(101) |
| 40 | bdef17 | bdef17 | bdef17 | varchar2(101) |
| 41 | bdef18 | bdef18 | bdef18 | varchar2(101) |
| 42 | bdef19 | bdef19 | bdef19 | varchar2(101) |
| 43 | bdef20 | bdef20 | bdef20 | varchar2(101) |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |