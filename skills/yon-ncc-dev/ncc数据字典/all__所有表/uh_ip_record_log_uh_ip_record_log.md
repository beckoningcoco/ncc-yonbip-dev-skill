# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12639.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | company | company | company | varchar2(50) |
| 2 | creatorname | creatorname | creatorname | varchar2(50) |
| 3 | methodtype | methodtype | methodtype | varchar2(100) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_iprecordlog | pk_iprecordlog | pk_iprecordlog | char(20) | √ |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_pati | pk_pati | pk_pati | varchar2(20) |
| 8 | pk_pv | pk_pv | pk_pv | varchar2(20) |
| 9 | recordlog | recordlog | recordlog | clob |
| 10 | sendinfo | sendinfo | sendinfo | clob |
| 11 | text_desc | text_desc | text_desc | varchar2(2000) |
| 12 | def1 | def1 | def1 | varchar2(100) |
| 13 | def2 | def2 | def2 | varchar2(100) |
| 14 | def3 | def3 | def3 | varchar2(100) |
| 15 | def4 | def4 | def4 | varchar2(100) |
| 16 | def5 | def5 | def5 | varchar2(100) |
| 17 | def6 | def6 | def6 | varchar2(100) |
| 18 | def7 | def7 | def7 | varchar2(100) |
| 19 | def8 | def8 | def8 | varchar2(100) |
| 20 | def9 | def9 | def9 | varchar2(100) |
| 21 | def10 | def10 | def10 | varchar2(100) |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |