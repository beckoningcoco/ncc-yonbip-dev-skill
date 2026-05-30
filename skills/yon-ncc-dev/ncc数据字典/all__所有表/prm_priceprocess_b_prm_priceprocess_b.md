# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10835.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_priceprocess_b | pk_priceprocess_b | pk_priceprocess_b | char(20) | √ |
| 2 | ialculateorder | ialculateorder | ialculateorder | number(38, 0) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 4 | pk_pricecondition | pk_pricecondition | pk_pricecondition | varchar2(20) |  |  | '~' |
| 5 | pk_priceprocess | pk_priceprocess | pk_priceprocess | varchar2(20) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |