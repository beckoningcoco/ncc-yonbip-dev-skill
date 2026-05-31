# |<<

**票据池数据下载设置 (obm_ebankbillpooldownload / nc.vo.obm.ebankbillpooldownload.EbankbillpooldownloadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3917.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebankpooldownload | 主键 | pk_ebankpooldownload | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | facode | 方案 | facode | varchar(50) |  | 字符串 (String) |
| 4 | defaultfa | 默认方案 | defaultfa | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | isgroup | 是否集团级 | isgroup | varchar(50) |  | 字符串 (String) |
| 6 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 7 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 8 | pkorg | 所属组织 | pkorg | varchar(50) |  | 字符串 (String) |
| 9 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 10 | billmaker | 制单人 | billmaker | varchar(50) |  | 字符串 (String) |
| 11 | approver | 审批人 | approver | varchar(50) |  | 字符串 (String) |
| 12 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |