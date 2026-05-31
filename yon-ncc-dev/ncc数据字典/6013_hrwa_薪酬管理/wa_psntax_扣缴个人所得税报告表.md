# |<<

**扣缴个人所得税报告表 (wa_psntax / nc.vo.wa.psntax.PsntaxVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6350.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_data | 薪资发放主键 | pk_wa_data | char(20) |  | 薪资档案 (payfile) |
| 2 | pk_wa_data | 薪资发放主键 | pk_wa_data | varchar(20) |  | 薪资档案 (payfile) |
| 3 | pk_psndoc | 人员基本信息 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 4 | displaytaxitem | 所得项目 | displaytaxitem | varchar(50) |  | 字符串 (String) |
| 5 | income_period | 所得期间 | income_period | char(6) |  | 主键 (UFID) |
| 6 | income | 收入额 | income | decimal(31, 8) |  | 数值 (UFDouble) |
| 7 | duty_free_income | 免税收入额 | duty_free_income | decimal(31, 8) |  | 数值 (UFDouble) |
| 8 | deduction_tax | 允许扣除的税费 | deduction_tax | decimal(31, 8) |  | 数值 (UFDouble) |
| 9 | expense_deduction | 费用扣除标准 | expense_deduction | decimal(31, 8) |  | 数值 (UFDouble) |
| 10 | deduction_donations | 准予扣除的捐赠额 | deduction_donations | decimal(31, 8) |  | 数值 (UFDouble) |
| 11 | tax_payable | 应纳税额 | tax_payable | decimal(31, 8) |  | 数值 (UFDouble) |
| 12 | been_deducted_tax | 已扣税额 | been_deducted_tax | decimal(31, 8) |  | 数值 (UFDouble) |
| 13 | vmemo | 备注 | vmemo | varchar(500) |  | 字符串 (String) |
| 14 | taxable_income | 应纳税所得额 | taxable_income | decimal(31, 8) |  | 数值 (UFDouble) |
| 15 | tax_rate | 税率 | tax_rate | decimal(9, 6) |  | 数值 (UFDouble) |
| 16 | nquickdebuct | 速算扣除数 | nquickdebuct | decimal(31, 8) |  | 数值 (UFDouble) |