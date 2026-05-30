# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6900.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_editor | pk_editor | pk_editor | char(20) | √ |
| 2 | code_editor | code_editor | code_editor | varchar2(20) |
| 3 | eu_editor | eu_editor | eu_editor | number(38, 0) |
| 4 | func_editor | func_editor | func_editor | varchar2(256) |
| 5 | func_edtor_argu | func_edtor_argu | func_edtor_argu | varchar2(256) |
| 6 | name_editor | name_editor | name_editor | varchar2(4000) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |