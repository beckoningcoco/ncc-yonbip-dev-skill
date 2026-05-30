# |<<

**新增登记 (rum_add_register / nc.vo.rum.addregister.AddRegisterHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5005.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_add_register | 新增登记主键 | pk_add_register | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 6 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 7 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | busi_type | 业务类型 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 9 | bill_code | 单据号 | bill_code | varchar(40) |  | 字符串 (String) |
| 10 | bill_date | 单据日期 | bill_date | char(19) |  | 日期 (UFDate) |
| 11 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |