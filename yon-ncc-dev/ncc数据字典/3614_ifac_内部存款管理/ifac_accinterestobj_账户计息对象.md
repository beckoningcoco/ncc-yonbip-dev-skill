# |<<

**账户计息对象 (ifac_accinterestobj / nc.vo.ifac.interestobj.AccInterestObjVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3065.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accintobj | 计息对象主键 | pk_accintobj | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypeid | 单据类型标识 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | pk_org | 所属资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 4 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_gaincenter | 利润中心 | pk_gaincenter | varchar(20) |  | 利润中心 (profitcenter) |
| 7 | pk_capitalcenter | 成本中心 | pk_capitalcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 8 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 9 | objcode | 对象编码 | objcode | varchar(50) | √ | 字符串 (String) |
| 10 | intobjname | 对象名称 | intobjname | varchar(50) |  | 字符串 (String) |
| 11 | intmode | 计息方式 | intmode | varchar(50) |  | 计息方式 (IntmodeEnum) |  | 0=分别计息; |