# |<<

**收款协议 (pm_mcontr_income / nc.vo.pcm.marketcontract.ContrIncomeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4494.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paymentch | 账期主键 | pk_paymentch | char(20) | √ | 主键 (UFID) |
| 2 | showorder | 账期号 | showorder | int |  | 整数 (Integer) |
| 3 | accrate | 收款比例 | accrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | effectdate | 起算依据 | effectdate | varchar(20) |  | 收款时点 (incomeperiod) |
| 5 | finishpercent | 完成百分比（%） | finishpercent | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | effectdateadddate | 起效日期延迟天数 | effectdateadddate | int |  | 整数 (Integer) |
| 7 | paymentday | 账期天数 | paymentday | int |  | 整数 (Integer) |
| 8 | prepayment | 预收款 | prepayment | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | isdeposit | 质保金 | isdeposit | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 11 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 12 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 13 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 14 | pk_wbs | 收款里程碑 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 15 | shou_taxmny | 累计申请金额 | shou_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | qual_time | 质保期(月) | qual_time | int |  | 整数 (Integer) |
| 17 | taxmny | 金额 | taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | tot_bal_taxmny | 累计含税结算金额 | tot_bal_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | pk_child_oid | 收款协议原始主键 | pk_child_oid | varchar(20) |  | 字符串 (String) |
| 20 | bdef1 | 自定义项1 | bdef1 | varchar(101) |  | 自定义项 (Custom) |
| 21 | bdef2 | 自定义项2 | bdef2 | varchar(101) |  | 自定义项 (Custom) |
| 22 | bdef3 | 自定义项3 | bdef3 | varchar(101) |  | 自定义项 (Custom) |
| 23 | bdef4 | 自定义项4 | bdef4 | varchar(101) |  | 自定义项 (Custom) |
| 24 | bdef5 | 自定义项5 | bdef5 | varchar(101) |  | 自定义项 (Custom) |
| 25 | bdef6 | 自定义项6 | bdef6 | varchar(101) |  | 自定义项 (Custom) |
| 26 | bdef7 | 自定义项7 | bdef7 | varchar(101) |  | 自定义项 (Custom) |
| 27 | bdef8 | 自定义项8 | bdef8 | varchar(101) |  | 自定义项 (Custom) |
| 28 | bdef9 | 自定义项9 | bdef9 | varchar(101) |  | 自定义项 (Custom) |
| 29 | bdef10 | 自定义项10 | bdef10 | varchar(101) |  | 自定义项 (Custom) |
| 30 | bdef11 | 自定义项11 | bdef11 | varchar(101) |  | 自定义项 (Custom) |
| 31 | bdef12 | 自定义项12 | bdef12 | varchar(101) |  | 自定义项 (Custom) |
| 32 | bdef13 | 自定义项13 | bdef13 | varchar(101) |  | 自定义项 (Custom) |
| 33 | bdef14 | 自定义项14 | bdef14 | varchar(101) |  | 自定义项 (Custom) |
| 34 | bdef15 | 自定义项15 | bdef15 | varchar(101) |  | 自定义项 (Custom) |
| 35 | bdef16 | 自定义项16 | bdef16 | varchar(101) |  | 自定义项 (Custom) |
| 36 | bdef17 | 自定义项17 | bdef17 | varchar(101) |  | 自定义项 (Custom) |
| 37 | bdef18 | 自定义项18 | bdef18 | varchar(101) |  | 自定义项 (Custom) |
| 38 | bdef19 | 自定义项19 | bdef19 | varchar(101) |  | 自定义项 (Custom) |
| 39 | bdef20 | 自定义项20 | bdef20 | varchar(101) |  | 自定义项 (Custom) |