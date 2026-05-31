# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11922.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task | pk_task | pk_task | char(20) | √ |
| 2 | advancetime | advancetime | advancetime | number(38, 0) |
| 3 | amount | amount | amount | number(28, 8) |
| 4 | appointtime | appointtime | appointtime | char(19) |
| 5 | barcode | barcode | barcode | varchar2(200) |
| 6 | billdate | billdate | billdate | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billno | billno | billno | varchar2(200) |
| 9 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 10 | busiid | busiid | busiid | varchar2(20) |
| 11 | cmprejectinfo | cmprejectinfo | cmprejectinfo | varchar2(500) |
| 12 | endtime | endtime | endtime | char(19) |
| 13 | flownode | flownode | flownode | varchar2(20) |
| 14 | isappointed | isappointed | isappointed | char(1) |
| 15 | isautoapprove | isautoapprove | isautoapprove | char(1) |  |  | 'N' |
| 16 | iscmpreject | iscmpreject | iscmpreject | char(1) |
| 17 | isleaderreject | isleaderreject | isleaderreject | char(1) |
| 18 | ismatchapproverule | ismatchapproverule | ismatchapproverule | char(1) |
| 19 | ismereject | ismereject | ismereject | char(1) |
| 20 | isunapprove | isunapprove | isunapprove | char(1) |
| 21 | operatetime | operatetime | operatetime | char(19) |
| 22 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 23 | pk_bill | pk_bill | pk_bill | varchar2(20) |
| 24 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 25 | pk_currenttask | pk_currenttask | pk_currenttask | varchar2(20) |
| 26 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 27 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 28 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 29 | pk_sscgroup | pk_sscgroup | pk_sscgroup | varchar2(20) |  |  | '~' |
| 30 | pk_sscnode | pk_sscnode | pk_sscnode | varchar2(20) |
| 31 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(20) |  |  | '~' |
| 32 | pk_sscuser | pk_sscuser | pk_sscuser | varchar2(20) |  |  | '~' |
| 33 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |  |  | '~' |
| 34 | rejectnode | rejectnode | rejectnode | varchar2(20) |  |  | '~' |
| 35 | remark | remark | remark | varchar2(1000) |
| 36 | standardtime | standardtime | standardtime | number(38, 0) |
| 37 | taskendtime | taskendtime | taskendtime | char(19) |
| 38 | taskstarttime | taskstarttime | taskstarttime | char(19) |
| 39 | taskstatus | taskstatus | taskstatus | varchar2(20) |
| 40 | tasktype | tasktype | tasktype | varchar2(20) |  |  | '~' |
| 41 | transtypecode | transtypecode | transtypecode | varchar2(50) |
| 42 | urgent | urgent | urgent | char(1) |
| 43 | warningtime | warningtime | warningtime | char(19) |
| 44 | creationtime | creationtime | creationtime | char(19) |
| 45 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 46 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 47 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 48 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 49 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |