# |<<

**账簿初始化明细 (fa_initaccbook_b / nc.vo.fa.initaccbook.InitAccbookBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2027.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_initaccbook_b | 主键 | pk_initaccbook_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_cardhistory | 卡片历史表主键 | pk_cardhistory | varchar(20) |  | 多账簿历史（后台） (history_tab) |
| 3 | pk_card | 资产卡片 | pk_card | varchar(20) |  | 资产卡片（后台） (CardVO) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 财务组织组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | localoriginvalue | 本币原值 | localoriginvalue | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 8 | accudep | 累计折旧 | accudep | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 9 | predevaluate | 减值准备 | predevaluate | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 10 | salvage | 净残值 | salvage | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | salvagerate | 净残值率 | salvagerate | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , 100] |
| 12 | pk_depmethod | 折旧方法 | pk_depmethod | varchar(20) |  | 折旧方法 (depmethod) |
| 13 | pk_category | 资产类别 | pk_category | varchar(20) |  | 资产类别 (assetcategory) |
| 14 | netrating | 净额 | netrating | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | netvalue | 净值 | netvalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | dep_start_date | 折旧开始日期 | dep_start_date | char(19) |  | 日期 (UFDate) |
| 17 | dep_end_date | 折旧截止日期 | dep_end_date | char(19) |  | 日期 (UFDate) |
| 18 | naturemonth | 使用月限 | naturemonth | int |  | 整数 (Integer) |  | [0 , ] |
| 19 | servicemonth | 折旧期数 | servicemonth | int |  | 整数 (Integer) |  | [0 , ] |
| 20 | usedmonth | 已计提期数 | usedmonth | int |  | 整数 (Integer) |  | [0 , ] |
| 21 | accuworkloan | 累计工作量 | accuworkloan | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | allworkloan | 工作总量 | allworkloan | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | laststate_flag | 最新状态 | laststate_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | ismodified | 修改标志 | ismodified | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | isimported | 是否已导入 | isimported | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | taxinput_flag | 抵扣进项税标记 | taxinput_flag | char(1) |  | 布尔类型 (UFBoolean) |