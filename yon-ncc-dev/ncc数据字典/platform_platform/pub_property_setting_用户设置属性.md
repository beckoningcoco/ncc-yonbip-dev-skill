# |<<

**用户设置属性 (pub_property_setting / nc.vo.platform.appsystemplate.PropertySettingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4761.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_property_setting | 主键 | pk_property_setting | char(20) | √ | 主键 (UFID) |
| 2 | user_template_id | 用户列设置id | user_template_id | varchar(20) | √ | 字符串 (String) |
| 3 | property_id | 属性id | property_id | varchar(20) | √ | 字符串 (String) |
| 4 | position | 位置 | position | int |  | 整数 (Integer) |
| 5 | visible | 是否可见 | visible | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | width | 列宽 | width | int | √ | 整数 (Integer) |
| 7 | islock | 是否锁定 | islock | char(1) |  | 布尔类型 (UFBoolean) |