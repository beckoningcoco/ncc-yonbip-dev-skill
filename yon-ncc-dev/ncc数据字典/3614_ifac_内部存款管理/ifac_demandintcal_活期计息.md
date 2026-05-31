# |<<

**活期计息 (ifac_demandintcal / nc.vo.ifac.ia.DemandIntCalVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3069.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_demandintcal | 活期计息主键 | pk_demandintcal | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 3 | pk_billtypeid | 单据类型标识 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | pk_org | 所属资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 5 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_gaincenter | 利润中心 | pk_gaincenter | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 8 | pk_capitalcenter | 成本中心 | pk_capitalcenter | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | pk_intobj | 对象主键 | pk_intobj | varchar(50) |  | 字符串 (String) |
| 11 | pk_intaccinfo | 对象账户信息PK | pk_intaccinfo | varchar(50) |  | 字符串 (String) |
| 12 | intobjcode | 对象编码 | intobjcode | varchar(50) |  | 字符串 (String) |
| 13 | intobjname | 对象名称 | intobjname | varchar(50) |  | 字符串 (String) |
| 14 | pk_settledate | 结息日编码 | pk_settledate | varchar(20) |  | 结息日 (fi_settledate) |
| 15 | settlemode | 结息方式 | settlemode | varchar(10) |  | 计息方式 (IntmodeEnum) |  | 0=分别计息; |