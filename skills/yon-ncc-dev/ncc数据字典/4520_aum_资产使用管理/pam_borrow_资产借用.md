# |<<

**资产借用 (pam_borrow / nc.vo.aum.borrow.used.BorrowHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4227.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_borrow | 主表主键 | pk_borrow | char(20) | √ | 主键 (UFID) |
| 2 | pk_unit_used_v | 使用权 | pk_unit_used_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 3 | pk_unit_used | 使用权组织版本 | pk_unit_used | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 使用管理组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_org | 使用管理组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | bill_code | 借用单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 8 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |