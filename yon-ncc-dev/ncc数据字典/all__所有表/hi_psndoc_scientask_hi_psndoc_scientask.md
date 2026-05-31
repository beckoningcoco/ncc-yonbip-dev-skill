# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8669.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | begindate | begindate | begindate | varchar2(10) |
| 2 | enddate | enddate | enddate | varchar2(10) |
| 3 | itemcode | itemcode | itemcode | varchar2(128) |
| 4 | lastflag | lastflag | lastflag | char(1) |
| 5 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |
| 6 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | varchar2(20) | √ |
| 7 | recordnum | recordnum | recordnum | number(38, 0) |
| 8 | remark | remark | remark | varchar2(200) |
| 9 | taskfunds | taskfunds | taskfunds | varchar2(128) |
| 10 | taskgrade | taskgrade | taskgrade | varchar2(50) |
| 11 | tasklinkman | tasklinkman | tasklinkman | varchar2(128) |
| 12 | taskmember | taskmember | taskmember | varchar2(300) |
| 13 | taskname | taskname | taskname | varchar2(128) |
| 14 | creationtime | creationtime | creationtime | varchar2(19) |
| 15 | creator | creator | creator | varchar2(20) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |