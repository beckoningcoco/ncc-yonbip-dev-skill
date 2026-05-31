# |<<

**基金清算 (ipmfund_liquidate / nc.vo.ipmfund.fundliquidate.FundLiquidateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3325.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_liquidation | 基金清算主键 | pk_liquidation | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | pk_fundlib | 基金编号 | pk_fundlib | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 7 | vfundname | 基金名称 | vfundname | varchar(200) |  | 字符串 (String) |
| 8 | dfounddate | 成立时间 | dfounddate | char(19) |  | 日期 (UFDate) |
| 9 | pk_fundtype | 基金类型 | pk_fundtype | varchar(20) |  | 基金类型 (FundTypeVO) |
| 10 | norigtargetpaymny | 基金规模 | norigtargetpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nbasetargetpaymny | 基金规模组织本币 | nbasetargetpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | ngptargetpaymny | 基金规模集团本币 | ngptargetpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nalltargetpaymny | 基金规模全局本币 | nalltargetpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | vterminationreason | 基金终止原因 | vterminationreason | varchar(50) |  | 基金终止原因 (TerminationReason) |  | 1=协议约定; |