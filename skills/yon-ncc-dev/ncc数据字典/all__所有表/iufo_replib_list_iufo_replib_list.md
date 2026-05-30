# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9678.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_replib_list | pk_replib_list | pk_replib_list | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | freereportpk | freereportpk | freereportpk | char(20) |
| 4 | isbmobile | isbmobile | isbmobile | char(1) |
| 5 | isportal | isportal | isportal | char(1) |
| 6 | mailrulename | mailrulename | mailrulename | varchar2(200) |
| 7 | mobdr | mobdr | mobdr | char(1) |
| 8 | mobintrest | mobintrest | mobintrest | char(1) |
| 9 | mobread | mobread | mobread | char(1) |
| 10 | name | name | name | varchar2(200) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_mailrule | pk_mailrule | pk_mailrule | char(20) |
| 13 | pk_msnapshot | pk_msnapshot | pk_msnapshot | char(20) |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_pid | pk_pid | pk_pid | varchar2(50) |
| 16 | pk_replib_detail | pk_replib_detail | pk_replib_detail | varchar2(50) |
| 17 | place | place | place | varchar2(50) |
| 18 | placetime | placetime | placetime | char(19) |
| 19 | priority | priority | priority | varchar2(50) |
| 20 | receiver | receiver | receiver | varchar2(20) |  |  | '~' |
| 21 | samesubscribe | samesubscribe | samesubscribe | char(20) |
| 22 | sendperson | sendperson | sendperson | varchar2(50) |
| 23 | sendtime | sendtime | sendtime | char(19) |
| 24 | signcolour | signcolour | signcolour | varchar2(50) |
| 25 | srcmodule | srcmodule | srcmodule | varchar2(50) |
| 26 | theme | theme | theme | varchar2(200) |
| 27 | thenread | thenread | thenread | char(1) |
| 28 | type | type | type | varchar2(50) |
| 29 | creationtime | creationtime | creationtime | char(19) |
| 30 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 33 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |