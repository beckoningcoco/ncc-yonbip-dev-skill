# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9975.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sop | pk_sop | pk_sop | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | dbegindate | dbegindate | dbegindate | char(19) |
| 4 | denddate | denddate | denddate | char(19) |
| 5 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 6 | ibeginperiod | ibeginperiod | ibeginperiod | number(38, 0) |
| 7 | ibeginyear | ibeginyear | ibeginyear | number(38, 0) |
| 8 | iendperiod | iendperiod | iendperiod | number(38, 0) |
| 9 | iendyear | iendyear | iendyear | number(38, 0) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | taudittime | taudittime | taudittime | varchar2(19) |
| 14 | vcode | vcode | vcode | varchar2(50) |
| 15 | vname | vname | vname | varchar2(300) |
| 16 | vname2 | vname2 | vname2 | varchar2(300) |
| 17 | vname3 | vname3 | vname3 | varchar2(300) |
| 18 | vname4 | vname4 | vname4 | varchar2(300) |
| 19 | vname5 | vname5 | vname5 | varchar2(300) |
| 20 | vname6 | vname6 | vname6 | varchar2(300) |
| 21 | creationtime | creationtime | creationtime | char(19) |
| 22 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 25 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |