# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8819.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_infoset | pk_infoset | pk_infoset | char(20) | √ |
| 2 | infoset_code | infoset_code | infoset_code | varchar2(128) |
| 3 | infoset_name | infoset_name | infoset_name | varchar2(192) |
| 4 | infoset_name2 | infoset_name2 | infoset_name2 | varchar2(192) |
| 5 | infoset_name3 | infoset_name3 | infoset_name3 | varchar2(192) |
| 6 | infoset_name4 | infoset_name4 | infoset_name4 | varchar2(192) |
| 7 | infoset_name5 | infoset_name5 | infoset_name5 | varchar2(192) |
| 8 | infoset_name6 | infoset_name6 | infoset_name6 | varchar2(192) |
| 9 | infoset_type | infoset_type | infoset_type | number(38, 0) |
| 10 | look_history_flag | look_history_flag | look_history_flag | char(1) |
| 11 | main_table_flag | main_table_flag | main_table_flag | char(1) |  |  | 'N' |
| 12 | memo | memo | memo | varchar2(1536) |
| 13 | meta_data | meta_data | meta_data | varchar2(128) |
| 14 | meta_data_id | meta_data_id | meta_data_id | varchar2(128) |  |  | '~' |
| 15 | pk_field_code | pk_field_code | pk_field_code | varchar2(128) |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_infoset_sort | pk_infoset_sort | pk_infoset_sort | varchar2(20) | √ |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | record_character | record_character | record_character | number(38, 0) |  |  | 0 |
| 20 | resid | resid | resid | varchar2(128) |
| 21 | respath | respath | respath | varchar2(128) |
| 22 | showorder | showorder | showorder | number(38, 0) |
| 23 | sync_main_code | sync_main_code | sync_main_code | varchar2(28) |
| 24 | sync_main_table | sync_main_table | sync_main_table | char(1) |
| 25 | table_code | table_code | table_code | varchar2(128) |
| 26 | user_def_flag | user_def_flag | user_def_flag | char(1) |  |  | 'Y' |
| 27 | vo_class_name | vo_class_name | vo_class_name | varchar2(128) |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |