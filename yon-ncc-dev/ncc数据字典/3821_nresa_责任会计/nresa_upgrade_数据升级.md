# |<<

**数据升级 (nresa_upgrade / nccloud.vo.nresa.upgrade.UpgradeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3905.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_upgrade | 主键 | pk_upgrade | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(300) | √ | 字符串 (String) |
| 4 | upgrade_status | 处理状态 | upgrade_status | int | √ | 处理状态 (UpdateStatusEnum) | 1 | 1=未处理; |