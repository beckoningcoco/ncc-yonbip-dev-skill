# |<<

**合同税费设置 (tmpub_taxsetting / nc.vo.tmpub.taxsetting.ContTaxSettingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5775.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxsetting | 主键 | pk_taxsetting | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | code | 合同类型编码 | code | int |  | 整数 (Integer) |
| 6 | name | 合同类型名称 | name | varchar(50) |  | 合同类型 (ContractTypeEnum) |  | BANKCREDIT=银行贷款合同; |