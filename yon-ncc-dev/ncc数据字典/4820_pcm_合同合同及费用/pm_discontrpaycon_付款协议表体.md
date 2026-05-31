# |<<

**付款协议表体 (pm_discontrpaycon / nc.vo.pcm.discontr.DiscontrPayconVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4453.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_discontrpaycon | 付款协议主键 | pk_discontrpaycon | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_paymentch | 账期主键 | pk_paymentch | varchar(20) |  | 付款账期 (paymentch) |
| 4 | accouts | 账期号 | accouts | int |  | 整数 (Integer) |
| 5 | accrate | 比率 | accrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | effctdate | 起算依据 | effctdate | varchar(20) |  | 付款时点 (payperiod) |
| 7 | completeratio | 完成百分比(%) | completeratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | effectdateadddate | 起效日期延迟天数 | effectdateadddate | int |  | 整数 (Integer) |
| 9 | paymentday | 账期天数 | paymentday | int |  | 整数 (Integer) |
| 10 | isprepayment | 预付款 | isprepayment | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | isdeposit | 质保金 | isdeposit | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 13 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 14 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 15 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 16 | pk_wbs | 付款里程碑 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 17 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |