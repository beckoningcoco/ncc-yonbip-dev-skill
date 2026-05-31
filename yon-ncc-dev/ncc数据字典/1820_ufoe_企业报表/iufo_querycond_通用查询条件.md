# |<<

**通用查询条件 (iufo_querycond / nc.vo.iufo.query.IUfoQueryCondVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3487.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_querycond | 主键 | pk_querycond | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | pk_user | 用户 | pk_user | varchar(20) |  | 用户 (user) |
| 4 | modulename | 模块名称 | modulename | varchar(50) |  | 字符串 (String) |
| 5 | defaultcond | 是否默认查询条件 | defaultcond | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | detailcond | 明细查询条件 | detailcond | image |  | BLOB (BLOB) |
| 7 | position | 显示顺序号 | position | int |  | 整数 (Integer) |
| 8 | pk_task | 任务 | pk_task | varchar(20) |  | 任务 (task) |
| 9 | pk_rms | 报表管理结构 | pk_rms | varchar(20) |  | 组织视图-报表管理体系 (orgviewreportsub) |