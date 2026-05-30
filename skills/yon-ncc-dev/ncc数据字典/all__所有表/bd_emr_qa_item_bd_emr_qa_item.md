# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6904.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdemrqaitem | pk_bdemrqaitem | pk_bdemrqaitem | char(20) | √ |
| 2 | cmd_sql | cmd_sql | cmd_sql | varchar2(4000) |
| 3 | code | code | code | varchar2(20) |
| 4 | code_emrtemp | code_emrtemp | code_emrtemp | varchar2(50) |  |  | '~' |
| 5 | code_srv | code_srv | code_srv | varchar2(50) |
| 6 | code_wf | code_wf | code_wf | varchar2(20) |
| 7 | dt_exettype | dt_exettype | dt_exettype | varchar2(5) |
| 8 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 9 | emrtemp_name | emrtemp_name | emrtemp_name | varchar2(200) |
| 10 | eu_mark_level | eu_mark_level | eu_mark_level | number(38, 0) |
| 11 | eu_mark_mode | eu_mark_mode | eu_mark_mode | number(38, 0) |
| 12 | eu_qa_class | eu_qa_class | eu_qa_class | number(38, 0) |
| 13 | eu_qa_method | eu_qa_method | eu_qa_method | number(38, 0) |
| 14 | eu_timepoint | eu_timepoint | eu_timepoint | number(38, 0) |
| 15 | eu_timeround | eu_timeround | eu_timeround | number(38, 0) |
| 16 | ex_dura_hours | ex_dura_hours | ex_dura_hours | number(14, 2) |
| 17 | ex_interval_end_hours | ex_interval_end_hours | ex_interval_end_hours | number(14, 2) |
| 18 | ex_interval_start_hours | ex_interval_start_hours | ex_interval_start_hours | number(14, 2) |
| 19 | flag_enable | flag_enable | flag_enable | char(1) |
| 20 | name | name | name | varchar2(500) |
| 21 | pk_emrqatype | pk_emrqatype | pk_emrqatype | varchar2(20) |  |  | '~' |
| 22 | pk_emrtemp | pk_emrtemp | pk_emrtemp | varchar2(50) |
| 23 | pk_group | pk_group | pk_group | varchar2(50) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 25 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 26 | score | score | score | number(14, 2) |
| 27 | sortno | sortno | sortno | number(38, 0) |
| 28 | timeout_deduction | timeout_deduction | timeout_deduction | char(1) |
| 29 | timeout_warn_minutes | timeout_warn_minutes | timeout_warn_minutes | number(38, 0) |
| 30 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |