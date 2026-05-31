# |<<

**资源类型 (pub_psn_resource / nc.vo.pub.personalization.ResourceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4765.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_resource | 主键 | pk_resource | char(20) | √ | 主键 (UFID) |
| 2 | pk_module | 所属模块 | pk_module | char(20) | √ | 模块信息 (module) |
| 3 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 4 | name | 名称 | name | varchar(50) | √ | 字符串 (String) |
| 5 | pk_metadata | 关联实体 | pk_metadata | char(36) | √ | 实体 (entity) |
| 6 | regtablename | 分配数据库表名 | regtablename | varchar(50) | √ | 字符串 (String) |
| 7 | prioritypolicy | 查找策略 | prioritypolicy | varchar(50) | √ | 资源查找策略 (资源查找策略) |  | 1=自下而上; |