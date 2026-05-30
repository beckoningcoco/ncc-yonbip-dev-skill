# |<<

**付款计划 (fct_ap_plan / nc.vo.fct.ap.entity.CtApPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2170.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fct_ap_plan | 付款计划主键 | pk_fct_ap_plan | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | accountnum | 账期号 | accountnum | int |  | 整数 (Integer) |
| 6 | planrate | 计划比例 | planrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | pk_payperiod | 起效依据 | pk_payperiod | varchar(20) |  | 付款时点 (payperiod) |
| 8 | begindate | 起算日期 | begindate | char(19) |  | 日期 (UFDate) |
| 9 | accountdate | 账期天数 | accountdate | int |  | 整数 (Integer) |
| 10 | enddate | 计划到期日 | enddate | char(19) |  | 日期 (UFDate) |
| 11 | planmoney | 计划金额 | planmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | orgmoney | 组织本币金额 | orgmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | groupmoney | 集团本币金额 | groupmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | glomoney | 全局本币金额 | glomoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | balancemoney | 累计原币付款金额 | balancemoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | paytype | 预付款 | paytype | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | moneytype | 质保金 | moneytype | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | paymontype | 付款类型 | paymontype | varchar(20) |  | 收付款类型 (recpaytype) |
| 19 | pk_financeorg | 财务组织冗余 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 20 | pk_financeorg_v | 财务组织版本冗余 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 21 | norikpmny | 累计原币收票金额 | norikpmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | balancemoneyorg | 累计本币付款金额 | balancemoneyorg | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | unconfpaymentori | 未确认原币付款金额 | unconfpaymentori | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | unconfpaymentorg | 未确认本币付款金额 | unconfpaymentorg | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |