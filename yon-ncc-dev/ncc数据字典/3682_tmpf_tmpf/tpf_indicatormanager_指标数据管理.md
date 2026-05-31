# |<<

**指标数据管理 (tpf_indicatormanager / nc.vo.tmpf.indicatormanager.IndicatormanagerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5826.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indicatormanager | 指标数据管理主键 | pk_indicatormanager | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 单据号 | vbillno | varchar(50) |  | 字符串 (String) |
| 3 | pk_indicatorlibrary | 指标库主键 | pk_indicatorlibrary | varchar(20) |  | 指标库 (IndicatorlibraryVO) |
| 4 | indicatorcode | 预测指标编号 | indicatorcode | varchar(50) |  | 字符串 (String) |
| 5 | indicatorname | 预测指标名称 | indicatorname | varchar(50) |  | 字符串 (String) |
| 6 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 8 | transactioner | 交易对手主键 | transactioner | varchar(20) |  | 字符串 (String) |
| 9 | transactionername | 交易对手名称 | transactionername | varchar(50) |  | 字符串 (String) |
| 10 | isbackgroundtask | 是否通过自动任务获取 | isbackgroundtask | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | transactiondate | 交易日期 | transactiondate | char(19) |  | 日期 (UFDate) |
| 12 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 13 | capitalinflow | 资金流入额 | capitalinflow | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | capitaloutflow | 资金流出额 | capitaloutflow | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | src_pkid | 业务单据主键 | src_pkid | char(20) |  | 字符串 (String) |
| 16 | src_vbillno | 业务单据编号 | src_vbillno | varchar(50) |  | 字符串 (String) |
| 17 | src_pk_billtypeid | 业务单据类型主键 | src_pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 18 | src_billtypecode | 业务单据类型编号 | src_billtypecode | varchar(50) |  | 字符串 (String) |
| 19 | src_billtypename | 业务单据类型名称 | src_billtypename | varchar(50) |  | 字符串 (String) |
| 20 | src_billdate | 业务单据日期 | src_billdate | char(19) |  | 日期 (UFDate) |
| 21 | cashflow | 现金流向 | cashflow | varchar(50) |  | 现金流向 (CashflowEnum) |  | 0=流入; |