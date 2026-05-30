# |<<

**销售合同 (pm_mcontr / nc.vo.pcm.marketcontract.ContractHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4485.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mar_contr | 销售合同主键 | pk_mar_contr | char(20) | √ | 主键 (UFID) |
| 2 | pk_billoid | 销售合同主键旧版本 | pk_billoid | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 5 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 6 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 7 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 8 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | busi_type | 业务流程 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 10 | pk_financeorg | 应收财务组织 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 11 | pk_financeorg_v | 应收财务组织多版本 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 12 | pk_contracttype | 合同类型 | pk_contracttype | varchar(20) |  | 合同类型 (pmcontracttype) |
| 13 | bill_code | 合同编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 14 | bill_name | 合同名称 | bill_name | varchar(300) |  | 多语文本 (MultiLangText) |
| 15 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 16 | pk_projecttype | 项目类型 | pk_projecttype | varchar(20) |  | 项目类型 (projectclass) |
| 17 | contr_version | 版本号 | contr_version | int |  | 整数 (Integer) |
| 18 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 19 | promisetime | 合同签订日期 | promisetime | char(19) |  | 日期 (UFDate) |
| 20 | promiseplace | 签约地点 | promiseplace | varchar(40) |  | 字符串 (String) |
| 21 | pk_promise_dept | 签约部门 | pk_promise_dept | varchar(20) |  | 组织_部门 (dept) |
| 22 | pk_pro_dept_v | 签约部门多版本 | pk_pro_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 23 | pk_promisepsn | 签约人 | pk_promisepsn | varchar(20) |  | 人员基本信息 (psndoc) |
| 24 | plan_validate_time | 计划生效日期 | plan_validate_time | char(19) |  | 日期(开始) (UFDateBegin) |
| 25 | plan_teminate_time | 计划终止日期 | plan_teminate_time | char(19) |  | 日期(结束) (UFDateEnd) |
| 26 | actu_validate_time | 实际生效日期 | actu_validate_time | char(19) |  | 日期(开始) (UFDateBegin) |
| 27 | actu_teminate_time | 实际终止日期 | actu_teminate_time | char(19) |  | 日期(结束) (UFDateEnd) |
| 28 | pk_currtype | 合同币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 29 | pk_org_currtype | 本币 | pk_org_currtype | varchar(20) |  | 币种 (currtype) |
| 30 | nexchangerate | 折本汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | pk_income | 收款协议 | pk_income | varchar(20) |  | 收款协议 (income) |
| 32 | mny_orig | 无税合同额（原币） | mny_orig | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | taxmny_orig | 含税合同额（原币） | taxmny_orig | decimal(28, 8) |  | 金额 (UFMoney) |
| 34 | mny_curr | 无税合同额 | mny_curr | decimal(28, 8) |  | 金额 (UFMoney) |
| 35 | tax | 税额 | tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 36 | taxmny_curr | 含税合同额 | taxmny_curr | decimal(28, 8) |  | 金额 (UFMoney) |
| 37 | mny_group | 无税合同额（集团） | mny_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 38 | taxmny_group | 含税合同额（集团） | taxmny_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 39 | mny_global | 无税合同额（全局） | mny_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 40 | taxmny_global | 含税合同额（全局） | taxmny_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 41 | shou_mny_orig | 无税申请额（原币） | shou_mny_orig | decimal(28, 8) |  | 金额 (UFMoney) |
| 42 | shou_taxmny_orig | 含税申请额（原币） | shou_taxmny_orig | decimal(28, 8) |  | 金额 (UFMoney) |
| 43 | shou_mny_curr | 无税申请额 | shou_mny_curr | decimal(28, 8) |  | 金额 (UFMoney) |
| 44 | shou_taxmny_curr | 含税申请额 | shou_taxmny_curr | decimal(28, 8) |  | 金额 (UFMoney) |
| 45 | invoice_mny | 已票金额 | invoice_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 46 | shou_mny_group | 无税申请额（集团） | shou_mny_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 47 | shou_taxmny_group | 含税申请额（集团） | shou_taxmny_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 48 | shou_mny_global | 无税申请额（全局） | shou_mny_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 49 | shou_taxmny_global | 含税申请额（全局） | shou_taxmny_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 50 | pk_sendcountry | 发货国家/地区 | pk_sendcountry | varchar(20) |  | 国家地区 (countryzone) |
| 51 | pk_rececountry | 收货国家/地区 | pk_rececountry | varchar(20) |  | 国家地区 (countryzone) |
| 52 | pk_taxcountry | 报税国家/地区 | pk_taxcountry | varchar(20) |  | 国家地区 (countryzone) |
| 53 | buysellflag | 购销类型 | buysellflag | int |  | 购销类型 (pursaletype) |  | 1=国内销售; |