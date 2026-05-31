# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11028.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf_instance_h | pk_wf_instance_h | pk_wf_instance_h | char(20) | √ |
| 2 | billid | billid | billid | char(20) |
| 3 | billno | billno | billno | varchar2(200) |
| 4 | billtype | billtype | billtype | varchar2(200) |
| 5 | operation | operation | operation | number(38, 0) |
| 6 | operationdate | operationdate | operationdate | char(19) |
| 7 | operator | operator | operator | char(20) |
| 8 | pk_wf_instance | pk_wf_instance | pk_wf_instance | char(20) | √ |
| 9 | previousstatus | previousstatus | previousstatus | number(38, 0) |
| 10 | reason | reason | reason | varchar2(2048) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |