# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7053.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reftable | pk_reftable | pk_reftable | char(20) | √ |
| 2 | defaultfieldcount | defaultfieldcount | defaultfieldcount | number(38, 0) |
| 3 | pk_corp | pk_corp | pk_corp | varchar2(20) | √ |
| 4 | refnodename | refnodename | refnodename | varchar2(200) |
| 5 | reftablename | reftablename | reftablename | varchar2(2000) |
| 6 | wherepart | wherepart | wherepart | varchar2(2000) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |