# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11044.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkflow | pk_checkflow | pk_checkflow | char(20) | √ |
| 2 | actiontype | actiontype | actiontype | varchar2(20) | √ |
| 3 | agencyuser | agencyuser | agencyuser | char(20) |
| 4 | approveresult | approveresult | approveresult | char(1) |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 6 | billid | billid | billid | varchar2(20) |  |  | '~' |
| 7 | billno | billno | billno | varchar2(256) |
| 8 | billversionpk | billversionpk | billversionpk | varchar2(20) |
| 9 | checkman | checkman | checkman | varchar2(20) |  |  | '~' |
| 10 | checknote | checknote | checknote | varchar2(4000) |
| 11 | ciphertext | ciphertext | ciphertext | varchar2(1024) |
| 12 | dealdate | dealdate | dealdate | char(19) |
| 13 | dealtimemillis | dealtimemillis | dealtimemillis | varchar2(20) |
| 14 | ischeck | ischeck | ischeck | char(1) |
| 15 | ismsgbind | ismsgbind | ismsgbind | char(1) |
| 16 | mailaddress | mailaddress | mailaddress | varchar2(50) |
| 17 | mainhead | mainhead | mainhead | varchar2(128) |
| 18 | messagenote | messagenote | messagenote | varchar2(1024) |
| 19 | observer | observer | observer | varchar2(20) |  |  | '~' |
| 20 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_wf_task | pk_wf_task | pk_wf_task | char(20) |  |  | '~' |
| 24 | priority | priority | priority | number(38, 0) |
| 25 | receivedeleteflag | receivedeleteflag | receivedeleteflag | char(1) |
| 26 | senddate | senddate | senddate | char(19) |
| 27 | senderman | senderman | senderman | varchar2(20) |  |  | '~' |
| 28 | userobject | userobject | userobject | varchar2(128) |
| 29 | workflow_type | workflow_type | workflow_type | number(38, 0) |
| 30 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |