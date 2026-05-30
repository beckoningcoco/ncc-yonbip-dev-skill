# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11718.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | pk_finance_org_v | pk_finance_org_v | pk_finance_org_v | varchar2(20) |
| 3 | pk_sale_org_v | pk_sale_org_v | pk_sale_org_v | varchar2(20) |
| 4 | pk_stock_org_v | pk_stock_org_v | pk_stock_org_v | varchar2(20) |
| 5 | saleinvoicetype | saleinvoicetype | saleinvoicetype | varchar2(20) |
| 6 | saleordertype | saleordertype | saleordertype | varchar2(20) |
| 7 | salequotype | salequotype | salequotype | varchar2(20) |
| 8 | salesigntype | salesigntype | salesigntype | varchar2(20) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |