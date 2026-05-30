# |<<

**明细 (fa_alter_b / nc.vo.fa.alter.AlterBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1986.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alter_b | 变动单子表标识 | pk_alter_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | pk_accbook | 账簿主键 | pk_accbook | varchar(20) |  | 字符串 (String) |
| 6 | pk_card | 资产卡片 | pk_card | char(20) | √ | 资产卡片 (asset) |
| 7 | pk_currency | 币种主键 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 8 | localcurr_rate | 主币汇率 | localcurr_rate | decimal(16, 8) |  | 数值 (UFDouble) |
| 9 | pk_reason | 变动原因 | pk_reason | varchar(20) |  | 原因 (reason) |
| 10 | istrace | 是否追溯 | istrace | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | tracedate | 追溯日期 | tracedate | char(19) |  | 日期 (UFDate) |
| 12 | dep_value_current | 影响本期折旧 | dep_value_current | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | trace_interest | 追溯利息 | trace_interest | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | dep_value_before | 影响前期折旧 | dep_value_before | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | remark | 备注 | remark | varchar(200) |  | 字符串 (String) |
| 16 | defpk | 自定义项主键 | defpk | varchar(256) |  | 字符串 (String) |
| 17 | originvalue_cal_before | 变动前计算本币原值 | originvalue_cal_before | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | accudep_cal_before | 变动前计算累计折旧 | accudep_cal_before | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | servicemonth_cal_before | 变动前计算折旧期数 | servicemonth_cal_before | int |  | 整数 (Integer) |
| 20 | usedmonth_cal_before | 变动前计算已计提期数 | usedmonth_cal_before | int |  | 整数 (Integer) |
| 21 | pk_bill_src | 来源单据标识 | pk_bill_src | varchar(20) |  | 字符串 (String) |
| 22 | pk_bill_b_src | 来源单据表体标识 | pk_bill_b_src | varchar(20) |  | 字符串 (String) |
| 23 | pk_fundsource | 资金来源 | pk_fundsource | varchar(50) |  | 字符串 (String) |
| 24 | pk_fundsourcealter | 资金来源调整主键 | pk_fundsourcealter | varchar(2000) |  | 字符串 (String) |
| 25 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 45 | fundsourcealter | 资金来源调整 | fundsourcealter | varchar(101) |  | 自定义项 (Custom) |