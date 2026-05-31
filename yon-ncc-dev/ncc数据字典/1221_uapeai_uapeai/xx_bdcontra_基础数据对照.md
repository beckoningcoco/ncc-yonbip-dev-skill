# |<<

**基础数据对照 (xx_bdcontra / nc.vo.pfxx.bdconstra.BDConstraVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6384.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contra | 主键 | pk_contra | char(20) | √ | 主键 (UFID) |
| 2 | exsystem | 外部系统 | exsystem | varchar(20) | √ | 外部系统信息 (exsystem) |
| 3 | bdclass | 基础档案分类 | bdclass | varchar(36) | √ | 实体 (entity) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 5 | bdclass2 | 基础档案参照列表 | bdclass2 | varchar(50) |  | 字符串 (String) |
| 6 | pk_orgtype | 组织类型 | pk_orgtype | varchar(20) |  | 组织其它_组织类型 (orgtype) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |