# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8643.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | begindate | begindate | begindate | char(10) |
| 3 | enddate | enddate | enddate | char(10) |
| 4 | extend_org | extend_org | extend_org | varchar2(300) |
| 5 | id | id | id | varchar2(50) |
| 6 | idtype | idtype | idtype | varchar2(20) |
| 7 | iseffect | iseffect | iseffect | char(1) |
| 8 | isstart | isstart | isstart | char(1) |
| 9 | lastflag | lastflag | lastflag | char(1) |
| 10 | memo | memo | memo | varchar2(1024) |
| 11 | pk_group | pk_group | pk_group | char(20) |
| 12 | pk_org | pk_org | pk_org | char(20) |
| 13 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 14 | recordnum | recordnum | recordnum | number(38, 0) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |