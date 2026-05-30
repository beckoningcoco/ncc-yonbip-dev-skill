# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9907.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ctaskdetailid | ctaskdetailid | ctaskdetailid | char(20) | √ |
| 2 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 3 | cclassid | cclassid | cclassid | varchar2(20) |  |  | '~' |
| 4 | cmoid | cmoid | cmoid | char(20) | √ |
| 5 | csupervisorid | csupervisorid | csupervisorid | varchar2(20) |  |  | '~' |
| 6 | cteamid | cteamid | cteamid | varchar2(20) |  |  | '~' |
| 7 | ddate | ddate | ddate | char(19) |
| 8 | nnum | nnum | nnum | number(28, 8) |
| 9 | nplanputnum | nplanputnum | nplanputnum | number(28, 8) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | tplanendtime | tplanendtime | tplanendtime | char(19) |
| 14 | tplanstarttime | tplanstarttime | tplanstarttime | char(19) |
| 15 | vrowno | vrowno | vrowno | varchar2(20) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |