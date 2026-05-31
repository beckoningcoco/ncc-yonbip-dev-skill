# |<<

**模拟折旧主表 (fa_simulatedep / nc.vo.fa.simulatedep.SimulateDepHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2061.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_simulatedep | 主键 | pk_simulatedep | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_accbook1 | 账簿1 | pk_accbook1 | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 4 | pk_program1 | 模拟折旧设置1 | pk_program1 | varchar(20) |  | 模拟折旧设置 (DepProgramHeadVO) |
| 5 | iscompare1 | 账簿1是否差异比较 | iscompare1 | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_accbook2 | 账簿2 | pk_accbook2 | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 7 | pk_program2 | 模拟折旧设置2 | pk_program2 | varchar(20) |  | 模拟折旧设置 (DepProgramHeadVO) |
| 8 | iscompare2 | 账簿2是否差异比较 | iscompare2 | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | pk_accbook3 | 账簿3 | pk_accbook3 | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 10 | pk_program3 | 模拟折旧设置3 | pk_program3 | varchar(20) |  | 模拟折旧设置 (DepProgramHeadVO) |
| 11 | iscompare3 | 账簿3是否差异比较 | iscompare3 | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_accbook4 | 账簿4 | pk_accbook4 | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 13 | pk_program4 | 模拟折旧设置4 | pk_program4 | varchar(20) |  | 模拟折旧设置 (DepProgramHeadVO) |
| 14 | iscompare4 | 账簿4是否差异比较 | iscompare4 | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | begindate | 模拟折旧开始日期 | begindate | char(19) |  | 日期 (UFDate) |
| 16 | enddate | 模拟折旧结束日期 | enddate | char(19) |  | 日期 (UFDate) |
| 17 | bill_code | 模拟单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 18 | bill_date | 单据日期 | bill_date | char(19) |  | 日期 (UFDate) |
| 19 | bill_operator | 操作员 | bill_operator | varchar(20) |  | 用户 (user) |
| 20 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 21 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 22 | tb_flag | 预算取数 | tb_flag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 23 | simulatedep_name | 模拟折旧名称 | simulatedep_name | varchar(200) |  | 多语文本 (MultiLangText) |