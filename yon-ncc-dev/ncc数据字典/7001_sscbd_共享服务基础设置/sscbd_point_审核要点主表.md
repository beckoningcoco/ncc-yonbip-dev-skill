# |<<

**审核要点主表 (sscbd_point / nc.vo.sscbd.sscbase.point.SSCPointVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5530.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_point | 主键 | pk_point | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(300) | √ | 多语文本 (MultiLangText) |
| 4 | content | 内容 | content | varchar(300) |  | 字符串 (String) |
| 5 | pk_pointclass | 审核要点分类 | pk_pointclass | varchar(20) | √ | 审核要点分类表 (sscbd_point_class) |
| 6 | pk_applyscope | 适用业务范围 | pk_applyscope | varchar(500) |  | 适用业务范围 (sscbd_apply_scope) |
| 7 | execute_mode | 执行方式 | execute_mode | varchar(50) | √ | 执行方式 (Isenable) |  | 1=智能核查; |