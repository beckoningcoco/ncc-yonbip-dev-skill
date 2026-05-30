# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8666.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | approveflag | approveflag | approveflag | number(38, 0) |  |  | 1 |
| 3 | begindate | begindate | begindate | char(10) |
| 4 | enddate | enddate | enddate | char(10) |
| 5 | lastflag | lastflag | lastflag | char(1) |  |  | 'Y' |
| 6 | period | period | period | varchar2(10) |
| 7 | pk_group | pk_group | pk_group | char(20) | √ |
| 8 | pk_org | pk_org | pk_org | char(20) |
| 9 | pk_postrequire_b | pk_postrequire_b | pk_postrequire_b | varchar2(20) |  |  | '~' |
| 10 | pk_postrequire_h | pk_postrequire_h | pk_postrequire_h | char(20) |
| 11 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 12 | recordnum | recordnum | recordnum | number(38, 0) |
| 13 | remark | remark | remark | varchar2(256) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |