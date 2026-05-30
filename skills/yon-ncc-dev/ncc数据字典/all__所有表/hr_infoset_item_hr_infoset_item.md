# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8820.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_infoset_item | pk_infoset_item | pk_infoset_item | char(20) | √ |
| 2 | accessor_classname | accessor_classname | accessor_classname | varchar2(256) |
| 3 | calculation | calculation | calculation | char(1) |
| 4 | class_id | class_id | class_id | varchar2(50) |
| 5 | custom_attr | custom_attr | custom_attr | char(1) |  |  | 'Y' |
| 6 | data_type | data_type | data_type | number(38, 0) |
| 7 | data_type_id | data_type_id | data_type_id | varchar2(50) |
| 8 | data_type_style | data_type_style | data_type_style | number(38, 0) |
| 9 | default_value | default_value | default_value | varchar2(512) |
| 10 | description | description | description | varchar2(768) |
| 11 | dynamic_flag | dynamic_flag | dynamic_flag | char(1) |
| 12 | enum_id | enum_id | enum_id | varchar2(50) |  |  | '~' |
| 13 | fixed_length | fixed_length | fixed_length | char(1) |
| 14 | help | help | help | varchar2(1536) |
| 15 | hided | hided | hided | char(1) |
| 16 | id | id | id | varchar2(50) |
| 17 | is_active | is_active | is_active | char(1) |
| 18 | is_authen | is_authen | is_authen | char(1) |
| 19 | item_code | item_code | item_code | varchar2(28) | √ |
| 20 | item_formula | item_formula | item_formula | varchar2(1500) |
| 21 | item_formula_sql | item_formula_sql | item_formula_sql | varchar2(1500) |
| 22 | item_name | item_name | item_name | varchar2(192) |
| 23 | item_name2 | item_name2 | item_name2 | varchar2(192) |
| 24 | item_name3 | item_name3 | item_name3 | varchar2(192) |
| 25 | item_name4 | item_name4 | item_name4 | varchar2(192) |
| 26 | item_name5 | item_name5 | item_name5 | varchar2(192) |
| 27 | item_name6 | item_name6 | item_name6 | varchar2(192) |
| 28 | max_length | max_length | max_length | number(38, 0) |
| 29 | max_value | max_value | max_value | varchar2(50) |
| 30 | meta_data | meta_data | meta_data | varchar2(192) |
| 31 | min_value | min_value | min_value | varchar2(50) |
| 32 | not_serialize | not_serialize | not_serialize | char(1) |
| 33 | nullable | nullable | nullable | char(1) |
| 34 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 35 | pk_infoset | pk_infoset | pk_infoset | varchar2(20) | √ |
| 36 | pk_main_item | pk_main_item | pk_main_item | varchar2(20) |  |  | '~' |
| 37 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 38 | precise | precise | precise | number(38, 0) |  |  | 4 |
| 39 | read_only | read_only | read_only | char(1) |
| 40 | ref_leaf_flag | ref_leaf_flag | ref_leaf_flag | char(1) |
| 41 | ref_model_name | ref_model_name | ref_model_name | varchar2(192) |  |  | '~' |
| 42 | resid | resid | resid | varchar2(128) |
| 43 | respath | respath | respath | varchar2(128) |
| 44 | showorder | showorder | showorder | number(38, 0) |
| 45 | sub_formula | sub_formula | sub_formula | varchar2(1500) |
| 46 | sub_formula_sql | sub_formula_sql | sub_formula_sql | varchar2(1500) |
| 47 | unique_flag | unique_flag | unique_flag | char(1) |  |  | 'N' |
| 48 | visibility | visibility | visibility | number(38, 0) |
| 49 | creationtime | creationtime | creationtime | char(19) |
| 50 | creator | creator | creator | varchar2(28) |
| 51 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 52 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 53 | modifier | modifier | modifier | varchar2(28) |
| 54 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |