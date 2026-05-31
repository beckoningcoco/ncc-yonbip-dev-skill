# |<<

**合同基本 (pm_mcontr_works / nc.vo.pcm.marketcontract.ContrWorksVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4496.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mcontr_works | 合同基本主键 | pk_mcontr_works | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | income_name | 收入项名称 | income_name | varchar(80) |  | 字符串 (String) |
| 4 | pk_checkfactor | 核算要素 | pk_checkfactor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 5 | mny_orig | 无税合同额（原币） | mny_orig | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 6 | taxmny_orig | 含税合同额（原币） | taxmny_orig | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 7 | mny_curr | 无税合同额 | mny_curr | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 8 | pk_taxcode | 税码 | pk_taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 9 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | taxtype | 扣税类别 | taxtype | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |