# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11719.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | pk_customer | pk_customer | pk_customer | varchar2(20) |
| 3 | saleordertype | saleordertype | saleordertype | varchar2(20) |
| 4 | salequotype | salequotype | salequotype | varchar2(20) |
| 5 | salesigntype | salesigntype | salesigntype | varchar2(20) |
| 6 | tenantid | tenantid | tenantid | varchar2(50) |
| 7 | yht_id | yht_id | yht_id | varchar2(50) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |