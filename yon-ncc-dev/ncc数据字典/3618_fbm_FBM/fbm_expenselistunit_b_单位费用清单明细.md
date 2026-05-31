# |<<

**单位费用清单明细 (fbm_expenselistunit_b / nc.vo.pfbm.expenselistunit.ExpenselistunitBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2134.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expenselistunit_b | 主键 | pk_expenselistunit_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_expenselistunit | 主表主键 | pk_expenselistunit | varchar(20) |  | 字符串 (String) |
| 3 | pk_register | 票据编号 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 4 | pk_openregister | 信用证合同号 | pk_openregister | varchar(50) |  | 字符串 (String) |
| 5 | pk_credcurr | 信用证币种 | pk_credcurr | varchar(20) |  | 币种 (currtype) |
| 6 | pk_billcurr | 票据币种 | pk_billcurr | varchar(20) |  | 币种 (currtype) |
| 7 | memo | 摘要 | memo | varchar(300) |  | 字符串 (String) |
| 8 | startchargdate | 开始计费日期 | startchargdate | char(19) |  | 日期 (UFDate) |
| 9 | endchargdate | 结束计费日期 | endchargdate | char(19) |  | 日期 (UFDate) |
| 10 | chargdays | 计费天数 | chargdays | varchar(3) |  | 字符串 (String) |
| 11 | yrate | 年利率 | yrate | decimal(28, 4) |  | 数值 (UFDouble) |
| 12 | myate | 月利率 | myate | decimal(28, 4) |  | 数值 (UFDouble) |
| 13 | drate | 日利率 | drate | decimal(28, 4) |  | 数值 (UFDouble) |
| 14 | pk_unitusect | 使用费率 | pk_unitusect | varchar(20) |  | 使用费管理 (fbm_usectmanage) |
| 15 | pk_occupyctmanage | 占用费率 | pk_occupyctmanage | varchar(20) |  | 占用费管理 (fbm_occupyctmanage) |
| 16 | occunitrate | 占用单位额度费率 | occunitrate | decimal(28, 4) |  | 数值 (UFDouble) |
| 17 | occsharerate | 占用共享额度费率 | occsharerate | decimal(28, 4) |  | 数值 (UFDouble) |
| 18 | billmoney | 票据金额 | billmoney | decimal(28, 4) |  | 数值 (UFDouble) |
| 19 | aoccunitamount | 实际占用单位额度 | aoccunitamount | decimal(28, 4) |  | 数值 (UFDouble) |
| 20 | aoccshareamount | 实际占用共享额度 | aoccshareamount | decimal(28, 4) |  | 数值 (UFDouble) |
| 21 | payocccost | 支付占用费 | payocccost | decimal(28, 4) |  | 数值 (UFDouble) |
| 22 | unitamountcost | 单位额度使用费 | unitamountcost | decimal(28, 4) |  | 数值 (UFDouble) |
| 23 | shareamountcost | 共享额度使用费 | shareamountcost | decimal(28, 4) |  | 数值 (UFDouble) |
| 24 | olcrate | 组织本币汇率 | olcrate | decimal(28, 4) |  | 数值 (UFDouble) |
| 25 | glcrate | 集团本币汇率 | glcrate | decimal(28, 4) |  | 数值 (UFDouble) |
| 26 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 4) |  | 数值 (UFDouble) |
| 27 | olcsumbillamount | 组织本币金额 | olcsumbillamount | decimal(28, 4) |  | 数值 (UFDouble) |
| 28 | glcsumbillamount | 集团本币金额 | glcsumbillamount | decimal(28, 4) |  | 数值 (UFDouble) |
| 29 | gllcsumbillamount | 全局本币金额 | gllcsumbillamount | decimal(28, 4) |  | 数值 (UFDouble) |
| 30 | pk_chargeperson | 计费人 | pk_chargeperson | varchar(20) |  | 用户 (user) |
| 31 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |