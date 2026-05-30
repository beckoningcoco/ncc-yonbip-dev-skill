# |<<

**内部实物结算清单 (nresa_settlelist / nc.vo.nresa.internalsettlement.matter.SettleListHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3888.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 结算清单 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 结算利润中心 | pk_org | varchar(20) |  | 利润中心 (profitcenter) |
| 4 | pk_org_v | 结算利润中心版本 | pk_org_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 8 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 9 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 10 | taudittime | 审核日期 | taudittime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | fpfstatusflag | 审批状态 | fpfstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |