# |<<

**审核要点子表 (sscbd_point_item / nc.vo.sscbd.sscbase.point.SSCPointItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5532.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_point_item | 主键 | pk_point_item | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团名称 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | group_code | 集团编码 | group_code | varchar(50) |  | 字符串 (String) |
| 4 | pk_billtype | 单据类型 | pk_billtype | varchar(20) | √ | 单据类型 (BilltypeVO) |
| 5 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | billtypecode | 单据类型编码 | billtypecode | varchar(50) | √ | 字符串 (String) |