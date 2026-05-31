# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9655.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task_instance | pk_task_instance | pk_task_instance | char(20) | √ |
| 2 | display | display | display | varchar2(200) |
| 3 | pk_conds_config | pk_conds_config | pk_conds_config | varchar2(20) |
| 4 | pk_subscibe_task | pk_subscibe_task | pk_subscibe_task | varchar2(20) |
| 5 | query_condition | query_condition | query_condition | blob |
| 6 | query_result | query_result | query_result | blob |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |