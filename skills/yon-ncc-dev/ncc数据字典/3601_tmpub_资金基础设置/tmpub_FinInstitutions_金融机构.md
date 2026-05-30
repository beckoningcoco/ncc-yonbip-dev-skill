# |<<

**金融机构 (tmpub_FinInstitutions / nc.vo.tmpub.financialinstitutions.FinInstitutionsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5763.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fininstitution | 主键 | pk_fininstitution | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | pk_fininstitutiontype | 金融机构类别 | pk_fininstitutiontype | varchar(20) |  | 金融机构类别 (FinancialInstitutionType) |
| 7 | enable_state | 启用状态 | enable_state | varchar(50) |  | 启用状态 (NonbankFinInstEnableState) |  | 1=已启用; |