# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10977.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | consult_code | consult_code | consult_code | varchar2(1024) | √ |  | '-99' |
| 3 | data_type | data_type | data_type | number(38, 0) | √ |  | 1 |
| 4 | disp_sequence | disp_sequence | disp_sequence | number(38, 0) | √ |  | 0 |
| 5 | disp_type | disp_type | disp_type | number(38, 0) | √ |  | 0 |
| 6 | disp_value | disp_value | disp_value | varchar2(50) |
| 7 | ext1 | ext1 | ext1 | varchar2(250) |
| 8 | ext2 | ext2 | ext2 | varchar2(250) |
| 9 | ext3 | ext3 | ext3 | varchar2(250) |
| 10 | ext4 | ext4 | ext4 | varchar2(250) |
| 11 | ext5 | ext5 | ext5 | varchar2(250) |
| 12 | field_code | field_code | field_code | varchar2(100) | √ |
| 13 | field_name | field_name | field_name | varchar2(150) |
| 14 | guideline | guideline | guideline | varchar2(1024) |
| 15 | if_attrrefused | if_attrrefused | if_attrrefused | char(1) | √ |
| 16 | if_autocheck | if_autocheck | if_autocheck | char(1) | √ |  | 'N' |
| 17 | if_datapower | if_datapower | if_datapower | char(1) |
| 18 | if_default | if_default | if_default | char(1) | √ |  | 'N' |
| 19 | if_desc | if_desc | if_desc | char(1) |
| 20 | if_group | if_group | if_group | char(1) | √ |  | 'N' |
| 21 | if_immobility | if_immobility | if_immobility | char(1) | √ |  | 'N' |
| 22 | if_multicorpref | if_multicorpref | if_multicorpref | char(1) |
| 23 | if_must | if_must | if_must | char(1) | √ |  | 'N' |
| 24 | if_notmdcondition | if_notmdcondition | if_notmdcondition | char(1) |
| 25 | if_order | if_order | if_order | char(1) | √ |  | 'N' |
| 26 | if_subincluded | if_subincluded | if_subincluded | char(1) | √ |
| 27 | if_sum | if_sum | if_sum | char(1) | √ |  | 'N' |
| 28 | if_sysfuncrefused | if_sysfuncrefused | if_sysfuncrefused | char(1) | √ |
| 29 | if_used | if_used | if_used | char(1) | √ |  | 'Y' |
| 30 | instrumentsql | instrumentsql | instrumentsql | varchar2(4000) |
| 31 | iscondition | iscondition | iscondition | char(1) |  |  | 'Y' |
| 32 | limits | limits | limits | number(38, 0) |
| 33 | max_length | max_length | max_length | number(38, 0) |
| 34 | opera_code | opera_code | opera_code | varchar2(50) | √ |
| 35 | opera_name | opera_name | opera_name | varchar2(150) | √ |
| 36 | order_sequence | order_sequence | order_sequence | number(38, 0) | √ |  | 0 |
| 37 | pk_corp | pk_corp | pk_corp | varchar2(20) | √ |
| 38 | pk_templet | pk_templet | pk_templet | varchar2(20) | √ |
| 39 | prerestrict | prerestrict | prerestrict | varchar2(1024) |
| 40 | resid | resid | resid | varchar2(30) |
| 41 | return_type | return_type | return_type | number(38, 0) | √ |  | 0 |
| 42 | table_code | table_code | table_code | varchar2(100) |
| 43 | table_name | table_name | table_name | varchar2(75) |
| 44 | userdefflag | userdefflag | userdefflag | char(1) |
| 45 | value | value | value | varchar2(400) |
| 46 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 47 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |