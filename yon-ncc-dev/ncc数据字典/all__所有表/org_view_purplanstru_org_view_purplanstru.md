# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10330.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_purplanstrusub | pk_purplanstrusub | pk_purplanstrusub | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |
| 4 | innercode | innercode | innercode | varchar2(50) |
| 5 | isdept | isdept | isdept | char(1) |
| 6 | isorgunit | isorgunit | isorgunit | char(1) |
| 7 | mnecode | mnecode | mnecode | varchar2(50) |
| 8 | name | name | name | varchar2(300) |
| 9 | orgvoclass | orgvoclass | orgvoclass | varchar2(50) |
| 10 | pk_busiorg | pk_busiorg | pk_busiorg | varchar2(50) |
| 11 | pk_entityorg | pk_entityorg | pk_entityorg | varchar2(20) |  |  | '~' |
| 12 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_pps | pk_pps | pk_pps | varchar2(20) |  |  | '~' |
| 15 | purplanstruinfos | purplanstruinfos | purplanstruinfos | char(20) | √ |
| 16 | shortname | shortname | shortname | varchar2(50) |
| 17 | virtualorg | virtualorg | virtualorg | char(1) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |