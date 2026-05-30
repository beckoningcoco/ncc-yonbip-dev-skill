# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9603.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docmapping | pk_docmapping | pk_docmapping | char(20) | √ |
| 2 | attribute | attribute | attribute | varchar2(50) |
| 3 | dsname | dsname | dsname | varchar2(50) |
| 4 | mapdata | mapdata | mapdata | varchar2(300) |
| 5 | owncode | owncode | owncode | varchar2(300) |
| 6 | owndata | owndata | owndata | varchar2(300) |
| 7 | ownname | ownname | ownname | varchar2(300) |
| 8 | pk_data | pk_data | pk_data | varchar2(50) |
| 9 | pk_dim | pk_dim | pk_dim | varchar2(20) |  |  | '~' |
| 10 | proptype | proptype | proptype | varchar2(10) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |