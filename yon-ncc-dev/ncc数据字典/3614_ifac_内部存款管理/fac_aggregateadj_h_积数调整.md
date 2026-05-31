# |<<

**积数调整 (fac_aggregateadj_h / nc.vo.fac.aggregate.AggregateAdjVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2076.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_aggregateadj_h | 积数调整主键 | pk_aggregateadj_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 6 | pk_billtypeid | 单据类型ID | pk_billtypeid | varchar(50) |  | 字符串 (String) |
| 7 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 8 | pk_gaincenter | 利润中心 | pk_gaincenter | varchar(20) |  | 利润中心 (profitcenter) |
| 9 | pk_gaincenter_v | 利润中心版本 | pk_gaincenter_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 10 | pk_intobj | 计息对象 | pk_intobj | varchar(20) |  | 账户计息对象 (fac_accinterestobj) |
| 11 | intobjcode | 计息对象编码 | intobjcode | varchar(50) |  | 字符串 (String) |
| 12 | intobjname | 计息对象名称 | intobjname | varchar(260) |  | 字符串 (String) |
| 13 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 14 | intrateattr | 利率属性 | intrateattr | int |  | 利率属性 (Irateattr) |  | 0=普通; |