# |<<

**收款申请协议子表 (pm_mcontr_inc_plan_p / nc.vo.pcm.incomeplan.IncomePlanProtocolBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4493.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_income_plan_p | 收款申请协议主键 | pk_income_plan_p | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 6 | accouts | 账期号 | accouts | int |  | 整数 (Integer) |
| 7 | income_rate | 收款比例 | income_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | shou_taxmny | 含税申请额 | shou_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | shou_mny | 无税申请额 | shou_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | pk_taxcode | 税码 | pk_taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 11 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | tax | 税额 | tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | effectdate | 起算日期 | effectdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 14 | paymentday | 账期天数 | paymentday | int |  | 整数 (Integer) |
| 15 | deadline | 账期到期日 | deadline | char(19) |  | 日期(结束) (UFDateEnd) |
| 16 | already_shou_taxmny | 已申请金额 | already_shou_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 18 | src_bill_code | 来源单据编码 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 19 | src_bill_type | 来源单据类型 | src_bill_type | varchar(4) |  | 字符串 (String) |
| 20 | src_transi_type | 来源交易类型编码 | src_transi_type | varchar(30) |  | 字符串 (String) |
| 21 | src_pk_transitype | 来源交易类型 | src_pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 22 | not_shou_taxmny | 未申请金额 | not_shou_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | src_tot_taxmny | 来源总金额 | src_tot_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | bdef1 | 自定义项1 | bdef1 | varchar(101) |  | 自定义项 (Custom) |
| 25 | bdef2 | 自定义项2 | bdef2 | varchar(101) |  | 自定义项 (Custom) |
| 26 | bdef3 | 自定义项3 | bdef3 | varchar(101) |  | 自定义项 (Custom) |
| 27 | bdef4 | 自定义项4 | bdef4 | varchar(101) |  | 自定义项 (Custom) |
| 28 | bdef5 | 自定义项5 | bdef5 | varchar(101) |  | 自定义项 (Custom) |
| 29 | bdef6 | 自定义项6 | bdef6 | varchar(101) |  | 自定义项 (Custom) |
| 30 | bdef7 | 自定义项7 | bdef7 | varchar(101) |  | 自定义项 (Custom) |
| 31 | bdef8 | 自定义项8 | bdef8 | varchar(101) |  | 自定义项 (Custom) |
| 32 | bdef9 | 自定义项9 | bdef9 | varchar(101) |  | 自定义项 (Custom) |
| 33 | bdef10 | 自定义项10 | bdef10 | varchar(101) |  | 自定义项 (Custom) |
| 34 | bdef11 | 自定义项11 | bdef11 | varchar(101) |  | 自定义项 (Custom) |
| 35 | bdef12 | 自定义项12 | bdef12 | varchar(101) |  | 自定义项 (Custom) |
| 36 | bdef13 | 自定义项13 | bdef13 | varchar(101) |  | 自定义项 (Custom) |
| 37 | bdef14 | 自定义项14 | bdef14 | varchar(101) |  | 自定义项 (Custom) |
| 38 | bdef15 | 自定义项15 | bdef15 | varchar(101) |  | 自定义项 (Custom) |
| 39 | bdef16 | 自定义项16 | bdef16 | varchar(101) |  | 自定义项 (Custom) |
| 40 | bdef17 | 自定义项17 | bdef17 | varchar(101) |  | 自定义项 (Custom) |
| 41 | bdef18 | 自定义项18 | bdef18 | varchar(101) |  | 自定义项 (Custom) |
| 42 | bdef19 | 自定义项19 | bdef19 | varchar(101) |  | 自定义项 (Custom) |
| 43 | bdef20 | 自定义项20 | bdef20 | varchar(101) |  | 自定义项 (Custom) |