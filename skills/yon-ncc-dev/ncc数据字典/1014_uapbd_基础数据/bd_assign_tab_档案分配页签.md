# |<<

**档案分配页签 (bd_assign_tab / nc.vo.bd.assign.AssigntabVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/334.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assign_tab | 主键 | pk_assign_tab | char(20) | √ | 字符串 (String) |
| 2 | mdid | 档案实体 | mdid | char(36) | √ | 实体 (entity) |
| 3 | tabid | 组织页签实体 | tabid | varchar(36) |  | 实体 (entity) |
| 4 | orgrefgetter | 档案参照读取接口 | orgrefgetter | varchar(100) | √ | 字符串 (String) |
| 5 | classmdid | 档案分类实体 | classmdid | char(36) | √ | 实体 (entity) |
| 6 | orgservice | 页签分配服务 | orgservice | varchar(100) | √ | 字符串 (String) |
| 7 | valueeditor | 默认值编辑器 | valueeditor | varchar(100) |  | 字符串 (String) |
| 8 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |