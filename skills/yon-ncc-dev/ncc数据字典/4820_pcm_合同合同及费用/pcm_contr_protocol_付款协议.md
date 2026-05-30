# |<<

**付款协议 (pcm_contr_protocol / nc.vo.pcm.contract.ContrPayVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4349.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr_pay | 付款协议主键 | pk_contr_pay | char(20) | √ | 主键 (UFID) |
| 2 | pk_child_oid | 付款协议原始主键 | pk_child_oid | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 6 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 7 | accouts | 账期号 | accouts | int |  | 整数 (Integer) |
| 8 | pk_paymentch | 账期主键 | pk_paymentch | varchar(20) |  | 付款账期 (paymentch) |
| 9 | taxmny | 金额 | taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | accrate | 比率 | accrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | pk_wbs | 付款里程碑 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 12 | completeratio | 完成百分比(%) | completeratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | paymentday | 账期天数 | paymentday | int |  | 整数 (Integer) |
| 14 | isprepayment | 预付款 | isprepayment | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | isdeposit | 质保金 | isdeposit | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | qual_time | 质保期(月) | qual_time | int |  | 整数 (Integer) |
| 17 | sched_taxmny | 累计进度款 | sched_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | tot_sld_taxmny | 含税累计应付 | tot_sld_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 20 | oprnum | 操作次数 | oprnum | int |  | 整数 (Integer) | 0 |
| 21 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |