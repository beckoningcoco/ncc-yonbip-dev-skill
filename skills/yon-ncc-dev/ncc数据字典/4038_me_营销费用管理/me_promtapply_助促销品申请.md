# |<<

**助促销品申请 (me_promtapply / nc.vo.me.m4642.entity.BillHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3617.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 助促销品申请 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | pk_org_v | 销售组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_销售组织版本信息 (salesorg_v) |
| 5 | ctrantypeid | 助促销品申请类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | vtrantypecode | 助促销品申请类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 7 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 8 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 9 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 10 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 11 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 12 | taudittime | 审批日期 | taudittime | char(19) |  | 日期 (UFDate) |
| 13 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillStatus) | 0 | 0=自由; |