# |<<

**返利结算单子实体 (sr_settle_b / nc.vo.sr.settle.entity.SettleBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5481.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settle_b | 返利结算单子实体 | pk_settle_b | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 返利计算组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 5 | vjudgeformula | 返利依据 | vjudgeformula | varchar(20) |  | 返利取数函数 (formula) |
| 6 | carsubtypeid | 销售费用单类型 | carsubtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 8 | cbrandid | 品牌 | cbrandid | varchar(20) |  | 品牌档案 (branddoc) |
| 9 | cmatclassid | 物料基本分类 | cmatclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 10 | cmatsaleclassid | 物料销售分类 | cmatsaleclassid | varchar(20) |  | 物料销售分类 (marsaleclass) |
| 11 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | cmarcombineid | 物料组合 | cmarcombineid | varchar(20) |  | 物料组合主实体 (sr_marcombine) |
| 13 | crmvmarcombineid | 返利值计算排除物料组合 | crmvmarcombineid | varchar(20) |  | 物料组合主实体 (sr_marcombine) |
| 14 | njudgevalue | 返利依据值 | njudgevalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nbasevalue | 返利计算基数 | nbasevalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nprice | 返利价格 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nmny | 返利计算金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | vadjustreason | 调整原因 | vadjustreason | varchar(181) |  | 字符串 (String) |
| 19 | nadjustbasevalue | 调整后返利计算基数 | nadjustbasevalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nadjustprice | 调整后返利价格 | nadjustprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nadjustmny | 调整后返利金额 | nadjustmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | cadjustpsnid | 调整人 | cadjustpsnid | varchar(20) |  | 用户 (user) |
| 23 | tadjusttime | 调整时间 | tadjusttime | char(19) |  | 日期时间 (UFDateTime) |
| 24 | vrownote | 备注 | vrownote | varchar(181) |  | 字符串 (String) |
| 25 | bexeflag | 是否已生成下游单据 | bexeflag | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | fcalmodeflag | 返利计算模式 | fcalmodeflag | int |  | 计算模式 (CalMode) |  | 0=返利依据*返利价格; |