# |<<

**报送订阅规则分类 (iufo_commitsubscribesort / nc.vo.iufo.commitsubscribe.CommitSubscribeSortVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3406.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_commitsubssort | 分类主键 | pk_commitsubssort | char(20) | √ | 主键 (UFID) |
| 2 | name | 分类名称 | name | varchar(50) |  | 字符串 (String) |
| 3 | pk_parent | 上级分类 | pk_parent | varchar(20) |  | 报送订阅规则分类 (报送订阅规则分类) |
| 4 | pk_org | 报表组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |