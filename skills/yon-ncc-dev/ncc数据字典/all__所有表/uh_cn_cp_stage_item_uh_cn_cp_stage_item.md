# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12446.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_item | pk_item | pk_item | char(20) | √ |
| 2 | item_sn | item_sn | item_sn | varchar2(50) |
| 3 | name_item | name_item | name_item | varchar2(200) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 5 | pk_org | pk_org | pk_org | char(20) | √ |
| 6 | pk_stage | pk_stage | pk_stage | char(20) | √ |
| 7 | print_show | print_show | print_show | char(1) |
| 8 | prop_exe | prop_exe | prop_exe | number(38, 0) |
| 9 | prop_select | prop_select | prop_select | number(38, 0) |
| 10 | type_action | type_action | type_action | number(38, 0) |
| 11 | type_item | type_item | type_item | number(38, 0) |
| 12 | type_ord | type_ord | type_ord | number(38, 0) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |