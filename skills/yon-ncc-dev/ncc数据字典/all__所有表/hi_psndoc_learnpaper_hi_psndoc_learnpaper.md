# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8653.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | begindate | begindate | begindate | varchar2(10) |
| 2 | enddate | enddate | enddate | varchar2(10) |
| 3 | lastflag | lastflag | lastflag | char(1) |
| 4 | magazgrade | magazgrade | magazgrade | varchar2(128) |
| 5 | magazinename | magazinename | magazinename | varchar2(128) |
| 6 | paperadress | paperadress | paperadress | varchar2(128) |
| 7 | papertitle | papertitle | papertitle | varchar2(128) |
| 8 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |
| 9 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | varchar2(20) | √ |
| 10 | recordnum | recordnum | recordnum | number(38, 0) |
| 11 | remark | remark | remark | varchar2(200) |
| 12 | yearmth | yearmth | yearmth | varchar2(50) |
| 13 | creationtime | creationtime | creationtime | varchar2(19) |
| 14 | creator | creator | creator | varchar2(20) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |