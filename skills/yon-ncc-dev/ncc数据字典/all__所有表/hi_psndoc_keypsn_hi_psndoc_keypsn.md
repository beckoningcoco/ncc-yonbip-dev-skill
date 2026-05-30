# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8651.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | begindate | begindate | begindate | char(10) |
| 3 | enddate | enddate | enddate | char(10) |
| 4 | endflag | endflag | endflag | char(1) |
| 5 | lastflag | lastflag | lastflag | char(1) |
| 6 | memo | memo | memo | varchar2(50) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_keypsn_grp | pk_keypsn_grp | pk_keypsn_grp | char(20) |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 11 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) |  |  | '~' |
| 12 | recordnum | recordnum | recordnum | number(38, 0) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |