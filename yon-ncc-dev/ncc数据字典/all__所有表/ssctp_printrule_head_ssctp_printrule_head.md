# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11916.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printrule_head | pk_printrule_head | pk_printrule_head | char(20) | √ |
| 2 | modifytime | modifytime | modifytime | char(19) |
| 3 | pk_booktype | pk_booktype | pk_booktype | varchar2(20) |  |  | '~' |
| 4 | pk_comvctemplate | pk_comvctemplate | pk_comvctemplate | varchar2(50) |
| 5 | pk_curnumvctemplate | pk_curnumvctemplate | pk_curnumvctemplate | varchar2(50) |
| 6 | pk_curvctemplate | pk_curvctemplate | pk_curvctemplate | varchar2(50) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_numvctemplate | pk_numvctemplate | pk_numvctemplate | varchar2(50) |
| 9 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(50) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |