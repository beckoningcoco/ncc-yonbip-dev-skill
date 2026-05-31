# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7209.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvtypesrv | pk_pvtypesrv | pk_pvtypesrv | char(20) | √ |
| 2 | code_pvtype | code_pvtype | code_pvtype | char(20) |
| 3 | flag_edit | flag_edit | flag_edit | char(1) |
| 4 | note | note | note | varchar2(50) |
| 5 | pk_group | pk_group | pk_group | char(20) |
| 6 | pk_item | pk_item | pk_item | char(20) |
| 7 | pk_org | pk_org | pk_org | char(20) |
| 8 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(50) |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |