# |<<

**周转材租入合同 (rlm_contract / nc.vo.rlm.contract.ContractHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4932.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract | 租入合同主键 | pk_contract | char(20) | √ | 主键 (UFID) |
| 2 | pk_contract_base | 租入合同源版主键 | pk_contract_base | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 承租组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 承租组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | lease_type | 租赁方式 | lease_type | int |  | 周转材租赁方式 (leasetype) |  | 1=外部租赁; |