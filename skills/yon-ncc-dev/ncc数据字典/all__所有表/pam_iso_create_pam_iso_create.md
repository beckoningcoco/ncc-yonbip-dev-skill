# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10404.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_iso_create | pk_iso_create | pk_iso_create | char(20) | √ |
| 2 | hang_up_flag | hang_up_flag | hang_up_flag | char(1) |
| 3 | lock_flag | lock_flag | lock_flag | char(1) |
| 4 | memo | memo | memo | varchar2(200) |
| 5 | operate_obj | operate_obj | operate_obj | varchar2(600) |
| 6 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_isolate_temp | pk_isolate_temp | pk_isolate_temp | char(20) | √ |
| 9 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | require_status | require_status | require_status | number(38, 0) |
| 13 | sequence_num | sequence_num | sequence_num | varchar2(50) |
| 14 | stop_elec_flag | stop_elec_flag | stop_elec_flag | char(1) |
| 15 | def1 | def1 | def1 | varchar2(101) |
| 16 | def2 | def2 | def2 | varchar2(101) |
| 17 | def3 | def3 | def3 | varchar2(101) |
| 18 | def4 | def4 | def4 | varchar2(101) |
| 19 | def5 | def5 | def5 | varchar2(101) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |