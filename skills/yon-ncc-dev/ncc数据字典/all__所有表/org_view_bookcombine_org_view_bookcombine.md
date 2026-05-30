# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10324.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bcssub | pk_bcssub | pk_bcssub | char(20) | √ |
| 2 | bcssubinfos | bcssubinfos | bcssubinfos | char(20) | √ |
| 3 | code | code | code | varchar2(50) |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |
| 5 | innercode | innercode | innercode | varchar2(50) |
| 6 | ismanageorg | ismanageorg | ismanageorg | char(1) |
| 7 | mnecode | mnecode | mnecode | varchar2(50) |
| 8 | name | name | name | varchar2(300) |
| 9 | orgvoclass | orgvoclass | orgvoclass | varchar2(50) |
| 10 | pk_bcs | pk_bcs | pk_bcs | varchar2(20) |  |  | '~' |
| 11 | pk_busiorg | pk_busiorg | pk_busiorg | varchar2(50) |
| 12 | pk_entityorg | pk_entityorg | pk_entityorg | varchar2(20) |  |  | '~' |
| 13 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | shortname | shortname | shortname | varchar2(50) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |