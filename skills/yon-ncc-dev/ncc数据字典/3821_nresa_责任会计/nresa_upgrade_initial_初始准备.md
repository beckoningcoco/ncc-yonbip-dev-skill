# |<<

**初始准备 (nresa_upgrade_initial / nccloud.vo.nresa.upgrade.NresaUpgradeInitialVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3906.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_initial | 主键 | pk_initial | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(20) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) | √ | 字符串 (String) |
| 4 | check_status | 检查结果 | check_status | int | √ | 检查结果 (CheckEnum) | 1 | 1=未检查; |