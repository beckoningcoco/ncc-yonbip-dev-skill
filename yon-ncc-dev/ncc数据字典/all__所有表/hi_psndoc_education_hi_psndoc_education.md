# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8646.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | begindate | begindate | begindate | varchar2(10) |
| 2 | enddate | enddate | enddate | varchar2(10) |
| 3 | itemcode | itemcode | itemcode | varchar2(128) |
| 4 | itemgrade | itemgrade | itemgrade | varchar2(50) |
| 5 | itemname | itemname | itemname | varchar2(128) |
| 6 | joinperson | joinperson | joinperson | varchar2(50) |
| 7 | lastflag | lastflag | lastflag | char(1) |
| 8 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |
| 9 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | varchar2(20) | √ |
| 10 | recordnum | recordnum | recordnum | number(38, 0) |
| 11 | remark | remark | remark | varchar2(200) |
| 12 | creationtime | creationtime | creationtime | varchar2(19) |
| 13 | creator | creator | creator | varchar2(20) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |