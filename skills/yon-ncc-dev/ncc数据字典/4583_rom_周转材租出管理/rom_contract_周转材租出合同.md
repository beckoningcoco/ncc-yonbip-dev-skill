# |<<

**周转材租出合同 (rom_contract / nc.vo.rom.contract.ContractHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4984.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract | 租出合同主键 | pk_contract | char(20) | √ | 主键 (UFID) |
| 2 | pk_contract_base | 租出合同源版主键 | pk_contract_base | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 出租组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 出租组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 6 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 8 | busi_type | 业务类型 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 9 | business_date | 业务日期 | business_date | char(19) |  | 日期 (UFDate) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | pk_fiorg | 财务组织最新版本 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 12 | pk_fiorg_v | 财务组织 | pk_fiorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 13 | pk_raorg | 利润中心最新版本 | pk_raorg | varchar(20) |  | 利润中心 (profitcenter) |
| 14 | pk_raorg_v | 利润中心 | pk_raorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 15 | pk_customer | 承租方 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 16 | pk_supplier | 出租方 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 17 | pk_org_in_v | 承租组织 | pk_org_in_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 18 | pk_org_in | 承租组织最新版本 | pk_org_in | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 19 | bill_code | 合同编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 20 | contract_no | 合同号 | contract_no | varchar(50) |  | 字符串 (String) |
| 21 | contract_name | 合同名称 | contract_name | varchar(200) |  | 字符串 (String) |
| 22 | contract_verion | 合同版本号 | contract_verion | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | bill_status | 合同状态 | bill_status | int |  | 周转材合同状态 (RMContractStatus) |  | 0=自由态; |