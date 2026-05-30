# |<<

**赠品兑付物料范围设置主实体 (so_lrgcashmar / nc.vo.me.lrgcashmar.entity.LrgCashMarHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5414.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lrgcashmar | 赠品兑付物料范围设置主实体 | pk_lrgcashmar | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | cchanneltypeid | 渠道类型 | cchanneltypeid | varchar(20) |  | 渠道类型 (channeltype) |
| 5 | ccustbaseclassid | 客户分类 | ccustbaseclassid | varchar(20) |  | 客户基本分类 (custclass) |
| 6 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 7 | carsubtypeid | 客户费用单类型 | carsubtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | caskunicode | 匹配优先码 | caskunicode | char(10) |  | 字符串 (String) |
| 9 | customerinnercode | 客户分类内码 | customerinnercode | varchar(230) |  | 字符串 (String) |
| 10 | saleorginnercode | 销售组织内码 | saleorginnercode | varchar(230) |  | 字符串 (String) |