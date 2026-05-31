# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10659.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_outcometype | pk_outcometype | pk_outcometype | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 3 | memo | memo | memo | varchar2(300) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | preset_flag | preset_flag | preset_flag | char(1) |  |  | 'N' |
| 7 | property | property | property | number(38, 0) | √ |
| 8 | type_code | type_code | type_code | varchar2(40) | √ |
| 9 | type_name | type_name | type_name | varchar2(300) | √ |
| 10 | type_name2 | type_name2 | type_name2 | varchar2(300) |
| 11 | type_name3 | type_name3 | type_name3 | varchar2(300) |
| 12 | type_name4 | type_name4 | type_name4 | varchar2(300) |
| 13 | type_name5 | type_name5 | type_name5 | varchar2(300) |
| 14 | type_name6 | type_name6 | type_name6 | varchar2(300) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |