# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8035.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_worktype | pk_worktype | pk_worktype | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |
| 3 | memo | memo | memo | varchar2(50) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 7 | pre_flag | pre_flag | pre_flag | char(1) |
| 8 | worktype_code | worktype_code | worktype_code | varchar2(40) |
| 9 | worktype_name | worktype_name | worktype_name | varchar2(120) |
| 10 | worktype_name2 | worktype_name2 | worktype_name2 | varchar2(120) |
| 11 | worktype_name3 | worktype_name3 | worktype_name3 | varchar2(120) |
| 12 | worktype_name4 | worktype_name4 | worktype_name4 | varchar2(120) |
| 13 | worktype_name5 | worktype_name5 | worktype_name5 | varchar2(120) |
| 14 | worktype_name6 | worktype_name6 | worktype_name6 | varchar2(120) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |