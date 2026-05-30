# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9604.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docmapping | pk_docmapping | pk_docmapping | varchar2(50) | √ |
| 2 | attribute | attribute | attribute | varchar2(50) |
| 3 | basedoc_org | basedoc_org | basedoc_org | varchar2(50) |
| 4 | code_map | code_map | code_map | varchar2(50) |
| 5 | code_owen | code_owen | code_owen | varchar2(50) |
| 6 | dsname | dsname | dsname | varchar2(50) |
| 7 | mapdoc_org | mapdoc_org | mapdoc_org | varchar2(50) |
| 8 | name_map | name_map | name_map | varchar2(200) |
| 9 | name_owen | name_owen | name_owen | varchar2(200) |
| 10 | pk_dim | pk_dim | pk_dim | varchar2(50) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_map | pk_map | pk_map | varchar2(50) |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_owen | pk_owen | pk_owen | varchar2(50) |
| 15 | pk_subjscheme | pk_subjscheme | pk_subjscheme | varchar2(50) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |