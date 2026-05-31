# |<<

**方案比选信息 (fd_selectdetail / nc.vo.fd.fdmanage.select.FdSelectDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2187.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fdselectdetail_b | 主键 | pk_fdselectdetail_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vbillno | 单据编码 | vbillno | varchar(50) |  | 字符串 (String) |
| 6 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 7 | summary | 摘要 | summary | varchar(200) |  | 备注 (Memo) |
| 8 | remark | 详细说明 | remark | varchar(200) |  | 备注 (Memo) |
| 9 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | selectrank | 比选排名 | selectrank | int |  | 整数 (Integer) |
| 13 | selectresult | 比选结果 | selectresult | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | resultthink | 比选结果分析 | resultthink | varchar(500) |  | 字符串 (String) |
| 15 | programmecode | 融资方案编码 | programmecode | varchar(50) |  | 字符串 (String) |
| 16 | pk_financeorg | 融资机构 | pk_financeorg | varchar(20) |  | 非银行金融机构 (NonbankFinInstitution) |
| 17 | financemny | 融资金额 | financemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | olcfinancemny | 融资本币金额 | olcfinancemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | financecost | 融资成本 | financecost | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | olcfinancecost | 融资成本本币 | olcfinancecost | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | costrate | 综合成本率 | costrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 23 | financepurpose | 融资用途 | financepurpose | varchar(500) |  | 字符串 (String) |
| 24 | pk_finvariety | 融资品种 | pk_finvariety | varchar(20) |  | 投融资品种 (FinVarietyVO) |
| 25 | repaymentmethod | 还款方式 | repaymentmethod | varchar(20) |  | 还款方式 (RepaymentMethod) |
| 26 | settleday | 结息日 | settleday | varchar(20) |  | 结息日 (fi_settledate) |
| 27 | guaranteemode | 担保方式 | guaranteemode | int |  | 担保方式 (guaranteemode) |  | 1=信用; |