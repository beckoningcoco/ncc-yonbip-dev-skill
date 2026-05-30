# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11828.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_currenttask | pk_currenttask | pk_currenttask | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | billdate | billdate | billdate | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billno | billno | billno | varchar2(200) |
| 6 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 7 | busiid | busiid | busiid | varchar2(20) |
| 8 | committime | committime | committime | char(19) |
| 9 | flowendtime | flowendtime | flowendtime | char(19) |
| 10 | flowstatus | flowstatus | flowstatus | number(38, 0) |
| 11 | hassettle | hassettle | hassettle | char(1) |
| 12 | issettlefinish | issettlefinish | issettlefinish | char(1) |
| 13 | issscfinish | issscfinish | issscfinish | char(1) |
| 14 | pk_bill | pk_bill | pk_bill | varchar2(20) |
| 15 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 16 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(20) |  |  | '~' |
| 20 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |  |  | '~' |
| 21 | remark | remark | remark | varchar2(1000) |
| 22 | settletime | settletime | settletime | char(19) |
| 23 | sscendtime | sscendtime | sscendtime | char(19) |
| 24 | transtypecode | transtypecode | transtypecode | varchar2(50) |
| 25 | creationtime | creationtime | creationtime | char(19) |
| 26 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 29 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |