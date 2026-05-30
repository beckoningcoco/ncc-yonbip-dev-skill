# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10877.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billcodeelem | pk_billcodeelem | pk_billcodeelem | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 3 | elemlenth | elemlenth | elemlenth | number(38, 0) |
| 4 | elemtype | elemtype | elemtype | number(38, 0) |
| 5 | elemvalue | elemvalue | elemvalue | varchar2(100) |
| 6 | eorder | eorder | eorder | number(38, 0) |
| 7 | fillsign | fillsign | fillsign | char(1) |
| 8 | fillstyle | fillstyle | fillstyle | number(38, 0) |
| 9 | isrefer | isrefer | isrefer | number(38, 0) |
| 10 | pk_billcodebase | pk_billcodebase | pk_billcodebase | varchar2(20) |
| 11 | pk_billcodeentity | pk_billcodeentity | pk_billcodeentity | varchar2(20) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |