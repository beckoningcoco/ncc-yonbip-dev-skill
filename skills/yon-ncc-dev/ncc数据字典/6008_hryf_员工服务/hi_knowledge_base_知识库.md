# |<<

**知识库 (hi_knowledge_base / nccloud.dto.hryf.knowledge.KnowledgeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2549.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_knowledge_base | 主键 | pk_knowledge_base | char(20) | √ | 主键 (UFID) |
| 2 | title | 问题标题 | title | varchar(200) | √ | 字符串 (String) |
| 3 | type | 问题分类 | type | varchar(20) | √ | 知识库分类(自定义档案) (Defdoc-HRGX0001_0xx) |
| 4 | is_hot | 设为热点 | is_hot | char(1) | √ | 布尔类型 (UFBoolean) |
| 5 | label | 标签 | label | varchar(200) |  | 字符串 (String) |
| 6 | answer | 回复 | answer | text(0) |  | BLOB (BLOB) |
| 7 | link_url | 链接 | link_url | varchar(200) |  | 字符串 (String) |
| 8 | answer_type | 回复类型 | answer_type | int |  | 整数 (Integer) |
| 9 | visits_num | 浏览次数 | visits_num | int |  | 整数 (Integer) |
| 10 | fabulous_num | 点赞次数 | fabulous_num | int |  | 整数 (Integer) |
| 11 | is_enable | 是否启用 | is_enable | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | remark | 备注 | remark | varchar(50) |  | 字符串 (String) |
| 13 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 14 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 15 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 16 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 17 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 18 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |