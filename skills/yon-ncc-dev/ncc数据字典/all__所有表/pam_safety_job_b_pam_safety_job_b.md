# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10444.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_safe_job_b | pk_safe_job_b | pk_safe_job_b | char(20) | √ |
| 2 | isolate_flag | isolate_flag | isolate_flag | char(1) |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |
| 5 | pk_isolate_temp | pk_isolate_temp | pk_isolate_temp | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 8 | pk_precaution | pk_precaution | pk_precaution | varchar2(20) |  |  | '~' |
| 9 | pk_saftey_job | pk_saftey_job | pk_saftey_job | char(20) | √ |
| 10 | precaution_name | precaution_name | precaution_name | varchar2(80) |
| 11 | precaution_name2 | precaution_name2 | precaution_name2 | varchar2(80) |
| 12 | precaution_name3 | precaution_name3 | precaution_name3 | varchar2(80) |
| 13 | precaution_name4 | precaution_name4 | precaution_name4 | varchar2(80) |
| 14 | precaution_name5 | precaution_name5 | precaution_name5 | varchar2(80) |
| 15 | precaution_name6 | precaution_name6 | precaution_name6 | varchar2(80) |
| 16 | preventive | preventive | preventive | varchar2(1024) |
| 17 | risk_type | risk_type | risk_type | varchar2(30) |
| 18 | def1 | def1 | def1 | varchar2(101) |
| 19 | def2 | def2 | def2 | varchar2(101) |
| 20 | def3 | def3 | def3 | varchar2(101) |
| 21 | def4 | def4 | def4 | varchar2(101) |
| 22 | def5 | def5 | def5 | varchar2(101) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |