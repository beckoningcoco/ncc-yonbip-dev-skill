# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10405.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_iso_reback | pk_iso_reback | pk_iso_reback | char(20) | √ |
| 2 | memo | memo | memo | varchar2(200) |
| 3 | operate_obj | operate_obj | operate_obj | varchar2(600) |
| 4 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_isolate_temp | pk_isolate_temp | pk_isolate_temp | char(20) | √ |
| 7 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 10 | require_status | require_status | require_status | number(38, 0) |
| 11 | sequence_num | sequence_num | sequence_num | varchar2(50) |
| 12 | stop_elec_flag | stop_elec_flag | stop_elec_flag | char(1) |
| 13 | def1 | def1 | def1 | varchar2(101) |
| 14 | def2 | def2 | def2 | varchar2(101) |
| 15 | def3 | def3 | def3 | varchar2(101) |
| 16 | def4 | def4 | def4 | varchar2(101) |
| 17 | def5 | def5 | def5 | varchar2(101) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |