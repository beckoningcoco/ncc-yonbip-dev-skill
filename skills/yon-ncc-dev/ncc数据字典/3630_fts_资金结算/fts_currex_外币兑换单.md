# |<<

**外币兑换单 (fts_currex / nc.vo.fts.currex.CurrExVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2308.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_currex_h | 外币兑换单ID | pk_currex_h | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 外币兑换单号 | vbillno | varchar(40) |  | 字符串 (String) |
| 3 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 4 | pk_billtypeid | 单据类型标识 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 7 | pk_org_v | 所属资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 8 | pk_gaincenter | 利润中心 | pk_gaincenter | varchar(20) |  | 利润中心 (profitcenter) |
| 9 | pk_costcenter | 成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 10 | busitype | 业务类型 | busitype | varchar(50) |  | 业务类型 (busitype) |  | purchasing=买入外汇; |