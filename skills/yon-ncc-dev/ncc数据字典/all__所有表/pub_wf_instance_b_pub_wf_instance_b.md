# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11027.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf_instance_b | pk_wf_instance_b | pk_wf_instance_b | char(20) | √ |
| 2 | pk_wf_instance | pk_wf_instance | pk_wf_instance | char(20) | √ |
| 3 | supervisor | supervisor | supervisor | char(20) | √ |
| 4 | type | type | type | number(38, 0) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |