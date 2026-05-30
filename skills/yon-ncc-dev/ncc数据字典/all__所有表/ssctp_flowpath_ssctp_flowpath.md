# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11904.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_flowpath | pk_flowpath | pk_flowpath | char(20) | √ |
| 2 | actiontype | actiontype | actiontype | varchar2(50) |
| 3 | amount | amount | amount | number(28, 8) |
| 4 | barcode | barcode | barcode | varchar2(200) |
| 5 | beginstate | beginstate | beginstate | varchar2(20) |
| 6 | beigntime | beigntime | beigntime | char(19) |
| 7 | billdate | billdate | billdate | char(19) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billno | billno | billno | varchar2(200) |
| 10 | busiid | busiid | busiid | varchar2(20) |
| 11 | endtime | endtime | endtime | char(19) |
| 12 | flownode | flownode | flownode | varchar2(20) |
| 13 | isappointed | isappointed | isappointed | char(1) |
| 14 | isautoapprove | isautoapprove | isautoapprove | char(1) |
| 15 | ismatchapproverule | ismatchapproverule | ismatchapproverule | char(1) |
| 16 | isrejectout | isrejectout | isrejectout | char(1) |
| 17 | operater | operater | operater | varchar2(20) |  |  | '~' |
| 18 | operatetime | operatetime | operatetime | char(19) |
| 19 | pk_bill | pk_bill | pk_bill | varchar2(20) |
| 20 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 21 | pk_currenttask | pk_currenttask | pk_currenttask | varchar2(20) |
| 22 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_sscgroup | pk_sscgroup | pk_sscgroup | varchar2(20) |  |  | '~' |
| 26 | pk_sscnode | pk_sscnode | pk_sscnode | varchar2(20) |  |  | '~' |
| 27 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(20) |  |  | '~' |
| 28 | pk_sscuser | pk_sscuser | pk_sscuser | varchar2(20) |  |  | '~' |
| 29 | pk_task | pk_task | pk_task | varchar2(20) |
| 30 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |  |  | '~' |
| 31 | reason | reason | reason | varchar2(1024) |
| 32 | rejectnode | rejectnode | rejectnode | varchar2(200) |
| 33 | sscidentification | sscidentification | sscidentification | varchar2(50) |
| 34 | statisticaltime | statisticaltime | statisticaltime | number(38, 0) |  |  | 0 |
| 35 | statisticaltime_calendar | statisticaltime_calendar | statisticaltime_calendar | number(38, 0) |  |  | 0 |
| 36 | taskstatus | taskstatus | taskstatus | varchar2(20) |
| 37 | tasktype | tasktype | tasktype | varchar2(50) |
| 38 | urgent | urgent | urgent | char(1) |
| 39 | creationtime | creationtime | creationtime | char(19) |
| 40 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 41 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 42 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 43 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 44 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |