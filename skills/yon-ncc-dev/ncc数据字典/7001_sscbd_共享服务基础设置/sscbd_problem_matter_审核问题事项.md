# |<<

**审核问题事项 (sscbd_problem_matter / nc.vo.sscbd.sscbase.problemmatter.SSCProblemMatterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5535.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matter | 主键 | pk_matter | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | isuse | 启用状态 | isuse | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_class | 审核问题分类主键 | pk_class | varchar(20) |  | 审核问题分类 (sscbd_problem_class) |
| 6 | pk_sscunit | 共享服务中心主键 | pk_sscunit | varchar(20) |  | 共享服务中心 (sscunit) |
| 7 | serious_level | 严重程度 | serious_level | varchar(50) |  | 严重程度 (seriouslevel) |  | MORESLIGHT=很轻微; |