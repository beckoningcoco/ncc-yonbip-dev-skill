# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9126.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_resexec | pk_resexec | pk_resexec | char(20) | √ |
| 2 | cbillbid | cbillbid | cbillbid | varchar2(20) |
| 3 | cbillid | cbillid | cbillid | varchar2(20) |
| 4 | cbilltype | cbilltype | cbilltype | varchar2(20) |
| 5 | fresstate | fresstate | fresstate | number(38, 0) |
| 6 | ilogno | ilogno | ilogno | number(38, 0) |
| 7 | nrsinnum | nrsinnum | nrsinnum | number(28, 8) |
| 8 | nrsoutnum | nrsoutnum | nrsoutnum | number(28, 8) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_handreserve | pk_handreserve | pk_handreserve | char(20) |
| 11 | pk_onhanddim | pk_onhanddim | pk_onhanddim | varchar2(20) |  |  | '~' |
| 12 | pk_prereserve | pk_prereserve | pk_prereserve | char(20) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |