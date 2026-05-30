# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9635.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datadic | pk_datadic | pk_datadic | char(20) | √ |
| 2 | childname | childname | childname | varchar2(50) |
| 3 | code | code | code | varchar2(50) |
| 4 | datatype | datatype | datatype | number(38, 0) |
| 5 | fieldtablename | fieldtablename | fieldtablename | varchar2(50) |
| 6 | name | name | name | varchar2(50) |
| 7 | parentname | parentname | parentname | varchar2(50) |
| 8 | pk_child | pk_child | pk_child | varchar2(50) | √ |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_parent | pk_parent | pk_parent | varchar2(50) |
| 12 | refname | refname | refname | varchar2(50) |
| 13 | resid | resid | resid | varchar2(50) |
| 14 | resmodule | resmodule | resmodule | varchar2(50) |
| 15 | showorder | showorder | showorder | number(38, 0) |
| 16 | show_control | show_control | show_control | char(1) |  |  | 'N' |
| 17 | statmainbody | statmainbody | statmainbody | varchar2(50) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |