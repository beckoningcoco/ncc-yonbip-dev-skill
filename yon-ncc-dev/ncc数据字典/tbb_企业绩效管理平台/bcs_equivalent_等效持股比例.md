# |<<

**等效持股比例 (bcs_equivalent / nc.vo.epm.bcs.equivalent.BCSEquivalentStakeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/278.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_equivalent | 等效持股比例主键 | pk_equivalent | char(20) | √ | 主键 (UFID) |
| 2 | pk_investscheme | 股权投资方案 | pk_investscheme | varchar(20) |  | 股权投资方案web (bcs_stockinvestscheme) |
| 3 | investor | 投资方 | investor | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | investee | 被投资方 | investee | char(20) |  | 主键 (UFID) |
| 5 | investdate | 投资日 | investdate | char(19) |  | 日期 (UFDate) |
| 6 | investproportion | 投资比例变动(%) | investproportion | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | totalstockratio | 累计持股比例(%) | totalstockratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | assessmode | 核算方式 | assessmode | int |  | 整数 (Integer) |
| 9 | autogenervoucher | 自动生成合并报表调整凭证 | autogenervoucher | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | dataoriginflag | 分布式 | dataoriginflag | int |  | 整数 (Integer) |
| 11 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 12 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 13 | controlinvest | 控制型投资 | controlinvest | varchar(20) |  | 权益投资类型(自定义档案) (Defdoc-BM_INVTYPE) |
| 14 | pk_repmanastru | 合并管理结构 | pk_repmanastru | varchar(20) |  | 组织结构_报表合并体系 (reportcombinestru) |
| 15 | bm_scope | 合并范围 | bm_scope | char(20) | √ | 组织 (org) |
| 16 | role | 角色 | role | varchar(50) |  | 字符串 (String) |
| 17 | equivalentratio | 等效持股比例(%) | equivalentratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | period | 期间 | period | varchar(50) |  | 字符串 (String) |
| 19 | periodstockinvest | 长期股权投资 | periodstockinvest | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | availablesalefinalassets | 可供出售金融资产 | availablesalefinalassets | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | tradingday_rate | 交易日汇率 | tradingday_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | pk_custhier | 客商结构 | pk_custhier | varchar(20) |  | 字符串 (String) |
| 23 | key1 | 关键字1 | key1 | varchar(50) |  | 字符串 (String) |
| 24 | key2 | 关键字2 | key2 | varchar(50) |  | 字符串 (String) |
| 25 | key3 | 关键字3 | key3 | varchar(50) |  | 字符串 (String) |
| 26 | key4 | 关键字4 | key4 | varchar(50) |  | 字符串 (String) |
| 27 | key5 | 关键字5 | key5 | varchar(50) |  | 字符串 (String) |
| 28 | key6 | 关键字6 | key6 | varchar(50) |  | 字符串 (String) |
| 29 | key7 | 关键字7 | key7 | varchar(50) |  | 字符串 (String) |
| 30 | key8 | 关键字8 | key8 | varchar(50) |  | 字符串 (String) |
| 31 | key9 | 关键字9 | key9 | varchar(50) |  | 字符串 (String) |
| 32 | key10 | 关键字10 | key10 | varchar(50) |  | 字符串 (String) |
| 33 | def1 | def1 | def1 | varchar(50) |  | 字符串 (String) |
| 34 | def2 | def2 | def2 | varchar(50) |  | 字符串 (String) |
| 35 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 36 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 37 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 38 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |