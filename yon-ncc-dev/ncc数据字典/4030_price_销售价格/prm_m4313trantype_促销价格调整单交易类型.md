# |<<

**促销价格调整单交易类型 (prm_m4313trantype / nc.vo.price.adjustpromote.trantype.M4313TranTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4657.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | 促销价格调整单交易类型实体 | pk_trantype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 5 | cpromottypeid | 促销类型 | cpromottypeid | varchar(20) |  | 促销类型定义实体 (scm_promottype) |