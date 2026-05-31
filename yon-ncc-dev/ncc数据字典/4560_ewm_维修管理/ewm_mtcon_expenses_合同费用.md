# |<<

**合同费用 (ewm_mtcon_expenses / nc.vo.ewm.maintaincon.MaintainConExpensesVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1932.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtcon_expenses | 合同费用主键 | pk_mtcon_expenses | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 5 | pk_expenses_type | 合同费用 | pk_expenses_type | varchar(20) |  | 合同费用定义 (ct_expset) |
| 6 | expenses | 原币金额 | expenses | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | expenses_org | 本币金额 | expenses_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | expenses_group | 本币金额集团 | expenses_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | expenses_global | 本币金额全局 | expenses_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 11 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |