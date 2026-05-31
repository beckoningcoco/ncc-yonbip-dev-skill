# |<<

**包管理日志信息 (adp_pkgloginfo / nc.vo.uap.distribution.ADPPkgLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/17.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | logid | logid | logid | char(20) | √ | 主键 (UFID) |
| 2 | userid | 用户 | userid | varchar(20) |  | 用户 (user) |
| 3 | groupid | 集团 | groupid | varchar(50) |  | 字符串 (String) |
| 4 | sender | 发送方 | sender | varchar(20) |  | 分布系统目录 (syscatalog) |
| 5 | receiver | 接收方 | receiver | varchar(20) |  | 分布系统目录 (syscatalog) |
| 6 | replyer | 应答方 | replyer | varchar(20) |  | 分布系统目录 (syscatalog) |
| 7 | actiontype | 动作 | actiontype | int |  | 包动作类型 (PkgActionType) |  | 4=发送; |