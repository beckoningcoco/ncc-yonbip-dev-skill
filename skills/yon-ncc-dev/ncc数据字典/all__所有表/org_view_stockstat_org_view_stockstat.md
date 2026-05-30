# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10334.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockstatisticsub | pk_stockstatisticsub | pk_stockstatisticsub | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |
| 4 | innercode | innercode | innercode | varchar2(50) |
| 5 | iscorp | iscorp | iscorp | char(1) |
| 6 | isreperty | isreperty | isreperty | char(1) |
| 7 | isstockorg | isstockorg | isstockorg | char(1) |
| 8 | isvirtualorg | isvirtualorg | isvirtualorg | char(1) |
| 9 | mnecode | mnecode | mnecode | varchar2(50) |
| 10 | name | name | name | varchar2(300) |
| 11 | orgvoclass | orgvoclass | orgvoclass | varchar2(200) |
| 12 | pk_busiorg | pk_busiorg | pk_busiorg | varchar2(50) |
| 13 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_stockstatstru | pk_stockstatstru | pk_stockstatstru | varchar2(20) |  |  | '~' |
| 16 | shortname | shortname | shortname | varchar2(50) |
| 17 | stockstatinfos | stockstatinfos | stockstatinfos | char(20) | √ |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |