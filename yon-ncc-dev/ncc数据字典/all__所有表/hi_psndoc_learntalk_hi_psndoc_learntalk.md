# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8655.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | begindate | begindate | begindate | varchar2(10) |
| 2 | enddate | enddate | enddate | varchar2(10) |
| 3 | givelestitle | givelestitle | givelestitle | varchar2(200) |
| 4 | lastflag | lastflag | lastflag | char(1) |
| 5 | meetadress | meetadress | meetadress | varchar2(128) |
| 6 | meetgrade | meetgrade | meetgrade | varchar2(50) |
| 7 | meetname | meetname | meetname | varchar2(128) |
| 8 | meetorganizers | meetorganizers | meetorganizers | varchar2(128) |
| 9 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |
| 10 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | varchar2(20) | √ |
| 11 | recordnum | recordnum | recordnum | number(38, 0) |
| 12 | remark | remark | remark | varchar2(200) |
| 13 | creationtime | creationtime | creationtime | varchar2(19) |
| 14 | creator | creator | creator | varchar2(20) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |