# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12417.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | creatorname | creatorname | creatorname | varchar2(50) |
| 2 | flag_sync | flag_sync | flag_sync | char(1) |
| 3 | methodtype | methodtype | methodtype | varchar2(100) |
| 4 | pk_clearrecordlog | pk_clearrecordlog | pk_clearrecordlog | char(20) | √ |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | recordlog | recordlog | recordlog | clob |
| 8 | sendinfo | sendinfo | sendinfo | varchar2(2000) |
| 9 | text_desc | text_desc | text_desc | varchar2(200) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |