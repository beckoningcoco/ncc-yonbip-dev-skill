# |<<

**下拨规则 (sf_allocaterule_h / nc.vo.sf.allocaterule.AllocateRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5257.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocaterule_h | 下拨规则标识 | pk_allocaterule_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypeid | 单据类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | allocatetype | 下拨方式 | allocatetype | int |  | 下拨方式 (allocatetype) |  | 1=自动下拨; |