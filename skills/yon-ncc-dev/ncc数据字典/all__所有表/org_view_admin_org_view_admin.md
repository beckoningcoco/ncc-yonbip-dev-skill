# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10322.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgsub | pk_orgsub | pk_orgsub | char(20) | √ |
| 2 | code | code | code | varchar2(40) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |
| 4 | innercode | innercode | innercode | varchar2(200) |
| 5 | isvirtualdept | isvirtualdept | isvirtualdept | char(1) |  |  | 'N' |
| 6 | iswithdrawdept | iswithdrawdept | iswithdrawdept | char(1) |  |  | 'N' |
| 7 | mnecode | mnecode | mnecode | varchar2(200) |
| 8 | name | name | name | varchar2(300) |
| 9 | orginfos | orginfos | orginfos | char(20) | √ |
| 10 | orgtype1 | orgtype1 | orgtype1 | char(1) |
| 11 | orgtype2 | orgtype2 | orgtype2 | char(1) |
| 12 | orgtype3 | orgtype3 | orgtype3 | char(1) |
| 13 | orgvoclass | orgvoclass | orgvoclass | varchar2(200) |
| 14 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 15 | pk_orgunit | pk_orgunit | pk_orgunit | varchar2(20) |  |  | '~' |
| 16 | principal | principal | principal | varchar2(20) |  |  | '~' |
| 17 | shortname | shortname | shortname | varchar2(200) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |