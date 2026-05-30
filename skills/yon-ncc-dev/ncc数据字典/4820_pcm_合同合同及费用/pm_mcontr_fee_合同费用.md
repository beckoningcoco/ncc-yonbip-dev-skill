# |<<

**合同费用 (pm_mcontr_fee / nc.vo.pcm.marketcontract.ContrFeeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4489.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mcontr_fee | 合同费用主键 | pk_mcontr_fee | char(20) | √ | 主键 (UFID) |
| 2 | pk_ct_expset | 费用编码 | pk_ct_expset | varchar(20) |  | 合同费用定义 (ct_expset) |
| 3 | expset_mny_orig | 费用金额（原币） | expset_mny_orig | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 4 | expset_mny_curr | 费用金额（本币） | expset_mny_curr | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 5 | expset_mny_group | 费用金额（集团） | expset_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 6 | expset_mny_global | 费用金额（全局） | expset_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 7 | memo | 备注 | memo | varchar(300) |  | 字符串 (String) |
| 8 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |