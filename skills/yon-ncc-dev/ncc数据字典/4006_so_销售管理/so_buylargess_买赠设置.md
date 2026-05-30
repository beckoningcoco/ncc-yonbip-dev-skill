# |<<

**买赠设置 (so_buylargess / nc.vo.so.mbuylargess.entity.BuyLargessHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5390.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_buylargess | 买赠主表id | pk_buylargess | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | cbuymarid | 物料编码 | cbuymarid | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | cbuyunitid | 单位 | cbuyunitid | varchar(20) |  | 计量单位 (measdoc) |
| 6 | pk_marbasclass | 物料基本分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | pk_marsaleclass | 物料销售分类 | pk_marsaleclass | varchar(20) |  | 物料销售分类 (marsaleclass) |
| 8 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 9 | pk_custclass | 客户基本分类 | pk_custclass | varchar(20) |  | 客户基本分类 (custclass) |
| 10 | pk_custsaleclass | 客户销售分类 | pk_custsaleclass | varchar(20) |  | 客户销售分类 (custsaleclass) |
| 11 | nbuynum | 购买数量 | nbuynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | pk_currinfo | 币种 | pk_currinfo | varchar(20) |  | 币种 (currtype) |
| 13 | islow | 适用下级 | islow | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | cprioritycode | 优先码 | cprioritycode | varchar(40) |  | 字符串 (String) |
| 15 | cpromottypeid | 促销类型 | cpromottypeid | varchar(20) |  | 促销类型定义实体 (scm_promottype) |
| 16 | cmarketactid | 营销活动 | cmarketactid | varchar(20) |  | 营销活动 (campaign) |