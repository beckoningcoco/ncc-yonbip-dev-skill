# |<<

**资产移动配置明细 (pam_displayconfig_b / nc.vo.am.displayconfig.DisplayConfigBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4247.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_displayconfig_b | 主键 | pk_displayconfig_b | char(20) | √ | 主键 (UFID) |
| 2 | field_name | 字段名称 | field_name | varchar(50) |  | 字符串 (String) |
| 3 | field_code | 字段编码 | field_code | varchar(60) |  | 字符串 (String) |
| 4 | field_table | 所属表 | field_table | varchar(50) |  | 字符串 (String) |
| 5 | componetid | 元数据组件ID | componetid | varchar(50) |  | 字符串 (String) |
| 6 | order_result | 排序 | order_result | int |  | 整数 (Integer) | 0 |
| 7 | display_flag | 是否显示 | display_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | display_name | 显示名称 | display_name | varchar(60) |  | 字符串 (String) |