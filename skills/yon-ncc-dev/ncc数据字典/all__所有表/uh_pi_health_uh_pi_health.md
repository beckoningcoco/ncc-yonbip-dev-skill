# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12711.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patihealth | pk_patihealth | pk_patihealth | char(20) | √ |
| 2 | dt_blood_abo | dt_blood_abo | dt_blood_abo | varchar2(50) |
| 3 | dt_blood_rh | dt_blood_rh | dt_blood_rh | varchar2(50) |
| 4 | pk_blood_abo | pk_blood_abo | pk_blood_abo | varchar2(20) |  |  | '~' |
| 5 | pk_blood_rh | pk_blood_rh | pk_blood_rh | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |