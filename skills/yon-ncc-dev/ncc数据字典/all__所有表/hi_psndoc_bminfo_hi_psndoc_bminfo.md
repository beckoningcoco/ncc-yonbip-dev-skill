# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8641.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | accountdate | accountdate | accountdate | char(10) |
| 3 | accountstate | accountstate | accountstate | number(38, 0) |
| 4 | bmaccount | bmaccount | bmaccount | varchar2(50) |
| 5 | bmclass | bmclass | bmclass | varchar2(300) |
| 6 | bmclass2 | bmclass2 | bmclass2 | varchar2(300) |
| 7 | bmclass3 | bmclass3 | bmclass3 | varchar2(300) |
| 8 | bmclass4 | bmclass4 | bmclass4 | varchar2(300) |
| 9 | bmclass5 | bmclass5 | bmclass5 | varchar2(300) |
| 10 | bmclass6 | bmclass6 | bmclass6 | varchar2(300) |
| 11 | lastflag | lastflag | lastflag | char(1) |
| 12 | paylocation | paylocation | paylocation | varchar2(20) |  |  | '~' |
| 13 | period | period | period | varchar2(50) |
| 14 | periodbalance | periodbalance | periodbalance | number(28, 8) |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_insurance | pk_insurance | pk_insurance | varchar2(20) |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |
| 19 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |
| 20 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) |
| 21 | recordnum | recordnum | recordnum | number(38, 0) |
| 22 | totalcorpus | totalcorpus | totalcorpus | number(28, 8) |
| 23 | yearbalance | yearbalance | yearbalance | number(28, 8) |
| 24 | creationtime | creationtime | creationtime | char(19) |
| 25 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |