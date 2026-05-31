# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10333.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_basesub | pk_basesub | pk_basesub | char(20) | √ |
| 2 | basesubinfos | basesubinfos | basesubinfos | char(20) | √ |
| 3 | code | code | code | varchar2(50) |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |
| 5 | mnecode | mnecode | mnecode | varchar2(50) |
| 6 | name | name | name | varchar2(300) |
| 7 | orgvoclass | orgvoclass | orgvoclass | varchar2(200) |
| 8 | pk_busiorg | pk_busiorg | pk_busiorg | varchar2(50) |
| 9 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 10 | pk_filterorg | pk_filterorg | pk_filterorg | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | shortname | shortname | shortname | varchar2(50) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |