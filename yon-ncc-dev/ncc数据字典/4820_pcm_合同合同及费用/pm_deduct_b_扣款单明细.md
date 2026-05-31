# |<<

**扣款单明细 (pm_deduct_b / nc.vo.pcm.deduct.DeductBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4448.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deduct_b | 扣款单子表主键 | pk_deduct_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 组织最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 6 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 7 | deduct_explain | 扣款说明 | deduct_explain | varchar(200) |  | 字符串 (String) |
| 8 | verify_mny | 核销金额 | verify_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | deduct_mny | 无税扣款额 | deduct_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | deduct_taxmny | 含税扣款额 | deduct_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | pk_taxcode | 税码 | pk_taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 12 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | taxtype | 扣税类别 | taxtype | int |  | 扣税类别 (taxtype) | 1 | 1=应税外加; |