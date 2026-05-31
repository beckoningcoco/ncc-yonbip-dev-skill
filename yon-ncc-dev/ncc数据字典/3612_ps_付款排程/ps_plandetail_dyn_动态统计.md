# |<<

**动态统计 (ps_plandetail_dyn / nc.vo.ps.plan.PlandetailDSVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4687.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plandyn | 主键 | pk_plandyn | char(20) | √ | 主键 (UFID) |
| 2 | projectcode | 统计项目 | projectcode | varchar(50) |  | 字符串 (String) |
| 3 | projectname | 项目内容 | projectname | varchar(50) |  | 字符串 (String) |
| 4 | applymny | 本次申请金额 | applymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | olcapplymny | 本次申请金额本币（组织） | olcapplymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | prepaymny | 其中预付 | prepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | olcprepaymny | 其中预付本币（组织） | olcprepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | postponedmny | 本期延期 | postponedmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | olcpostponedmny | 本期延期本币（组织） | olcpostponedmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | refusemny | 本次拒付 | refusemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | olcrefusemny | 本次拒付本币（组织） | olcrefusemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | advancemny | 提前支付 | advancemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | planmny | 计划金额 | planmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | olcplanmny | 计划金额本币（组织） | olcplanmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | approvemny | 审批金额 | approvemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | olcapprovemny | 审批金额本币（组织） | olcapprovemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | sanctionmny | 核准金额 | sanctionmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | olcsanctionmny | 核准金额本币（组织） | olcsanctionmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | preunpaymny | 前期未支付 | preunpaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | olcpreunpaymny | 前期未支付本币（组织） | olcpreunpaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | totalpostponedmny | 累计延期 | totalpostponedmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | olctotalpostponedmny | 累计延期本币（组织） | olctotalpostponedmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | totaladvancemny | 累计提前 | totaladvancemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | olctotaladvancemny | 累计提前本币（组织） | olctotaladvancemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | isprepay | 是否预付 | isprepay | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | pk_applyperiod | 申请周期 | pk_applyperiod | varchar(20) |  | 计划期间 (period) |
| 27 | pk_planperiod | 计划期间 | pk_planperiod | varchar(20) |  | 计划期间 (period) |
| 28 | pk_planitem | 计划项目 | pk_planitem | varchar(20) |  | 资金计划项目 (fundplan) |
| 29 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 客商 (custsupplier) |
| 30 | pk_org_sanction | 上级核准组织 | pk_org_sanction | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 31 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 32 | pk_org | 付款组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 33 | currtype_olc | 组织本币 | currtype_olc | varchar(50) |  | 字符串 (String) |