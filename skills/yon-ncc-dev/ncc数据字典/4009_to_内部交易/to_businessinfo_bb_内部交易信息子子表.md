# |<<

**内部交易信息子子表 (to_businessinfo_bb / nc.vo.to.businessinfo.entity.BusinessinfoBBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5788.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbusiness_bbid | 内部交易信息子子表 | cbusiness_bbid | char(20) | √ | 主键 (UFID) |
| 2 | cbusinessid | 内部交易信息主表 | cbusinessid | char(20) |  | 主键 (UFID) |
| 3 | csettlepath_bid | 结算路径子表 | csettlepath_bid | varchar(20) |  | 结算路径子表 (to_settlepath_b) |
| 4 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |