# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13031.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_formdef | pk_formdef | pk_formdef | char(20) | √ |
| 2 | formcode | formcode | formcode | varchar2(50) | √ |
| 3 | formname | formname | formname | varchar2(300) | √ |
| 4 | formname2 | formname2 | formname2 | varchar2(300) |
| 5 | formname3 | formname3 | formname3 | varchar2(300) |
| 6 | formname4 | formname4 | formname4 | varchar2(300) |
| 7 | formname5 | formname5 | formname5 | varchar2(300) |
| 8 | formname6 | formname6 | formname6 | varchar2(300) |
| 9 | pagemodle | pagemodle | pagemodle | varchar2(50) |
| 10 | pk_appnode | pk_appnode | pk_appnode | varchar2(20) |  |  | '~' |
| 11 | pk_flowtype | pk_flowtype | pk_flowtype | varchar2(20) |  |  | '~' |
| 12 | pk_formtype | pk_formtype | pk_formtype | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_word | pk_word | pk_word | varchar2(20) |  |  | '~' |
| 16 | table_name | table_name | table_name | varchar2(50) | √ |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |