# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12333.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schema | pk_schema | pk_schema | char(20) | √ |
| 2 | isdefault | isdefault | isdefault | char(1) |
| 3 | pk_funcnode | pk_funcnode | pk_funcnode | char(20) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | schematype | schematype | schematype | number(38, 0) |  |  | 0 |
| 7 | schema_code | schema_code | schema_code | varchar2(200) |
| 8 | schema_desc | schema_desc | schema_desc | varchar2(1024) |
| 9 | schema_name | schema_name | schema_name | varchar2(200) |
| 10 | schema_name2 | schema_name2 | schema_name2 | varchar2(200) |
| 11 | schema_name3 | schema_name3 | schema_name3 | varchar2(200) |
| 12 | schema_name4 | schema_name4 | schema_name4 | varchar2(200) |
| 13 | schema_name5 | schema_name5 | schema_name5 | varchar2(200) |
| 14 | schema_name6 | schema_name6 | schema_name6 | varchar2(200) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |