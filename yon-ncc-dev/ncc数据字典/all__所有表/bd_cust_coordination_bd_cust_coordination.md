# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6862.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cust_coordination | pk_cust_coordination | pk_cust_coordination | char(20) | √ |
| 2 | cell | cell | cell | varchar2(11) |
| 3 | pk_customer | pk_customer | pk_customer | varchar2(20) | √ |
| 4 | pk_linkman | pk_linkman | pk_linkman | char(20) |
| 5 | tenantid | tenantid | tenantid | char(50) |
| 6 | yht_id | yht_id | yht_id | char(50) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |