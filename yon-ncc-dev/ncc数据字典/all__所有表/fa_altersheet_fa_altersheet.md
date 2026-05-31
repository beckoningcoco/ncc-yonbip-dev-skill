# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8095.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_altersheet | pk_altersheet | pk_altersheet | char(20) | √ |
| 2 | altertype | altertype | altertype | number(38, 0) |
| 3 | differ | differ | differ | number(28, 8) |
| 4 | item_code | item_code | item_code | varchar2(50) |
| 5 | local_differ | local_differ | local_differ | number(28, 8) |
| 6 | new_content | new_content | new_content | varchar2(50) |
| 7 | new_content_global | new_content_global | new_content_global | varchar2(50) |
| 8 | new_content_group | new_content_group | new_content_group | varchar2(50) |
| 9 | new_value | new_value | new_value | varchar2(50) |
| 10 | old_content | old_content | old_content | varchar2(50) |
| 11 | old_content_global | old_content_global | old_content_global | varchar2(50) |
| 12 | old_content_group | old_content_group | old_content_group | varchar2(50) |
| 13 | old_value | old_value | old_value | varchar2(50) |
| 14 | pk_alter | pk_alter | pk_alter | varchar2(20) |
| 15 | pk_alter_b | pk_alter_b | pk_alter_b | char(20) | √ |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |