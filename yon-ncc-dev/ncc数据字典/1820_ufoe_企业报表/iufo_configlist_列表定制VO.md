# |<<

**列表定制VO (iufo_configlist / nc.vo.iufo.query.ConfigListVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3410.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_configlist | 主键 | pk_configlist | char(20) | √ | 主键 (UFID) |
| 2 | pk_user | 用户 | pk_user | varchar(20) |  | 用户 (user) |
| 3 | pk_task | 任务 | pk_task | varchar(20) |  | 任务 (task) |
| 4 | content | 定制内容 | content | image |  | BLOB (BLOB) |
| 5 | modulename | 模块名称 | modulename | varchar(50) |  | 字符串 (String) |
| 6 | type | 类型 | type | int |  | 整数 (Integer) |