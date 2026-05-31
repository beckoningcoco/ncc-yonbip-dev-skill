# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10323.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assetstatstrusub | pk_assetstatstrusub | pk_assetstatstrusub | char(20) | √ |
| 2 | asssubinfos | asssubinfos | asssubinfos | char(20) | √ |
| 3 | code | code | code | varchar2(50) |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |
| 5 | innercode | innercode | innercode | varchar2(50) |
| 6 | isvirtualorg | isvirtualorg | isvirtualorg | char(1) |
| 7 | mnecode | mnecode | mnecode | varchar2(50) |
| 8 | name | name | name | varchar2(300) |
| 9 | orgvoclass | orgvoclass | orgvoclass | varchar2(50) |
| 10 | pk_assetstatstru | pk_assetstatstru | pk_assetstatstru | varchar2(20) |  |  | '~' |
| 11 | pk_busiorg | pk_busiorg | pk_busiorg | varchar2(50) |
| 12 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | shortname | shortname | shortname | varchar2(50) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |