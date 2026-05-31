# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12362.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_finalfile | pk_finalfile | pk_finalfile | char(20) | √ |
| 2 | alone_id | alone_id | alone_id | varchar2(50) |
| 3 | filedata | filedata | filedata | blob |
| 4 | filename | filename | filename | varchar2(100) |
| 5 | filepath | filepath | filepath | varchar2(200) |
| 6 | filestoragepath | filestoragepath | filestoragepath | varchar2(200) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_task | pk_task | pk_task | varchar2(20) |  |  | '~' |
| 10 | uploadtime | uploadtime | uploadtime | char(19) |
| 11 | uploaduser | uploaduser | uploaduser | varchar2(20) |  |  | '~' |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |