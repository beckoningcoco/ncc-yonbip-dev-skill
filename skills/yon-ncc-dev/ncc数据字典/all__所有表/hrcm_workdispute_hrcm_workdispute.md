# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8745.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workdispute | pk_workdispute | pk_workdispute | char(20) | √ |
| 2 | begindate | begindate | begindate | char(10) |
| 3 | composeend | composeend | composeend | char(10) |
| 4 | composestart | composestart | composestart | char(10) |
| 5 | doccurdate | doccurdate | doccurdate | char(10) | √ |
| 6 | enddate | enddate | enddate | char(10) |
| 7 | isclawsolve | isclawsolve | isclawsolve | char(1) | √ |  | 'Y' |
| 8 | iscomposesolve | iscomposesolve | iscomposesolve | char(1) | √ |  | 'Y' |
| 9 | isintercesolve | isintercesolve | isintercesolve | char(1) | √ |  | 'Y' |
| 10 | lawenddate | lawenddate | lawenddate | char(10) |
| 11 | lawstartdate | lawstartdate | lawstartdate | char(10) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 14 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) | √ |  | '~' |
| 15 | vaboutmemo | vaboutmemo | vaboutmemo | varchar2(1536) |
| 16 | vcode | vcode | vcode | varchar2(42) | √ |
| 17 | vintermemo | vintermemo | vintermemo | varchar2(1536) |
| 18 | vlawmemo | vlawmemo | vlawmemo | varchar2(1536) |
| 19 | vreason | vreason | vreason | varchar2(1536) |
| 20 | vrequest | vrequest | vrequest | varchar2(1536) |
| 21 | vsolvememo | vsolvememo | vsolvememo | varchar2(1536) |
| 22 | creationtime | creationtime | creationtime | char(19) | √ |
| 23 | creator | creator | creator | varchar2(20) | √ |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |