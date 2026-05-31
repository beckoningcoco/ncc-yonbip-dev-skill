# |<<

**患者优惠类型 (bd_uh_disc / nc.vo.nhbd.price.patidisc.PatiDiscVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1026.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_disc | 优惠类型主键 | pk_disc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 7 | ratio | 自付比例 | ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | mnecode | 输入码 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | flag_active | 启用标识 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 11 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 12 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 13 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 14 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |