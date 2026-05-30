# |<<

**应用升级 (nresa_app_upgrade / nccloud.vo.nresa.upgrade.AppUpgradeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3833.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_app_upgrade | 主键 | pk_app_upgrade | char(20) | √ | 主键 (UFID) |
| 2 | upgrade_result | 升级结果 | upgrade_result | char(1) | √ | 布尔类型 (UFBoolean) |
| 3 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 4 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 5 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 6 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |