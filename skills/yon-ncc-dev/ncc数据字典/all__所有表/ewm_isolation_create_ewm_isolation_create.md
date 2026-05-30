# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8002.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_iso_create | pk_iso_create | pk_iso_create | char(20) | √ |
| 2 | hang_up_flag | hang_up_flag | hang_up_flag | char(1) |
| 3 | lock_flag | lock_flag | lock_flag | char(1) |
| 4 | memo | memo | memo | varchar2(200) |
| 5 | operate_obj | operate_obj | operate_obj | varchar2(600) |
| 6 | operate_time | operate_time | operate_time | char(19) |
| 7 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_isolation | pk_isolation | pk_isolation | char(20) | √ |
| 10 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 11 | pk_manager | pk_manager | pk_manager | varchar2(20) |  |  | '~' |
| 12 | pk_mandept | pk_mandept | pk_mandept | varchar2(20) |  |  | '~' |
| 13 | pk_operator | pk_operator | pk_operator | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 16 | pk_ownerorg | pk_ownerorg | pk_ownerorg | varchar2(20) |  |  | '~' |
| 17 | pk_usedept | pk_usedept | pk_usedept | varchar2(20) |  |  | '~' |
| 18 | pk_usedorg | pk_usedorg | pk_usedorg | varchar2(20) |  |  | '~' |
| 19 | pk_usedunit | pk_usedunit | pk_usedunit | varchar2(20) |  |  | '~' |
| 20 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 21 | require_status | require_status | require_status | number(38, 0) |
| 22 | sequence_num | sequence_num | sequence_num | varchar2(50) |
| 23 | stop_elec_flag | stop_elec_flag | stop_elec_flag | char(1) |
| 24 | def1 | def1 | def1 | varchar2(101) |
| 25 | def2 | def2 | def2 | varchar2(101) |
| 26 | def3 | def3 | def3 | varchar2(101) |
| 27 | def4 | def4 | def4 | varchar2(101) |
| 28 | def5 | def5 | def5 | varchar2(101) |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |