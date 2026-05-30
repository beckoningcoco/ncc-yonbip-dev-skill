# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8489.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transrule | pk_transrule | pk_transrule | char(20) | √ |
| 2 | combindetails | combindetails | combindetails | char(1) |
| 3 | containtally | containtally | containtally | char(1) |
| 4 | friday | friday | friday | char(1) |
| 5 | isasscontain | isasscontain | isasscontain | char(1) |
| 6 | iscashflowcontain | iscashflowcontain | iscashflowcontain | char(1) |
| 7 | iscombindifabs | iscombindifabs | iscombindifabs | char(1) |
| 8 | iscombindifdc | iscombindifdc | iscombindifdc | char(1) |
| 9 | monday | monday | monday | char(1) |
| 10 | monthdays | monthdays | monthdays | number(38, 0) |
| 11 | monthperiods | monthperiods | monthperiods | number(38, 0) |
| 12 | pk_group | pk_group | pk_group | char(20) |
| 13 | rulename | rulename | rulename | varchar2(50) |
| 14 | saturday | saturday | saturday | char(1) |
| 15 | srcsyscode | srcsyscode | srcsyscode | varchar2(50) |
| 16 | sunday | sunday | sunday | char(1) |
| 17 | thursday | thursday | thursday | char(1) |
| 18 | transdatatype | transdatatype | transdatatype | varchar2(50) |
| 19 | transdate | transdate | transdate | char(8) |
| 20 | transperiod | transperiod | transperiod | varchar2(50) |
| 21 | transtype | transtype | transtype | varchar2(50) |
| 22 | tuesday | tuesday | tuesday | char(1) |
| 23 | wednesday | wednesday | wednesday | char(1) |
| 24 | weekperiods | weekperiods | weekperiods | number(38, 0) |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |