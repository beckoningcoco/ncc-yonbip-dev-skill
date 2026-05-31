# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8652.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | certifcode | certifcode | certifcode | varchar2(42) |
| 3 | certifdate | certifdate | certifdate | char(10) |
| 4 | certifname | certifname | certifname | varchar2(192) |
| 5 | langlev | langlev | langlev | varchar2(128) |
| 6 | langskill | langskill | langskill | char(20) |
| 7 | langsort | langsort | langsort | char(20) |
| 8 | lastflag | lastflag | lastflag | char(1) |  |  | 'Y' |
| 9 | memo | memo | memo | varchar2(1536) |
| 10 | pk_group | pk_group | pk_group | char(20) | √ |
| 11 | pk_org | pk_org | pk_org | char(20) |
| 12 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 13 | recordnum | recordnum | recordnum | number(38, 0) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |