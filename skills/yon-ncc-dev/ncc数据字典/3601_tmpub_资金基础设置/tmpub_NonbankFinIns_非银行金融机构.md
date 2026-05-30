# |<<

**非银行金融机构 (tmpub_NonbankFinIns / nc.vo.tmpub.bd.nonbankfininstitution.NonbankFinInstitutionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5768.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_nonbankfinins | 主键 | pk_nonbankfinins | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | summary | 摘要 | summary | varchar(200) |  | 备注 (Memo) |
| 6 | remark | 详细说明 | remark | varchar(200) |  | 备注 (Memo) |
| 7 | name | 金融机构名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 9 | type | 机构类别 | type | varchar(20) |  | 非银行金融机构类别 (NonbankType) |
| 10 | province | 省 | province | varchar(50) |  | 字符串 (String) |
| 11 | city | 市 | city | varchar(50) |  | 字符串 (String) |
| 12 | phone | 电话 | phone | varchar(50) |  | 字符串 (String) |
| 13 | address | 地址 | address | varchar(50) |  | 字符串 (String) |
| 14 | enable_state | 启用状态 | enable_state | varchar(50) |  | 启用状态 (NonbankFinInstEnableState) |  | 1=已启用; |