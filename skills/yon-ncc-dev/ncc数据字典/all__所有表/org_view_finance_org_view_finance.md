# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10327.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financesub | pk_financesub | pk_financesub | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |
| 4 | financesubinfos | financesubinfos | financesubinfos | char(20) | √ |
| 5 | innercode | innercode | innercode | varchar2(50) |
| 6 | isbook | isbook | isbook | char(1) |
| 7 | iscorp | iscorp | iscorp | char(1) |
| 8 | isfinanceorg | isfinanceorg | isfinanceorg | char(1) |
| 9 | isfrombook | isfrombook | isfrombook | char(1) |
| 10 | isfromfiorg | isfromfiorg | isfromfiorg | char(1) |
| 11 | ismainbook | ismainbook | ismainbook | char(1) |
| 12 | isreportbook | isreportbook | isreportbook | char(1) |
| 13 | mnecode | mnecode | mnecode | varchar2(50) |
| 14 | name | name | name | varchar2(300) |
| 15 | orgvoclass | orgvoclass | orgvoclass | varchar2(200) |
| 16 | pk_busiorg | pk_busiorg | pk_busiorg | varchar2(50) |
| 17 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | shortname | shortname | shortname | varchar2(50) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |