# |<<

**结算信息明细 (cmp_detail / nc.vo.cmp.settlement.SettlementBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1552.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | 结算明细主键 | pk_detail | varchar(20) | √ | 主键 (UFID) |
| 2 | systemcode | 来源系统 | systemcode | varchar(20) |  | 来源系统 (cmp_syscode) |
| 3 | pk_billtype | 来源单据类型 | pk_billtype | varchar(12) |  | 字符串 (String) |
| 4 | pk_billtypeid | 单据类型实体的主属性 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | billcode | 单据编号 | billcode | varchar(80) |  | 字符串 (String) |
| 6 | pk_bill | 业务页签表头id | pk_bill | varchar(40) |  | 字符串 (String) |
| 7 | pk_billdetail | 业务页签表体行id | pk_billdetail | varchar(50) |  | 字符串 (String) |
| 8 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 9 | billtime | 单据时间 | billtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | tallystatus | 记账状态 | tallystatus | int |  | 记账类型 (tallystatus) |  | 0=未记账; |