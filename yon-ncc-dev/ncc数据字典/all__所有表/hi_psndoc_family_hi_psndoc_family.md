# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8650.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | approveflag | approveflag | approveflag | number(38, 0) |  |  | 1 |
| 3 | begindate | begindate | begindate | char(10) |
| 4 | enddate | enddate | enddate | char(10) |
| 5 | lastflag | lastflag | lastflag | char(1) |  |  | 'Y' |
| 6 | memo | memo | memo | varchar2(1536) |
| 7 | mem_birthday | mem_birthday | mem_birthday | char(10) |
| 8 | mem_corp | mem_corp | mem_corp | varchar2(900) |
| 9 | mem_job | mem_job | mem_job | varchar2(900) |
| 10 | mem_name | mem_name | mem_name | varchar2(75) |
| 11 | mem_relation | mem_relation | mem_relation | varchar2(20) |  |  | '~' |
| 12 | period | period | period | varchar2(10) |
| 13 | pk_group | pk_group | pk_group | char(20) |
| 14 | pk_org | pk_org | pk_org | char(20) |
| 15 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 16 | politics | politics | politics | varchar2(20) |  |  | '~' |
| 17 | profession | profession | profession | varchar2(900) |
| 18 | recordnum | recordnum | recordnum | number(38, 0) |
| 19 | relaaddr | relaaddr | relaaddr | varchar2(900) |
| 20 | relaphone | relaphone | relaphone | varchar2(20) |
| 21 | creationtime | creationtime | creationtime | char(19) |
| 22 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 25 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |