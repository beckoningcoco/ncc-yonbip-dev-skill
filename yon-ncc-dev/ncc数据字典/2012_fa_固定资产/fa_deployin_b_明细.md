# |<<

**明细 (fa_deployin_b / nc.vo.fa.deployin.DeployInBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2010.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deployin_b | 明细主键 | pk_deployin_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_org_v | 财务组织多版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | pk_accbook_out | 调出卡片所在的账簿 | pk_accbook_out | varchar(20) |  | 字符串 (String) |
| 6 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 字符串 (String) |
| 7 | pk_accbook_scale | 精度账簿 | pk_accbook_scale | varchar(50) |  | 字符串 (String) |
| 8 | pk_card_out | 被调出卡片主键 | pk_card_out | char(20) | √ | 资产卡片 (asset) |
| 9 | pk_card_in | 调入资产卡片 | pk_card_in | varchar(20) |  | 资产卡片 (asset) |
| 10 | card_code | 卡片编号 | card_code | varchar(50) |  | 字符串 (String) |
| 11 | asset_code | 资产编码 | asset_code | varchar(50) |  | 字符串 (String) |
| 12 | asset_name | 资产名称 | asset_name | varchar(400) |  | 字符串 (String) |
| 13 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 14 | card_model | 型号 | card_model | varchar(400) |  | 字符串 (String) |
| 15 | pk_category | 资产类别 | pk_category | varchar(20) |  | 资产类别 (assetcategory) |
| 16 | pk_addreducestyle | 增加方式 | pk_addreducestyle | varchar(20) |  | 增减方式 (AddreduceStyleVO) |
| 17 | pk_mandept | 管理部门最新版本 | pk_mandept | varchar(20) |  | 组织_部门 (dept) |
| 18 | pk_mandept_v | 管理部门 | pk_mandept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 19 | pk_usedept | 使用部门键值 | pk_usedept | varchar(20) |  | 字符串 (String) |
| 20 | pk_assetuser | 使用人 | pk_assetuser | varchar(20) |  | 人员基本信息 (psndoc) |
| 21 | pk_depmethod | 折旧方法 | pk_depmethod | varchar(20) |  | 折旧方法 (depmethod) |
| 22 | pk_usingstatus | 使用状况 | pk_usingstatus | varchar(20) |  | 使用状况 (UsingStatusVO) |
| 23 | deploy_price | 调拨价格 | deploy_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | originvalue | 原币原值 | originvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | localoriginvalue | 本币原值 | localoriginvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | accudep | 累计折旧 | accudep | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | netvalue | 净值 | netvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | predevaluate | 减值准备 | predevaluate | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | netrating | 净额 | netrating | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | salvagerate | 净残值率 | salvagerate | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | salvage | 净残值 | salvage | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | servicemonth | 折旧期数 | servicemonth | int |  | 整数 (Integer) |
| 33 | usedmonth | 已计提期数 | usedmonth | int |  | 整数 (Integer) |
| 34 | begin_date | 开始使用日期 | begin_date | char(19) |  | 日期 (UFDate) |
| 35 | dep_start_date | 折旧开始日期 | dep_start_date | char(19) |  | 日期 (UFDate) |
| 36 | dep_end_date | 折旧截止日期 | dep_end_date | char(19) |  | 日期 (UFDate) |
| 37 | naturemonth | 使用月限 | naturemonth | int |  | 整数 (Integer) |
| 38 | pk_bill_src | 调出单PK | pk_bill_src | varchar(20) |  | 字符串 (String) |
| 39 | pk_bill_b_src | 调出单表体PK | pk_bill_b_src | varchar(20) |  | 字符串 (String) |
| 40 | business_flag | 是否业务账簿 | business_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 41 | tax_input | 进项税 | tax_input | decimal(28, 8) |  | 金额 (UFMoney) |
| 42 | paydept_flag | 折旧承担部门 | paydept_flag | varchar(40) |  | 折旧承担部门 (paydept) |  | M=管理部门; |