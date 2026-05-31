# |<<

**价格调整单交易类型 (prm_adjpricetype / nc.vo.price.adjustprice.m4311trantype.entity.M4311TranTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4648.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjustpricetype | 主键 | pk_adjustpricetype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vtrantypecode | 调价交易类型编码 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 4 | ctrantypeid | 调价交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | bstrictmatchflag | 是否严格匹配调价 | bstrictmatchflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | bmatchunitflag | 是否计量单位严格匹配 | bmatchunitflag | char(1) |  | 布尔类型 (UFBoolean) |