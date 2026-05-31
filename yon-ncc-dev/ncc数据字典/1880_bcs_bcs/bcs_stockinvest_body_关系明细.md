# |<<

**关系明细 (bcs_stockinvest_body / nc.vo.epm.bcs.stockinvest.BCSStockInvestRelaBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/286.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockinvest_body | 表体主键 | pk_stockinvest_body | char(20) | √ | 主键 (UFID) |
| 2 | investdate | 投资日 | investdate | char(19) |  | 日期 (UFDate) |
| 3 | investproportion | 投资比例变动(%) | investproportion | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | totalstockratio | 累计持股比例(%) | totalstockratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | assessmode | 核算方式 | assessmode | int |  | 整数 (Integer) |
| 6 | autogenervoucher | 自动生成合并报表调整凭证 | autogenervoucher | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | dataoriginflag | 分布式 | dataoriginflag | int |  | 整数 (Integer) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 10 | controlinvest | 控制型投资 | controlinvest | varchar(20) |  | 布尔类型 (UFBoolean) |
| 11 | groupstockratio | 集团持股比例(%) | groupstockratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | combineratio | 合并比例(%) | combineratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | periodstockinvest | 长期股权投资 | periodstockinvest | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | availablesalefinalassets | 可供出售金融资产 | availablesalefinalassets | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 16 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 17 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 18 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |