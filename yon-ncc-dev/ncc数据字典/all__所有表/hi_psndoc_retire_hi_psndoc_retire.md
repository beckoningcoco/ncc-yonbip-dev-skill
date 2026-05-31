# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8667.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | allowance | allowance | allowance | number(20, 2) |
| 3 | approveflag | approveflag | approveflag | number(38, 0) |  |  | 1 |
| 4 | begindate | begindate | begindate | char(10) |
| 5 | enddate | enddate | enddate | char(10) |
| 6 | lastflag | lastflag | lastflag | char(1) |
| 7 | memo | memo | memo | varchar2(1536) |
| 8 | otherfee | otherfee | otherfee | number(20, 2) |
| 9 | pension | pension | pension | number(20, 2) |
| 10 | period | period | period | varchar2(10) |
| 11 | pk_corp | pk_corp | pk_corp | char(20) |
| 12 | pk_group | pk_group | pk_group | char(20) | √ |
| 13 | pk_org | pk_org | pk_org | char(20) |
| 14 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 15 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) | √ |  | '~' |
| 16 | recordnum | recordnum | recordnum | number(38, 0) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |