# |<<

**整合方案交叉表设置选择项 (bd_di_crossitem / nc.vo.bd.intdata.dicrossitem.DICrossSetItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/791.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_item | 排序项主键 | pk_item | varchar(50) | √ | 字符串 (String) |
| 2 | code | 排序项编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 排序项名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | pk_scheme | 所属整合方案 | pk_scheme | varchar(20) |  | 财务数据方案 (dataintschema) |
| 5 | itempk | 维度或度量pk | itempk | varchar(50) |  | 字符串 (String) |
| 6 | itemtype | 排序项类型 | itemtype | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | itemplace | 排序项所在位置 | itemplace | char(1) |  | 布尔类型 (UFBoolean) |