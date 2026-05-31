# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10328.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financestatstrusub | pk_financestatstrusub | pk_financestatstrusub | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |
| 4 | fsssubinfos | fsssubinfos | fsssubinfos | char(20) | √ |
| 5 | innercode | innercode | innercode | varchar2(50) |
| 6 | isvirtualorg | isvirtualorg | isvirtualorg | char(1) |
| 7 | mnecode | mnecode | mnecode | varchar2(50) |
| 8 | name | name | name | varchar2(300) |
| 9 | orgvoclass | orgvoclass | orgvoclass | varchar2(50) |
| 10 | pk_busiorg | pk_busiorg | pk_busiorg | varchar2(50) |
| 11 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 12 | pk_financestatstru | pk_financestatstru | pk_financestatstru | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | shortname | shortname | shortname | varchar2(50) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |