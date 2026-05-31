# |<<

**供应商财务信息 (bd_supfinance / nc.vo.bd.supplier.finance.SupFinanceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/974.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supfinance | 供应商财务信息主键 | pk_supfinance | char(20) | √ | 主键 (UFID) |
| 2 | pk_supplier | 供应商基本信息 | pk_supplier | char(0) | √ | 供应商基本信息 (supplier) |
| 3 | pk_org | 所属财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_respdept | 专管部门 | pk_respdept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_resppsn | 专管业务员 | pk_resppsn | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | pk_currtype | 默认交易币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 8 | diffcurrflag | 允许异币种核销 | diffcurrflag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | pk_payterm | 默认付款协议 | pk_payterm | varchar(20) |  | 付款协议 (payment) |
| 10 | cooperateflag | 协同 | cooperateflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | iounit | 筹投资单位 | iounit | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | payfreezeflag | 付款冻结 | payfreezeflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 13 | makeoutfreezeflag | 开票冻结 | makeoutfreezeflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 14 | creditbound | 信用额度 | creditbound | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | grade | 等级 | grade | int |  | 等级 (supgrade) |  | 1=优秀; |