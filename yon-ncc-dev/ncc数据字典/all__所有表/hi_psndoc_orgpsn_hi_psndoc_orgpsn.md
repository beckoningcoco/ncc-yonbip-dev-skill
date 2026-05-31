# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8660.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | bquit | bquit | bquit | char(1) |
| 3 | djoindate | djoindate | djoindate | char(10) |
| 4 | dquitdate | dquitdate | dquitdate | char(19) |
| 5 | lastflag | lastflag | lastflag | char(1) | √ |  | 'Y' |
| 6 | pk_corp | pk_corp | pk_corp | char(20) |
| 7 | pk_group | pk_group | pk_group | char(20) | √ |
| 8 | pk_om_dumorg | pk_om_dumorg | pk_om_dumorg | char(20) | √ |
| 9 | pk_org | pk_org | pk_org | char(20) |
| 10 | pk_orgrole | pk_orgrole | pk_orgrole | char(20) | √ |
| 11 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 12 | recordnum | recordnum | recordnum | number(38, 0) | √ |
| 13 | villumin | villumin | villumin | varchar2(256) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | char(20) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | char(20) |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |