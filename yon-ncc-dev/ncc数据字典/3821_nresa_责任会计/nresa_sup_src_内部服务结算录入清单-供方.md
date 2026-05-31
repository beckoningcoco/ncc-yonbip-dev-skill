# |<<

**内部服务结算录入清单-供方 (nresa_sup_src / nc.vo.nresa.internalsettlent.service.SupSrcVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3902.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_src | 主键 | pk_src | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 供方责任组织 | pk_org | varchar(20) |  | 组织_业务单元_责任组织 (liabilitycenter) |
| 4 | pk_org_v | 供方责任组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_责任组织版本信息 (liabilitycenter_v) |
| 5 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 6 | bookmoney | 责任账簿本币总金额 | bookmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | orgmoney | 责任组织本币总金额 | orgmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | grpmoney | 集团本币总金额 | grpmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | glbmoney | 全局本币总金额 | glbmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 11 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 12 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 13 | approvestatus | 审批状态 | approvestatus | int |  | 结算录入清单状态 (SrcApplyEnum) |  | -1=自由; |