# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11526.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiactive_perm | pk_busiactive_perm | pk_busiactive_perm | char(20) | √ |
| 2 | displayname | displayname | displayname | varchar2(400) |
| 3 | isbuttonpower | isbuttonpower | isbuttonpower | char(1) |
| 4 | own_module | own_module | own_module | varchar2(20) |  |  | '~' |
| 5 | parentid | parentid | parentid | varchar2(50) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_subject | pk_subject | pk_subject | varchar2(50) | √ |
| 9 | resid | resid | resid | varchar2(50) |
| 10 | subjectcode | subjectcode | subjectcode | varchar2(50) |
| 11 | subjecttype | subjecttype | subjecttype | number(38, 0) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |