# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11900.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_currenttask | pk_currenttask | pk_currenttask | char(20) | √ |
| 2 | advancetime | advancetime | advancetime | number(38, 0) |
| 3 | amount | amount | amount | number(28, 8) |
| 4 | barcode | barcode | barcode | varchar2(200) |
| 5 | billdate | billdate | billdate | char(19) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billno | billno | billno | varchar2(200) |
| 8 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 9 | busiid | busiid | busiid | varchar2(20) |
| 10 | cmprejectinfo | cmprejectinfo | cmprejectinfo | varchar2(500) |
| 11 | endtime | endtime | endtime | char(19) |
| 12 | flownode | flownode | flownode | varchar2(20) |
| 13 | isappointed | isappointed | isappointed | char(1) |
| 14 | isautoapprove | isautoapprove | isautoapprove | char(1) |  |  | 'N' |
| 15 | iscmpreject | iscmpreject | iscmpreject | char(1) |
| 16 | isleaderreject | isleaderreject | isleaderreject | char(1) |
| 17 | ismatchapproverule | ismatchapproverule | ismatchapproverule | char(1) |
| 18 | ismereject | ismereject | ismereject | char(1) |
| 19 | issscfinish | issscfinish | issscfinish | char(1) |  |  | 'N' |
| 20 | isunapprove | isunapprove | isunapprove | char(1) |
| 21 | operatetime | operatetime | operatetime | char(19) |
| 22 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 23 | pk_bill | pk_bill | pk_bill | varchar2(20) |
| 24 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 25 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_sscgroup | pk_sscgroup | pk_sscgroup | varchar2(20) |  |  | '~' |
| 29 | pk_sscnode | pk_sscnode | pk_sscnode | varchar2(20) |  |  | '~' |
| 30 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(20) |  |  | '~' |
| 31 | pk_sscuser | pk_sscuser | pk_sscuser | varchar2(20) |  |  | '~' |
| 32 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |  |  | '~' |
| 33 | rejectnode | rejectnode | rejectnode | varchar2(20) |  |  | '~' |
| 34 | remark | remark | remark | varchar2(1000) |
| 35 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 36 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 37 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 38 | saga_status | saga_status | saga_status | number(38, 0) |
| 39 | sscendtime | sscendtime | sscendtime | char(19) |
| 40 | sscstarttime | sscstarttime | sscstarttime | char(19) |
| 41 | standardtime | standardtime | standardtime | number(38, 0) |
| 42 | taskstatus | taskstatus | taskstatus | varchar2(20) |
| 43 | tasktype | tasktype | tasktype | varchar2(20) |  |  | '~' |
| 44 | transtypecode | transtypecode | transtypecode | varchar2(50) |
| 45 | urgent | urgent | urgent | char(1) |
| 46 | warningtime | warningtime | warningtime | char(19) |
| 47 | creationtime | creationtime | creationtime | char(19) |
| 48 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 49 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 50 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 51 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 52 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |