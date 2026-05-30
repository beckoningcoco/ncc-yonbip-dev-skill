# |<<

**贷款合同综合表 (batm_contract / nc.vo.batm.cdmvo.ContractCreditVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/213.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract | 合同主键 | pk_contract | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | contracttype | 合同类型 | contracttype | int |  | 合同类型 (ContracttypeEnum) |  | 1=担保合同; |