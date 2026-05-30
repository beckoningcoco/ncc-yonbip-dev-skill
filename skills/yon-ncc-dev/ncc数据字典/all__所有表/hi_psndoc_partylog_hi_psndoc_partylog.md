# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8662.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | begindate | begindate | begindate | char(10) |
| 3 | enddate | enddate | enddate | char(10) |
| 4 | exreason | exreason | exreason | varchar2(192) |
| 5 | exsort | exsort | exsort | varchar2(20) |  |  | '~' |
| 6 | lastflag | lastflag | lastflag | char(1) |  |  | 'Y' |
| 7 | partydate | partydate | partydate | char(10) |
| 8 | partyduedate | partyduedate | partyduedate | char(10) |
| 9 | partyname | partyname | partyname | char(20) |
| 10 | partypsn | partypsn | partypsn | varchar2(192) |
| 11 | partyunit | partyunit | partyunit | varchar2(192) |
| 12 | pk_group | pk_group | pk_group | char(20) | √ |
| 13 | pk_org | pk_org | pk_org | char(20) |
| 14 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 15 | recordnum | recordnum | recordnum | number(38, 0) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |