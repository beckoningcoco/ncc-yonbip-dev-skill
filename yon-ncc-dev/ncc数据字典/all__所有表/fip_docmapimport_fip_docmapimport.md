# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8312.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docmapimport | pk_docmapimport | pk_docmapimport | char(20) | √ |
| 2 | docmapcode | docmapcode | docmapcode | varchar2(40) |
| 3 | docmapname | docmapname | docmapname | varchar2(300) |
| 4 | docmapname2 | docmapname2 | docmapname2 | varchar2(300) |
| 5 | docmapname3 | docmapname3 | docmapname3 | varchar2(300) |
| 6 | docmapname4 | docmapname4 | docmapname4 | varchar2(300) |
| 7 | docmapname5 | docmapname5 | docmapname5 | varchar2(300) |
| 8 | docmapname6 | docmapname6 | docmapname6 | varchar2(300) |
| 9 | pk_docmap | pk_docmap | pk_docmap | varchar2(101) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | srctype | srctype | srctype | number(38, 0) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |