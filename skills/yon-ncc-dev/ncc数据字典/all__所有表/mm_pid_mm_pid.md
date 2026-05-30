# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9925.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pid | pk_pid | pk_pid | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 4 | cbegindate | cbegindate | cbegindate | char(19) |
| 5 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |  |  | '~' |
| 6 | cenddate | cenddate | cenddate | char(19) |
| 7 | cffileid | cffileid | cffileid | varchar2(20) |  |  | '~' |
| 8 | cmanuplantid | cmanuplantid | cmanuplantid | varchar2(20) |  |  | '~' |
| 9 | cmanuplantvid | cmanuplantvid | cmanuplantvid | varchar2(20) |  |  | '~' |
| 10 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 11 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 12 | cproductorid | cproductorid | cproductorid | varchar2(20) |  |  | '~' |
| 13 | cprojectid | cprojectid | cprojectid | varchar2(20) |  |  | '~' |
| 14 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 15 | cvendorid | cvendorid | cvendorid | varchar2(20) |  |  | '~' |
| 16 | fstatusflag | fstatusflag | fstatusflag | varchar2(50) |
| 17 | nastnum | nastnum | nastnum | number(28, 8) |
| 18 | ninastnum | ninastnum | ninastnum | number(28, 8) |
| 19 | ninvnum | ninvnum | ninvnum | number(28, 8) |
| 20 | nmaroutastnum | nmaroutastnum | nmaroutastnum | number(28, 8) |
| 21 | nmaroutnum | nmaroutnum | nmaroutnum | number(28, 8) |
| 22 | nnum | nnum | nnum | number(28, 8) |
| 23 | ntooutastnum | ntooutastnum | ntooutastnum | number(28, 8) |
| 24 | ntooutnum | ntooutnum | ntooutnum | number(28, 8) |
| 25 | ntotaloutastnum | ntotaloutastnum | ntotaloutastnum | number(28, 8) |
| 26 | ntotaloutnum | ntotaloutnum | ntotaloutnum | number(28, 8) |
| 27 | periodcode | periodcode | periodcode | number(38, 0) |
| 28 | periodyear | periodyear | periodyear | number(38, 0) |
| 29 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 30 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 31 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 32 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 33 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 34 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 35 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 36 | taudittime | taudittime | taudittime | varchar2(19) |
| 37 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 38 | vchangerate | vchangerate | vchangerate | varchar2(60) |
| 39 | vrowno | vrowno | vrowno | varchar2(20) |
| 40 | vfree1 | vfree1 | vfree1 | varchar2(101) |
| 41 | vfree2 | vfree2 | vfree2 | varchar2(101) |
| 42 | vfree3 | vfree3 | vfree3 | varchar2(101) |
| 43 | vfree4 | vfree4 | vfree4 | varchar2(101) |
| 44 | vfree5 | vfree5 | vfree5 | varchar2(101) |
| 45 | vfree6 | vfree6 | vfree6 | varchar2(101) |
| 46 | vfree7 | vfree7 | vfree7 | varchar2(101) |
| 47 | vfree8 | vfree8 | vfree8 | varchar2(101) |
| 48 | vfree9 | vfree9 | vfree9 | varchar2(101) |
| 49 | vfree10 | vfree10 | vfree10 | varchar2(101) |
| 50 | creationtime | creationtime | creationtime | char(19) |
| 51 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 52 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 53 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 54 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 55 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |