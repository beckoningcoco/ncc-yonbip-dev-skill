# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10769.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |
| 3 | supplier_name | supplier_name | supplier_name | varchar2(200) |
| 4 | tenantid | tenantid | tenantid | varchar2(50) |
| 5 | yht_id | yht_id | yht_id | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |