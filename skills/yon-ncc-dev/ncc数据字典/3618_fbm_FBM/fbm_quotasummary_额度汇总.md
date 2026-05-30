# |<<

**额度汇总 (fbm_quotasummary / nc.vo.pfbm.quotasummary.QuotasummaryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2149.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_quotasummary | 主键 | pk_quotasummary | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_fundorg | 资金组织 | pk_fundorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 6 | pk_fundorg_v | 资金组织版本 | pk_fundorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 7 | orgrate | 组织本币汇率 | orgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | grouprate | 集团本币汇率 | grouprate | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | globalrate | 全局本币汇率 | globalrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 11 | applyedaccmoney | 已申请累计额度 | applyedaccmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | orgapplyedaccmoney | 组织本币已申请累计额度 | orgapplyedaccmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | groupapplyedaccmoney | 集团本币已申请累计额度 | groupapplyedaccmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | gobalapplyedaccmoney | 全局本币已申请累计额度 | gobalapplyedaccmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | downaccmoney | 累计下拨额度 | downaccmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | orgdownaccmoney | 组织本币累计下拨额度 | orgdownaccmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | groupdownaccmoney | 集团本币累计下拨额度 | groupdownaccmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | globaldownaccmoney | 全局本币累计下拨额度 | globaldownaccmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | upaccmoney | 累计上收额度 | upaccmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | orgupaccmoney | 组织本币累计上收额度 | orgupaccmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | groupupaccmoney | 集团本币累计上收额度 | groupupaccmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | globalupaccmoney | 全局本币累计上收额度 | globalupaccmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | defdate | 日期 | defdate | char(19) |  | 日期 (UFDate) |