# |<<

**查询模板 (pub_query_templet / nc.vo.pub.query.md.MDQueryTempletVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4769.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 系统ID | id | char(20) | √ | 主键 (UFID) |
| 2 | description | 模板描述 | description | varchar(1024) |  | 字符串 (String) |
| 3 | fixcondition | 固定条件 | fixcondition | varchar(2000) |  | 字符串 (String) |
| 4 | resid | 资源ID | resid | varchar(50) |  | 字符串 (String) |
| 5 | metaclass | 元数据主实体 | metaclass | varchar(20) |  | 实体 (entity) |
| 6 | parentid | 父模板主键 | parentid | varchar(20) |  | 主键 (UFID) |
| 7 | fixquerytree | 固定查询树 | fixquerytree | varchar(4096) |  | 备注 (Memo) |
| 8 | layer | 研发层次 | layer | int |  | 整数 (Integer) |
| 9 | devorg | 研发机构 | devorg | varchar(20) |  | 字符串 (String) |