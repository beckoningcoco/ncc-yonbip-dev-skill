# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9961.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | pk_log | pk_log | varchar2(20) | √ |
| 2 | computecode | computecode | computecode | varchar2(30) |
| 3 | fstatus | fstatus | fstatus | number(38, 0) |
| 4 | pk_analysis | pk_analysis | pk_analysis | varchar2(50) |
| 5 | vbillbid | vbillbid | vbillbid | varchar2(20) |
| 6 | vbillcode | vbillcode | vbillcode | varchar2(20) |
| 7 | vbillid | vbillid | vbillid | varchar2(20) |
| 8 | vbilltype | vbilltype | vbilltype | varchar2(20) |
| 9 | vfailreason | vfailreason | vfailreason | varchar2(1000) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |