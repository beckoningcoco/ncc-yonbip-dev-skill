# |<<

**凭证分录 (cca_voucherentry / nc.vo.cca.costvoucher.VoucherEntryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1307.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucherentry | 主键 | pk_voucherentry | char(20) | √ | 主键 (UFID) |
| 2 | entryno | 分录号 | entryno | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | digest | 摘要 | digest | varchar(300) |  | 常用摘要 (summary) |
| 6 | pk_costcenter | 成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | costobject | 成本对象 | costobject | varchar(50) |  | 字符串 (String) |
| 8 | costobjecttype | 成本对象类型 | costobjecttype | int |  | 成本对象类型 (CostObjectTypeEnum) |  | 1=成本中心; |