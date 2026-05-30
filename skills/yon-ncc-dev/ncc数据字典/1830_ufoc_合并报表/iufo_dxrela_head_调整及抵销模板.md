# |<<

**调整及抵销模板 (iufo_dxrela_head / nc.vo.hbbb.dxrelation.DXRelationHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3424.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dxrela_head | 抵销模板主键 | pk_dxrela_head | char(20) | √ | 主键 (UFID) |
| 2 | pk_dxrela_sort | 所属分类 | pk_dxrela_sort | varchar(20) |  | 模板分组信息 (模板分组信息) |
| 3 | code | 抵销模板编码 | code | varchar(100) |  | 字符串 (String) |
| 4 | name | 模板名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | type | 模板类型 | type | varchar(50) | √ | 抵销模板类型 (enum) | 1 | 1=权益类_控制型投资; |