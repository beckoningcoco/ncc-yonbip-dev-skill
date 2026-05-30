# |<<

**余额调节表审核 (gl_balanceadjust / nc.vo.cmp.cb.BalanceAdjustResultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2351.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balanceadjust | 余额调节表审核主键 | pk_balanceadjust | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 3 | pk_account | 对账账户主键 | pk_account | varchar(20) |  | 字符串 (String) |
| 4 | account | 对账账户名称 | account | varchar(50) |  | 字符串 (String) |
| 5 | linkmemo | 账户备注 | linkmemo | varchar(181) |  | 字符串 (String) |
| 6 | startdate | 启用日期 | startdate | char(19) |  | 日期 (UFDate) |
| 7 | begdate | 开始日期 | begdate | char(19) |  | 日期 (UFDate) |
| 8 | enddate | 截止日期 | enddate | char(19) |  | 日期 (UFDate) |
| 9 | bankbalance | 银行对账单余额 | bankbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | pk_link | 账户关联表主键 | pk_link | varchar(20) |  | 字符串 (String) |
| 11 | billbalance | 单位日记账余额 | billbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | bankbalanceafter | 银行调整后余额 | bankbalanceafter | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | billbalanceafter | 单位调整后余额 | billbalanceafter | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | approver | 审核人 | approver | varchar(50) |  | 字符串 (String) |
| 15 | approvedate | 审核日期 | approvedate | char(19) |  | 日期 (UFDate) |
| 16 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 17 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 18 | pk_approver | 审核人主键 | pk_approver | varchar(20) |  | 字符串 (String) |