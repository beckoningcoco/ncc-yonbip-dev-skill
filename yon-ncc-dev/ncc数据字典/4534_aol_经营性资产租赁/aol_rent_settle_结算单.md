# |<<

**结算单 (aol_rent_settle / nc.vo.aol.rent.settle.RentOutSettleHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/124.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentsettle | 结算单主键 | pk_rentsettle | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | bill_code | 结算单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 4 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |