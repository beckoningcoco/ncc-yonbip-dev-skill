# |<<

**票据池中心额度管理 (fbm_quotamanagerment / nc.vo.pfbm.quotamanagerment.QuotaManagermentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2147.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_quotamanagement | 主键 | pk_quotamanagement | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 3 | pk_org_v | 资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 4 | applyorg | 申请单财务组织 | applyorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | applyorg_v | 申请单财务组织版本 | applyorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | applyquota | 申请额度 | applyquota | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | applyquotacount | 累计申请额度 | applyquotacount | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | downquota | 下拨额度 | downquota | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | orgdownquota | 组织本币下拨额度 | orgdownquota | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | groupdownquota | 集团本币下拨额度 | groupdownquota | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | globaldownquota | 全局本币下拨额度 | globaldownquota | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | downquotacount | 累计下拨额度 | downquotacount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | orgdownquotacount | 组织本币累计下拨额度 | orgdownquotacount | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | groupdownquotacount | 集团本币累计下拨额度 | groupdownquotacount | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | globaldownquotacount | 全局本币累计下拨额度 | globaldownquotacount | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | upquota | 上收额度 | upquota | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | orgupquota | 组织本币上收额度 | orgupquota | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | groupupquota | 集团本币上收额度 | groupupquota | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | globalupquota | 全局本币上收额度 | globalupquota | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | remainquota | 剩余额度 | remainquota | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | orgremainquota | 组织本币剩余额度 | orgremainquota | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | groupremainquota | 集团本币剩余额度 | groupremainquota | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | globalremainquota | 全局本币剩余额度 | globalremainquota | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | vbillno | 单据编码 | vbillno | varchar(50) |  | 字符串 (String) |
| 28 | busistatus | 单据状态 | busistatus | int |  | 票据池-中心额度管理单据状态枚举 (FBMBillStatusEnum) |  | -1=已作废; |